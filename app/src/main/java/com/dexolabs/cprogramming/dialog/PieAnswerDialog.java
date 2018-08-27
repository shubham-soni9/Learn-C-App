package com.dexolabs.cprogramming.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import com.dexolabs.cprogramming.R;
import com.dexolabs.cprogramming.model.Question;
import com.github.mikephil.charting.animation.Easing;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.LegendEntry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.formatter.PercentFormatter;
import com.github.mikephil.charting.utils.ColorTemplate;
import com.github.mikephil.charting.utils.Utils;

import java.util.ArrayList;
import java.util.List;


/**
 * Developer: Rishabh
 * Dated: 23/07/15.
 */
public class PieAnswerDialog {

    private static final String TAG = PieAnswerDialog.class.getSimpleName();

    private Dialog alertDialog;

    /**
     * The instance of the Activity on which the
     * AlertDialog will be displayed
     */
    private Activity activity;

    /**
     * The receiver to which the AlertDialog
     * will return the CallBacks
     * <p/>
     * Note: listener should be an instance of
     * AlertDialog.Listener
     */
    private Listener listener;

    /**
     * The code to differentiate the various CallBacks
     * from different Dialogs
     */
    private int purpose;

    /**
     * The title to be set on the Dialog
     */
    private String title;

    /**
     * The message to be set on the Dialog
     */
    private String message;

    /**
     * The text to be set on the Action Button
     */
    private String actionButton;

    /**
     * The data to sent via the Dialog from the
     * remote parts of the Activity to other
     * parts
     */
    private Bundle backpack;

    private ArrayList<Question> questionList;

