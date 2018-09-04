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

import com.dexolabs.cprogramming.appdata.Codes;
import com.dexolabs.cprogramming.structure.BaseFragment;
import com.dexolabs.cprogramming.utility.Transition;
import com.dexolabs.cprogramming.utility.Utils;

public class MoreFragment extends BaseFragment implements View.OnClickListener {
    private Context      mContext;
    private LinearLayout llDifferences;
    private Activity     activity;

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
        llDifferences = rootView.findViewById(R.id.llDifferences);
        Utils.setOnClickListener(this, llDifferences);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.llDifferences:
                openDifferenceScreen();
                break;
        }
    }

    private void openDifferenceScreen() {
        Transition.transitForResult(activity, DifferenceActivity.class, Codes.RequestCode.OPEN_DIFFERENCE_ACTIVITY);
    }
}
