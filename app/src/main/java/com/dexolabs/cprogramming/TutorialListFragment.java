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

import java.util.TreeMap;

public class TutorialListFragment extends BaseFragment {
    private Context                 mContext;
    private RecyclerView            rvTutorialList;
    private TutorialListAdapter     tutorialListAdapter;
    private TreeMap<String, String> tutorialList;

    public static TutorialListFragment newInstance(TreeMap<String, String> tutorialList) {
        TutorialListFragment tutorialListFragment = new TutorialListFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("tutorial_list", tutorialList);
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
        tutorialList = (TreeMap<String, String>) bundle.getSerializable("tutorial_list");
    }

    private void initFragment(ViewGroup rootView) {
        rvTutorialList = rootView.findViewById(R.id.rvTutorialList);
        rvTutorialList.setLayoutManager(new LinearLayoutManager(mContext, LinearLayoutManager.VERTICAL, false));
        tutorialListAdapter = new TutorialListAdapter(tutorialList);
        rvTutorialList.setAdapter(tutorialListAdapter);
    }
}
