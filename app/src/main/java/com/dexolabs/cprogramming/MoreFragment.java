package com.dexolabs.cprogramming;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.dexolabs.cprogramming.appdata.Codes;
import com.dexolabs.cprogramming.appdata.Keys;
import com.dexolabs.cprogramming.structure.BaseFragment;
import com.dexolabs.cprogramming.utility.Transition;
import com.dexolabs.cprogramming.utility.Utils;

public class MoreFragment extends BaseFragment implements View.OnClickListener {
    private Context  mContext;
    private TextView tvDifferences, tvPrecedence;
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
        Utils.setOnClickListener(this, tvPrecedence, tvDifferences);
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
        }
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
