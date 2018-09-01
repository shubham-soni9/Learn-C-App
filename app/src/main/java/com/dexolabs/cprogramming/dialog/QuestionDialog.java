package com.dexolabs.cprogramming.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.dexolabs.cprogramming.R;
import com.dexolabs.cprogramming.utility.Utils;

import org.sufficientlysecure.htmltextview.HtmlTextView;

import java.util.LinkedHashMap;


/**
 * Class that holds ready to use dialogs
 *
 * @author Rishabh
 */
public class QuestionDialog {

    private static final String TAG = QuestionDialog.class.getSimpleName();

    private Dialog optionsDialog;

    /*
     * The context which would listen to the Events
     * of the AlertDialog (must be an implementation of
     * Listener)
     */
    private Listener listener;

    /*
     * The activity on which the AlertDialog would be displayed
     */
    private Activity activity;

    /*
     * A unique purpose code to identify the action for which
     * the Dialog is Created
     */
    private int purposeCode;

    // The title for the Options Dialog
    private String title;
    // The message to be conveyed to the User
    private String message;
    // The text for Ok button
    private String positiveButton;
    // The text for Cancel button
    private String negativeButton;

    private Bundle backpack;
    private int currentPosition = 0;
    private LinkedHashMap<String, String> questionList;
    private String[]                      questionTitleList;
    private Button                        btnOk;
    private Button                        btnCancel;
    private HtmlTextView                  tvMessage;
    private TextView                      tvQuestionNumber;
    private TextView                      tvTitle;
    private ImageButton                   ibClose;

