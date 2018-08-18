package com.dexolabs.cprogramming.utility;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.view.View;
import android.widget.EditText;

public class ViewUtils {
    public static boolean isVisible(View view) {
        return view.getVisibility() == View.VISIBLE;
    }

    public static boolean isGone(View view) {
        return view.getVisibility() == View.GONE;
    }

    public static boolean isInVisible(View view) {
        return view.getVisibility() == View.INVISIBLE;
    }

    public static void show(View... views) {
        for (View view : views) {
            view.setVisibility(View.VISIBLE);
        }
    }

    public static void hide(View... views) {
        for (View view : views) {
            view.setVisibility(View.GONE);
        }
    }

    public static boolean isRTL(Context context) {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.JELLY_BEAN_MR1) {
            return false;
        }
        Configuration config = context.getResources().getConfiguration();
        return config.getLayoutDirection() == View.LAYOUT_DIRECTION_RTL;
    }

    public static void setCompoundDrawables(int start, int top, int end, int bottom, EditText... mViews) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
            for (EditText mView : mViews) {
                mView.setCompoundDrawablesRelativeWithIntrinsicBounds(start, top, end, bottom);
            }
        } else {
            for (EditText mView : mViews) {
                mView.setCompoundDrawablesWithIntrinsicBounds(start, top, end, bottom);
            }
        }
    }

    public static void setInputType(int inputType, EditText... views) {
        for (EditText mView : views) {
            mView.setInputType(inputType);
        }
    }

    public static void setFocusableInTouchMode(boolean isFocusable, View... views) {
        for (View view : views) {
            view.setFocusableInTouchMode(isFocusable);
        }
    }

    public static void setPadding(View mView, int left, int top, int right, int bottom) {
        Context mViewContext = mView.getContext();
        mView.setPadding(Utils.dpToPx(mViewContext, left), Utils.dpToPx(mView.getContext(), top),
                Utils.dpToPx(mViewContext, right), Utils.dpToPx(mViewContext, bottom));
    }
}