    /**
     * Method to create and display the alert alertDialog
     *
     * @return
     */
    private PieAnswerDialog init() {

        try {

            alertDialog = new Dialog(activity, android.R.style.Theme_Translucent_NoTitleBar);
            alertDialog.setContentView(R.layout.dialog_result_chart);

            Window dialogWindow = alertDialog.getWindow();
            WindowManager.LayoutParams layoutParams = dialogWindow.getAttributes();
            layoutParams.dimAmount = 0.6f;

            dialogWindow.getAttributes().windowAnimations = R.style.CustomDialog;

            dialogWindow.addFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND);
            alertDialog.setCancelable(true);
            alertDialog.setCanceledOnTouchOutside(true);

            Button btnAction = alertDialog.findViewById(R.id.btnAction);
            btnAction.setText(actionButton);
            btnAction.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {

                    alertDialog.dismiss();

                    if (listener != null)
                        listener.performPostAlertAction(purpose, backpack);
                }
            });
            PieChart pieChart = alertDialog.findViewById(R.id.piechart);
            pieChart.setUsePercentValues(true);

            int correct = 0, unanswered = 0, incorrect = 0;
            int selectedOption, answerKey;

            if (questionList != null) {
                for (Question question : questionList) {
                    selectedOption = question.getSelectedOption();

                    if (question.getSelectedOption() != 0) {
                        answerKey = question.getAnswer();
                        if (selectedOption == answerKey) {
                            correct++;
                        } else {
                            incorrect++;
                        }
                    } else {
                        unanswered++;
                    }
                }
            }

            ArrayList<PieEntry> yvalues = new ArrayList<>();
            if (correct != 0)
                yvalues.add(new PieEntry(correct, 0));

            if (incorrect != 0)
                yvalues.add(new PieEntry(incorrect, 1));

            if (unanswered != 0)
                yvalues.add(new PieEntry(unanswered, 2));

            PieDataSet dataSet = new PieDataSet(yvalues, "Test Results");
            final int[] PIE_COLORS = {Color.rgb(0, 204, 102), Color.rgb(255, 77, 77), Color.rgb(191, 128, 64)};
            final String[] PIE_TEXTS = {"Correct", "Incorrect", "Unanswered"};

            dataSet.setColors(PIE_COLORS);
            PieData data = new PieData(dataSet);
            data.setValueFormatter(new PercentFormatter());
            data.setValueTextSize(Utils.convertDpToPixel(5));
            data.setValueTextColor(ContextCompat.getColor(activity, R.color.white_100));
            pieChart.setData(data);
            pieChart.getDescription().setText("");


            pieChart.animateY(3000, Easing.EasingOption.EaseInOutBack);


            List<LegendEntry> entries = new ArrayList<>();

            for (int i = 0; i < Math.min(PIE_COLORS.length, PIE_TEXTS.length); i++) {
                final LegendEntry entry = new LegendEntry();
                entry.formColor = PIE_COLORS[i];
                entry.label = PIE_TEXTS[i];

                if (entry.formColor == ColorTemplate.COLOR_SKIP ||
                        entry.formColor == 0)
                    entry.form = Legend.LegendForm.NONE;
                else if (entry.formColor == ColorTemplate.COLOR_NONE)
                    entry.form = Legend.LegendForm.EMPTY;

                entries.add(entry);
            }
            pieChart.getLegend().setCustom(entries);
            pieChart.getLegend().setVerticalAlignment(Legend.LegendVerticalAlignment.BOTTOM);
            pieChart.getLegend().setHorizontalAlignment(Legend.LegendHorizontalAlignment.CENTER);
            pieChart.getLegend().setXEntrySpace(Utils.convertDpToPixel(10));
            pieChart.getLegend().setFormSize(Utils.convertDpToPixel(8));

        } catch (Exception e) {

            e.printStackTrace();
        }

        return this;
    }

    /**
     * Method to init the initialized alertDialog
     */
    public void show() {

        // Check if activity lives
        if (activity != null)
            // Check if alertDialog contains data
            if (alertDialog != null) {
                try {
                    // Show the Dialog
                    alertDialog.show();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
    }

    /**
     * Method to dismiss the AlertDialog, if possible
     */
    public void dismiss() {

        // Check if activity lives
        if (activity != null)
            // Check if the Dialog is null
            if (alertDialog != null)
                // Check whether the alertDialog is visible
                if (alertDialog.isShowing()) {
                    try {
                        // Dismiss the Dialog
                        alertDialog.dismiss();
                        alertDialog = null;
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
    }

    public boolean isShowing() {
        // Check if activity lives
        if (activity != null)
            // Check if the Dialog is null
            if (alertDialog != null)
                // Check whether the alertDialog is visible
                try {
                    return alertDialog.isShowing();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
        return false;
    }


    /**
     * Interfaces the events from the AlertDialog
     * to the Calling Context
     */
    public interface Listener {

        /**
         * Override this method to listen to
         * the events fired from AlertDialog
         *
         * @param purpose
         * @param backpack
         */
        void performPostAlertAction(int purpose, Bundle backpack);
    }

    /**
     * Class to help building the Alert Dialog
     */
    public static class Builder {

        private PieAnswerDialog alertDialog = new PieAnswerDialog();

        /**
         * Constructor to build a alertDialog for Activity
         *
         * @param activity
         */
        public Builder(Activity activity) {

            alertDialog.activity = activity;

            if (activity instanceof Listener)
                alertDialog.listener = (Listener) activity;
        }

        /**
         * Constructor to build a alertDialog for Fragment
         *
         * @param fragment
         */
        public Builder(Fragment fragment) {

            alertDialog.activity = fragment.getActivity();

            if (fragment instanceof Listener)
                alertDialog.listener = (Listener) fragment;
        }

        /**
         * Sets the a unique purpose code to differentiate
         * between the CallBacks
         *
         * @param purpose
         * @return
         */
        public Builder purpose(int purpose) {
            alertDialog.purpose = purpose;
            return this;
        }

        /**
         * Sets the a custom listener to receive the CallBacks
         *
         * @param listener
         * @return
         */
        public Builder listener(Listener listener) {
            alertDialog.listener = listener;
            return this;
        }

        /**
         * Set the data to be sent via callback
         *
         * @param backpack
         * @return
         */
        public Builder backpack(Bundle backpack) {
            alertDialog.backpack = backpack;
            return this;
        }


        /**
         * Set the message for the AlertDialog
         *
         * @param resourceId
         * @return
         */
        public Builder title(int resourceId) {
            return title(getString(resourceId));
        }

        /**
         * Set the message for the AlertDialog
         *
         * @return
         */
        public Builder setQuestionList(ArrayList<Question> questionList) {
            alertDialog.questionList = questionList;
            return this;
        }

        /**
         * Set the message for the AlertDialog
         *
         * @param title
         * @return
         */
        public Builder title(String title) {
            alertDialog.title = title;
            return this;
        }

        /**
         * Set the message for the AlertDialog
         *
         * @param resourceId
         * @return
         */
        public Builder message(int resourceId) {
            return message(getString(resourceId));
        }

        /**
         * Set the message for the AlertDialog
         *
         * @param message
         * @return
         */
        public Builder message(String message) {
            alertDialog.message = message;
            return this;
        }

        /**
         * Set the actionButton for the AlertDialog
         *
         * @param resourceId
         * @return
         */
        public Builder button(int resourceId) {
            return button(getString(resourceId));
        }

        /**
         * Set the actionButton for the AlertDialog
         *
         * @param button
         * @return
         */
        public Builder button(String button) {
            alertDialog.actionButton = button;
            return this;
        }

        /**
         * Method to build an AlertDialog and display
         * it on the screen. The instance returned can
         * be used to manipulate the alertDialog in future.
         *
         * @return
         */
        public PieAnswerDialog build() {
            return alertDialog.init();
        }

        /**
         * Method to retrieve a String Resource
         *
         * @param resourceId
         * @return
         */
        private String getString(int resourceId) {
            return alertDialog.activity.getString(resourceId);
        }
    }
}


