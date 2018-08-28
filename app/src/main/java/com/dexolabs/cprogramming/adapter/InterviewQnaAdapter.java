package com.dexolabs.cprogramming.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.dexolabs.cprogramming.InterviewQnaPagerFragment;

import java.util.LinkedHashMap;

public class InterviewQnaAdapter extends FragmentPagerAdapter {
    private LinkedHashMap<String, String> mQuestionList;
    private String[]                      questionTitleList;

    /**
     * constructor for all agents pager adapter
     *
     * @param fragmentManager the provided fragment manager
     */
    public InterviewQnaAdapter(final FragmentManager fragmentManager, final LinkedHashMap<String, String> mQuestionList) {
        super(fragmentManager);
        this.mQuestionList = mQuestionList;
        this.questionTitleList = mQuestionList.keySet().toArray(new String[mQuestionList.size()]);
    }


    @Override
    public int getCount() {
        return mQuestionList.size();
    }

    @Override
    public Fragment getItem(final int position) {
        return InterviewQnaPagerFragment.newInstance(questionTitleList[position].trim(), mQuestionList.get(questionTitleList[position]));
    }
}
