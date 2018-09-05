package com.dexolabs.cprogramming.utility;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.support.design.internal.BottomNavigationItemView;
import android.support.design.internal.BottomNavigationMenuView;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.content.ContextCompat;
import android.text.Html;
import android.text.Spanned;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;

import com.dexolabs.cprogramming.R;
import com.dexolabs.cprogramming.appdata.Codes;
import com.google.gson.Gson;

import java.lang.reflect.Field;

public class Utils {
    private static final String TAG          = Utils.class.getName();
    private static final String REQUEST_BODY = "Request Body :: ";
    private static final String EMPTY_STRING = "";

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

    public static Bitmap textAsBitmap(String text, float textSize, int textColor) {
        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setTextSize(textSize);
        paint.setColor(textColor);
        paint.setTextAlign(Paint.Align.LEFT);
        float baseline = -paint.ascent(); // ascent() is negative
        int width = (int) (paint.measureText(text) + 0.0f); // round
        int height = (int) (baseline + paint.descent() + 0.0f);
        Bitmap image = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);

        Canvas canvas = new Canvas(image);
        canvas.drawText(text, 0, baseline, paint);
        return image;
    }

    public static void logRequestBody(Object object) {
        if (Log.PRINT) {
            try {
                Log.i(TAG, REQUEST_BODY + objecttoJson(object));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


    public static String objecttoJson(Object object) {
        return new Gson().toJson(object);
    }

    /**
     * Method to assign strings Safely
     *
     * @param assignable
     * @return
     */
    public static String assign(String assignable) {

        return assignable == null || assignable.equalsIgnoreCase("[]") ? EMPTY_STRING : assignable;
    }

    /**
     * Method to assign Strings safely
     *
     * @param assignable
     * @param alternative
     * @return
     */
    public static String assign(String assignable, String alternative) {

        return assignable == null || assignable.isEmpty() ? (alternative == null ? EMPTY_STRING : alternative) : (assignable.equals("null") ? assign(alternative) : assignable);
    }


    public static String parseHtml(String string) {
        string = string.replace("\n", "<br>");
        string = string.replace("   ", "&nbsp;&nbsp;&nbsp;");
        string = string.replace("  ", "&nbsp;&nbsp;");
        return string;
    }


    /**
     * Method used to hide keyboard if outside touched.
     *
     * @param activity
     */

    public static void hideSoftKeyboard(Activity activity) {

        View focusedView = activity.getCurrentFocus();
        if (focusedView == null) return;

        IBinder windowToken = focusedView.getWindowToken();
        if (windowToken == null) return;

        InputMethodManager inputMethodManager = (InputMethodManager) activity
                .getSystemService(Activity.INPUT_METHOD_SERVICE);
        inputMethodManager.hideSoftInputFromWindow(windowToken, 0);
    }

    /**
     * Method to open the Email Activity
     *
     * @param context
     * @param subject
     * @param receivers
     * @param message
     */
    public static void openEmailApp(Activity context, String subject, String receivers, String message) {
        try {
            Utils.hideSoftKeyboard(context);
            Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
            emailIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            String uriText = "mailto:" + Uri.encode(receivers) +
                    "?subject=" + Uri.encode(subject) +
                    "&body=" + Uri.encode(message);
            emailIntent.setData(Uri.parse(uriText));
            context.startActivity(Intent.createChooser(emailIntent, "Send mail using..."));
        } catch (Exception e) {
            Utils.snackBar(context, context.getString(R.string.no_app_found_to_open_the_link));
            e.printStackTrace();
        }
    }

    public static void snackBar(Activity activity, String message) {
        try {
            snackBar(activity, message, Codes.SnackBarType.ERROR);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void snackBar(Activity activity, String message, int type) {
        try {
            snackBar(activity, message, activity.getWindow().getDecorView().findViewById(android.R.id.content), type);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Method to init toast to the User
     *
     * @param activity
     * @param message
     */
    public static void snackBar(final Activity activity, final String message, final View view, final int type) {

        if (activity == null) return;

        activity.runOnUiThread(new Runnable() {
            @Override
            public void run() {

                try {
                    Snackbar snackbar = Snackbar.make(view, message, Snackbar.LENGTH_LONG).setDuration(2500);
                    View view = snackbar.getView();
                    TextView tv = view.findViewById(android.support.design.R.id.snackbar_text);
                    tv.setMaxLines(3);
                    tv.setGravity(Gravity.CENTER_HORIZONTAL);
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
                        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                    }
                    tv.setTextColor(ContextCompat.getColor(activity, R.color.white));
                    view.setBackgroundColor(ContextCompat.getColor(activity, type == Codes.SnackBarType.SUCCESS ? R.color.snackbar_bg_color_success : R.color.snackbar_bg_color_error));
                    snackbar.show();


                } catch (Exception e) {
                    e.printStackTrace();
                }


            }
        });
    }

}
