package com.dexolabs.cprogramming;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.dexolabs.cprogramming.appdata.Codes;
import com.dexolabs.cprogramming.appdata.Constant;
import com.dexolabs.cprogramming.appdata.Keys;
import com.dexolabs.cprogramming.data.Dependencies;
import com.dexolabs.cprogramming.dialog.CommonDialogWithList;
import com.dexolabs.cprogramming.structure.BaseFragment;
import com.dexolabs.cprogramming.utility.Transition;
import com.dexolabs.cprogramming.utility.Utils;
import com.flask.colorpicker.ColorPickerView;
import com.flask.colorpicker.OnColorSelectedListener;
import com.flask.colorpicker.builder.ColorPickerClickListener;
import com.flask.colorpicker.builder.ColorPickerDialogBuilder;

import java.util.ArrayList;

public class MoreFragment extends BaseFragment implements View.OnClickListener {
    private Context  mContext;
    private TextView tvDifferences, tvPrecedence, tvReportBug, tvSuggestion, tvReferences, tvThemes, tvExit;
    private Activity activity;

    public static MoreFragment newInstance() {
        return new MoreFragment();
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mContext = context;
        activity = (Activity) mContext;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_more, container, false);
        initFragment(rootView);
        return rootView;
    }

    private void initFragment(ViewGroup rootView) {
        tvDifferences = rootView.findViewById(R.id.tvDifferences);
        tvPrecedence = rootView.findViewById(R.id.tvPrecedence);
        tvReportBug = rootView.findViewById(R.id.tvReportBug);
        tvSuggestion = rootView.findViewById(R.id.tvSuggestion);
        tvReferences = rootView.findViewById(R.id.tvReferences);
        tvThemes = rootView.findViewById(R.id.tvThemes);
        tvExit = rootView.findViewById(R.id.tvExit);
        Utils.setOnClickListener(this, tvPrecedence, tvDifferences, tvReportBug, tvSuggestion, tvReferences, tvThemes,tvExit);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tvDifferences:
                openDifferenceScreen();
                break;
            case R.id.tvPrecedence:
                openPrecedenceScreen();
                break;
            case R.id.tvReportBug:
                reportBug();
                break;
            case R.id.tvSuggestion:
                giveSuggestions();
                break;
            case R.id.tvReferences:
                Transition.startActivity(activity, ReferenceActivity.class);
                break;
            case R.id.tvThemes:
                openThemeColorChooser();
                break;
            case R.id.tvExit:
                activity.finishAffinity();
                break;
        }
    }

    private void openThemeColorChooser() {
        ColorPickerDialogBuilder
                .with(activity)
                .setTitle("Choose color")
                .initialColor(Dependencies.getThemeColor(activity))
                .wheelType(ColorPickerView.WHEEL_TYPE.FLOWER)
                .density(12)
                .setOnColorSelectedListener(new OnColorSelectedListener() {
                    @Override
                    public void onColorSelected(int selectedColor) {
                    }
                })
                .setPositiveButton(R.string.save, new ColorPickerClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int selectedColor, Integer[] allColors) {
                        Dependencies.saveThemeColor(activity, selectedColor);
                        applyThemeColor();
                    }
                })
                .setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                })
                .build()
                .show();
    }

    private void changeColorOptions() {
        ArrayList<String> optionList = new ArrayList<>();
        optionList.add(getString(R.string.background_toolbar));
        CommonDialogWithList.with(activity).show(getString(R.string.select_type),
                                                 optionList, new CommonDialogWithList.OnListItemClickListener() {
                    @Override
                    public void onListItemSelected(final int pos, final String item) {
                        openThemeColorChooser();
                    }
                });
    }

    private void applyThemeColor() {
        Intent intent = activity.getIntent();
        activity.finish();
        activity.overridePendingTransition(0, 0);
        activity.startActivity(intent);
        activity.overridePendingTransition(0, 0);
    }

    private void giveSuggestions() {
        String subject = getString(R.string.application_name) + " : " + getString(R.string.suggestions);
        Utils.openEmailApp(activity, subject, Constant.EMAIL, "");
    }

    private void reportBug() {
        String subject = getString(R.string.application_name) + " : " + getString(R.string.report_a_bug);
        Utils.openEmailApp(activity, subject, Constant.EMAIL, "");
    }

    private void openPrecedenceScreen() {
        openWebView("operator_precedence.html", getString(R.string.operator_precedence));
    }

    private void openDifferenceScreen() {
        Transition.startActivity(activity, DifferenceActivity.class);
    }


    private void openWebView(String webUrl, String title) {
        Bundle bundle = new Bundle();
        bundle.putString(Keys.Extras.WEB_TITLE, title);
        bundle.putString(Keys.Extras.WEB_URL, webUrl);
        Transition.transitForResult((Activity) mContext, WebViewActivity.class, Codes.RequestCode.OPEN_WEB_VIEW, bundle);
    }
}
