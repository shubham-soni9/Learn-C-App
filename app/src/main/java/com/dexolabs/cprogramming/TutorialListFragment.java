package com.dexolabs.cprogramming;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dexolabs.cprogramming.adapter.TutorialListAdapter;
import com.dexolabs.cprogramming.appdata.Keys;
import com.dexolabs.cprogramming.model.TutorialModel;
import com.dexolabs.cprogramming.structure.BaseFragment;

public class TutorialListFragment extends BaseFragment {
    private Context             mContext;
    private RecyclerView        rvTutorialList;
    private TutorialListAdapter tutorialListAdapter;
    private TutorialModel       tutorialModel;

    public static TutorialListFragment newInstance(TutorialModel tutorialModel) {
        TutorialListFragment tutorialListFragment = new TutorialListFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable(Keys.Extras.TUTORIAL_LIST, tutorialModel);
        tutorialListFragment.setArguments(bundle);
        return tutorialListFragment;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mContext = context;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_tutorial_list, container, false);
        getData();
        initFragment(rootView);
        return rootView;
    }

    private void getData() {
        Bundle bundle = getArguments();
        if (bundle != null) {
            tutorialModel = bundle.getParcelable(Keys.Extras.TUTORIAL_LIST);
        }
    }

    private void initFragment(ViewGroup rootView) {
        rvTutorialList = rootView.findViewById(R.id.rvTutorialList);
        rvTutorialList.setLayoutManager(new LinearLayoutManager(mContext, LinearLayoutManager.VERTICAL, false));
        tutorialListAdapter = new TutorialListAdapter(mContext, tutorialModel.getTutorialOptions(), false);
        rvTutorialList.setAdapter(tutorialListAdapter);
    }
}
