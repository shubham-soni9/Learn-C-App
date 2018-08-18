package com.dexolabs.cprogramming;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dexolabs.cprogramming.adapter.TutorialPagerAdapter;
import com.dexolabs.cprogramming.data.TutorialData;
import com.dexolabs.cprogramming.model.TutorialModel;

import java.util.ArrayList;

public class TutorialFragment extends Fragment {
    private ViewPager                viewPager;
    private TabLayout                tabLayout;
    private Context                  mContext;
    private ArrayList<TutorialModel> tutorialModelList;
    private TutorialPagerAdapter     tutorialPagerAdapter;

    public static TutorialFragment newInstance() {
        return new TutorialFragment();
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mContext = context;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_tutorial, container, false);
        initFragment(rootView);
        getBundle();
        return rootView;
    }

    private void getBundle() {
        tutorialModelList = TutorialData.getTutorialData();
        FragmentManager fragmentManager = getFragmentManager();
        tutorialPagerAdapter = new TutorialPagerAdapter(fragmentManager, tutorialModelList);
        viewPager.setAdapter(tutorialPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void initFragment(ViewGroup rootView) {
        viewPager = rootView.findViewById(R.id.fragment_tutorial_pager);
        tabLayout = rootView.findViewById(R.id.fragment_tutorial_tab);

    }
}
