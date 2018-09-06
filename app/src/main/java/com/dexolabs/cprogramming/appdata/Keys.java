package com.dexolabs.cprogramming.appdata;

public interface Keys {

    interface Extras {
        String WEB_URL          = "web_url";
        String WEB_TITLE        = "web_title";
        String TUTORIAL_LIST    = "tutorial_list";
        String MCQ_LIST         = "mcq_list";
        String MCQ_Question     = "mcq_question";
        String QUESTION_TITLE   = "question_title";
        String QUESTION_MESSAGE = "question_message";
        String NAVIGATION_ID    = "navigation_id";
    }

    /**
     * Keys inside the {PREFS} should be used to set the values
     * for Storing the values to the SharedPreferences and
     * retrieving them in a similar way.
     */
    interface Prefs {
        String THEME_COLOR = "theme_color";

    }


}