    /**
     * Method to showOn a multi-event Dialog
     */
    private QuestionDialog init() {

        try {

            optionsDialog = new Dialog(activity, android.R.style.Theme_Translucent_NoTitleBar);
            optionsDialog.setContentView(R.layout.dialog_question);

            final Window dialogWindow = optionsDialog.getWindow();
            WindowManager.LayoutParams layoutParams = dialogWindow.getAttributes();
            layoutParams.dimAmount = 0.6f;

            dialogWindow.getAttributes().windowAnimations = R.style.CustomDialog;

            dialogWindow.addFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND);
            optionsDialog.setCancelable(true);
            optionsDialog.setCanceledOnTouchOutside(true);

            tvTitle = optionsDialog.findViewById(R.id.tvTitle);
            tvMessage = optionsDialog.findViewById(R.id.tvMessage);
            tvQuestionNumber = optionsDialog.findViewById(R.id.tvQuestionNumber);

            btnOk = optionsDialog.findViewById(R.id.btnOk);
            btnCancel = optionsDialog.findViewById(R.id.btnCancel);
            ibClose = optionsDialog.findViewById(R.id.ibClose);
            btnOk.setText(positiveButton);
            btnCancel.setText(negativeButton);
            updateData();
            ibClose.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    optionsDialog.dismiss();
                }
            });
            btnOk.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    showNextQuestion();

                }
            });

            btnCancel.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    showPreviousQuestion();
                }
            });

        } catch (Exception e) {
            e.printStackTrace();
        }

        return this;
    }

    private void updateData() {
        if (currentPosition == 0) {
            btnCancel.setEnabled(false);
        }
        if (currentPosition == questionTitleList.length - 1) {
            btnOk.setEnabled(false);
        }

        tvTitle.setText(questionTitleList[currentPosition]);
        tvMessage.setHtml(Utils.parseHtml(questionList.get(questionTitleList[currentPosition])));
        tvQuestionNumber.setText(String.valueOf(currentPosition + 1));
    }

    private void showNextQuestion() {
        if ((currentPosition + 1) < questionList.size()) {
            currentPosition++;
        }
        updateData();
    }

    private void showPreviousQuestion() {
        if ((currentPosition - 1) > 0) {
            currentPosition--;
        }
        updateData();
    }

    /**
     * Method to init the initialized dialog
     */
    public void show() {

        // Check if activity lives
        //May throw BadTokenException if activity is finished
        try {
            if (activity != null)
                // Check if dialog contains data
                if (optionsDialog != null)
                    // Show the Dialog
                    optionsDialog.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Listener to listen to the events when a main_button
     * on the Options Dialog was pressed
     * <p>
     * Developer: Rishabh
     * Dated: 19/05/15.
     */
    public interface Listener {

        /**
         * Override this method to perform operations
         * after OK button was pressed
         *
         * @param purpose
         */
        void performPositiveAction(int purpose, Bundle backpack);


        /**
         * Override this method to perform operations
         * after CANCEL button was pressed
         *
         * @param purpose
         */
        void performNegativeAction(int purpose, Bundle backpack);
    }

    /**
     * Class to build the OptionsDialog
     */
    public static class Builder {

        private QuestionDialog optionsDialog = new QuestionDialog();

        /**
         * Constructor to initialize the OptionsDialog
         * (for an Activity)
         *
         * @param activity
         */
        public Builder(Activity activity) {

            optionsDialog.activity = activity;

            if (activity instanceof Listener)
                optionsDialog.listener = (Listener) activity;
        }

        /**
         * Constructor to initialize the OptionsDialog
         * (for a Fragment)
         *
         * @param fragment
         */
        public Builder(Fragment fragment) {

            optionsDialog.activity = fragment.getActivity();

            if (fragment instanceof Listener)
                optionsDialog.listener = (Listener) fragment;
        }

        /**
         * Method to set purpose code to identify the Dialog
         *
         * @param purposeCode
         * @return
         */
        public Builder purpose(int purposeCode) {
            optionsDialog.purposeCode = purposeCode;
            return this;
        }

        /**
         * Method to retrieve the String from a resource
         *
         * @param resourceId
         * @return
         */
        private String getString(int resourceId) {
            return optionsDialog.activity.getString(resourceId);
        }

        /**
         * Method to set a custom listener to listen
         * the events from OptionsDialog
         *
         * @param listener
         * @return
         */
        public Builder listener(Listener listener) {
            optionsDialog.listener = listener;
            return this;
        }

        /**
         * Method to set a backpack containing the data for
         * the intended action
         *
         * @param backpack
         * @return
         */
        public Builder backpack(Bundle backpack) {
            optionsDialog.backpack = backpack;
            return this;
        }

        /**
         * Method to set title to the Title
         *
         * @param resourceId
         * @return
         */
        public Builder title(int resourceId) {
            return title(getString(resourceId));
        }

        /**
         * Method to set title to the Title
         *
         * @param title
         * @return
         */
        public Builder title(String title) {
            optionsDialog.title = title;
            return this;
        }

        /**
         * Method to set message to the Dialog
         *
         * @param resourceId
         * @return
         */
        public Builder message(int resourceId) {
            return message(getString(resourceId));
        }

        /**
         * Method to set message to the Dialog
         *
         * @param message
         * @return
         */
        public Builder message(String message) {
            optionsDialog.message = message;
            return this;
        }

        /**
         * Method to set message to the Dialog
         *
         * @param currentPosition
         * @return
         */
        public Builder currentPosition(int currentPosition) {
            optionsDialog.currentPosition = currentPosition;
            return this;
        }

        /**
         * Method to set text to the Positive Button
         *
         * @return
         */
        public Builder positiveButton(int resourcedId) {
            return positiveButton(getString(resourcedId));
        }

        /**
         * Method to set text to the Positive Button
         *
         * @param buttonText
         * @return
         */
        public Builder positiveButton(String buttonText) {
            optionsDialog.positiveButton = buttonText;
            return this;
        }

        /**
         * Method to set text to the Positive Button
         *
         * @param questionList
         * @return
         */
        public Builder questionDataList(LinkedHashMap<String, String> questionList) {
            optionsDialog.questionList = questionList;
            optionsDialog.questionTitleList = questionList.keySet().toArray(new String[questionList.size()]);
            return this;
        }

        /**
         * Method to set Text to the Negative Button
         *
         * @param resourceId
         * @return
         */
        public Builder negativeButton(int resourceId) {
            return negativeButton(getString(resourceId));
        }

        /**
         * Method to set Text to the Negative Button
         *
         * @param cancel
         * @return
         */
        public Builder negativeButton(String cancel) {
            optionsDialog.negativeButton = cancel;
            return this;
        }

        /**
         * Method to init the Options Dialog
         *
         * @return
         */
        public QuestionDialog build() {

            // Check for null and assign default values
            optionsDialog.title = Utils.assign(optionsDialog.title, "");
            optionsDialog.message = Utils.assign(optionsDialog.message, getString(R.string.are_you_sure_text));
            optionsDialog.positiveButton = Utils.assign(optionsDialog.positiveButton, getString(R.string.yes_text));
            optionsDialog.negativeButton = Utils.assign(optionsDialog.negativeButton, getString(R.string.no_text));

            return optionsDialog.init();
        }

    }
}
