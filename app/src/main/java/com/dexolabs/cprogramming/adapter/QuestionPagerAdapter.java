package com.dexolabs.cprogramming.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.dexolabs.cprogramming.McqFragment;
import com.dexolabs.cprogramming.listener.OnQuestionListener;
import com.dexolabs.cprogramming.model.Question;

import java.util.ArrayList;

public class QuestionPagerAdapter extends FragmentPagerAdapter {
    private ArrayList<Question> mQuestionList = new ArrayList<>();
    private FragmentManager    fragmentManager;
    private OnQuestionListener onQuestionListener;

    /**
     * constructor for all agents pager adapter
     *
     * @param fragmentManager the provided fragment manager
     */
    public QuestionPagerAdapter(final OnQuestionListener onQuestionListener, final FragmentManager fragmentManager, final ArrayList<Question> questions) {
        super(fragmentManager);
        this.mQuestionList = questions;
        this.onQuestionListener = onQuestionListener;
        this.fragmentManager = fragmentManager;
    }


    @Override
    public int getCount() {
        return mQuestionList.size();
    }

    @Override
    public Fragment getItem(final int position) {
        return McqFragment.newInstance(onQuestionListener, mQuestionList.get(position));
    }
}
