package com.dexolabs.c;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;

public class TutorialPagerAdapter extends FragmentStatePagerAdapter {
    private final ArrayList<Fragment> mFragmentList      = new ArrayList<>();
    private final ArrayList<String>   mFragmentTitleList = new ArrayList<>();


    /**
     * constructor for all agents pager adapter
     *
     * @param fragmentManager the provided fragment manager
     */
    public TutorialPagerAdapter(final FragmentManager fragmentManager, final ArrayList<TutorialModel> tutorialData) {
        super(fragmentManager);
        for (TutorialModel tutorialModel : tutorialData) {
            mFragmentTitleList.add(tutorialModel.getHeading());
            mFragmentList.add(TutorialListFragment.newInstance(tutorialModel.getTutorialOptions()));
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

    @Override
    public CharSequence getPageTitle(int position) {
        return mFragmentTitleList.get(position);
    }
}
