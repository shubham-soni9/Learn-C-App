package com.dexolabs.cprogramming.utility;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.design.internal.BottomNavigationItemView;
import android.support.design.internal.BottomNavigationMenuView;
import android.support.design.widget.BottomNavigationView;
import android.text.Html;
import android.text.Spanned;
import android.util.TypedValue;
import android.view.View;

import java.lang.reflect.Field;

public class Utils {
    private static final String TAG = Utils.class.getName();

    @SuppressLint("RestrictedApi")
    public static void removeShiftMode(BottomNavigationView view) {
        //this will remove shift mode for bottom navigation view
        BottomNavigationMenuView menuView = (BottomNavigationMenuView) view.getChildAt(0);
        try {
            Field shiftingMode = menuView.getClass().getDeclaredField("mShiftingMode");
            shiftingMode.setAccessible(true);
            shiftingMode.setBoolean(menuView, false);
            shiftingMode.setAccessible(false);
            for (int i = 0; i < menuView.getChildCount(); i++) {
                BottomNavigationItemView item = (BottomNavigationItemView) menuView.getChildAt(i);
//                item.setShiftingMode(false);
                // set once again checked value, so view will be updated
                item.setChecked(item.getItemData().isChecked());

            }

        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    /**
     * Method to set same OnClickListener on multiple views
     *
     * @param listener
     * @param views
     */
    public static void setOnClickListener(View.OnClickListener listener, View... views) {

        for (View view : views)
            view.setOnClickListener(listener);
    }

    /**
     * Method to convert the value from
     * density pixels to pixels
     *
     * @param dpValue
     * @return
     */
    public static int dpToPx(Context context, float dpValue) {

        return (int) TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP, dpValue,
                context.getResources().getDisplayMetrics()
        );
    }

    public static Spanned fromHtml(String html) {
        Spanned result;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
            result = Html.fromHtml(html, Html.FROM_HTML_MODE_LEGACY);
        } else {
            result = Html.fromHtml(html);
        }
        return result;
    }

    public static void setEnabled(final boolean isEnabled, View... views) {
        for (View view : views) {
            view.setEnabled(isEnabled);
        }
    }
}
