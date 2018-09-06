package com.dexolabs.cprogramming.data;

import android.content.Context;

import com.dexolabs.cprogramming.R;
import com.dexolabs.cprogramming.appdata.Keys;
import com.dexolabs.cprogramming.utility.Prefs;

/**
 * Fetches data for which the App is dependent to communicate with Server
 *
 * @author Rishabh
 */
public class Dependencies {

    public static int getThemeColor(Context context) {
        return Prefs.with(context).getInt(Keys.Prefs.THEME_COLOR, R.color.default_theme_color);
    }

    public static void saveThemeColor(Context context, int color) {
        Prefs.with(context).save(Keys.Prefs.THEME_COLOR, color);
    }

}
