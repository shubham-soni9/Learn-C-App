package com.dexolabs.cprogramming.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.dexolabs.cprogramming.McqFragment;
import com.dexolabs.cprogramming.TestListFragment;
import com.dexolabs.cprogramming.TutorialListFragment;
import com.dexolabs.cprogramming.model.Question;

import java.util.ArrayList;

public class QuestionPagerAdapter extends FragmentStatePagerAdapter {
    private final ArrayList<Fragment> mFragmentList = new ArrayList<>();


    /**
     * constructor for all agents pager adapter
     *
     * @param fragmentManager the provided fragment manager
     */
    public QuestionPagerAdapter(final FragmentManager fragmentManager, final ArrayList<Question> questions) {
        super(fragmentManager);
        for (Question question : questions) {
            mFragmentList.add(McqFragment.newInstance(question));
        }
    }

    @Override
    public Fragment getItem(final int position) {
        return mFragmentList.get(position);
    }

    @Override
    public int getCount() {
        return mFragmentList.size();
    }

}
