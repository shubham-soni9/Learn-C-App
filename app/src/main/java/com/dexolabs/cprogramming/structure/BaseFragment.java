package com.dexolabs.cprogramming.structure;

import android.support.v4.app.Fragment;

import java.lang.reflect.Field;

/**
 * Developer: Rishabh
 * Dated: 13/11/15.
 */
public abstract class BaseFragment extends Fragment {

    @Override
    public void onDetach() {
        super.onDetach();

        try {
            Field childFragmentManager = Fragment.class.getDeclaredField("mChildFragmentManager");
            childFragmentManager.setAccessible(true);
            childFragmentManager.set(this, null);

        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
