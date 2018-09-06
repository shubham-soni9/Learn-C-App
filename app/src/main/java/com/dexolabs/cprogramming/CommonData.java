package com.dexolabs.cprogramming;

import com.dexolabs.cprogramming.data.DifferenceData;
import com.dexolabs.cprogramming.data.ProgramData;
import com.dexolabs.cprogramming.data.QuestionData;
import com.dexolabs.cprogramming.data.QuizData;
import com.dexolabs.cprogramming.data.ReferenceData;
import com.dexolabs.cprogramming.data.TutorialData;
import com.dexolabs.cprogramming.model.Question;
import com.dexolabs.cprogramming.model.TutorialModel;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class CommonData {

    public static ArrayList<TutorialModel> getTutorialData() {
        return TutorialData.getTutorialData();
    }

    public static ArrayList<TutorialModel> getProgramData() {
        return ProgramData.getProgramData();
    }

    public static LinkedHashMap<String, ArrayList<Question>> getQuizData() {
        return QuizData.getQuizData();
    }

    public static LinkedHashMap<String, String> getQuestionData() {
        return QuestionData.getQuestionData();
    }

    public static LinkedHashMap<String, String> getDifferenceData() {
        return DifferenceData.getDifferencesData();
    }

    public static LinkedHashMap<String, String> getReferenceData() {
        return ReferenceData.getReferenceData();
    }}
