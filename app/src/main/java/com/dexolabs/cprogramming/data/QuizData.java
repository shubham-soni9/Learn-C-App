package com.dexolabs.cprogramming.data;

import com.dexolabs.cprogramming.model.Question;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class QuizData {
    private static Question mQuestion;

    public static LinkedHashMap<String, ArrayList<Question>> getQuizData() {
        LinkedHashMap<String, ArrayList<Question>> options = new LinkedHashMap<>();
        ArrayList<Question> questionList = new ArrayList<>();

        questionList.add(getQuestion(1, "What is your name?", "Shubham Soni", "Rahul dev", "Ramesh Jadhav", "Neeraj Yadav", 1, ""));
        questionList.add(getQuestion(2, "What is your name?", "Shubham Soni", "Rahul dev", "Ramesh Jadhav", "Neeraj Yadav", 1, ""));
        questionList.add(getQuestion(3, "What is your name?", "Shubham Soni", "Rahul dev", "Ramesh Jadhav", "Neeraj Yadav", 1, ""));
        questionList.add(getQuestion(4, "What is your name?", "Shubham Soni", "Rahul dev", "Ramesh Jadhav", "Neeraj Yadav", 1, ""));
        questionList.add(getQuestion(5, "What is your name?", "Shubham Soni", "Rahul dev", "Ramesh Jadhav", "Neeraj Yadav", 1, ""));
        options.put("Data type - 1", questionList);

        return options;
    }

    private static Question getQuestion(int questionId, String question, String option1, String option2, String option3, String option4, int answer, String explanation) {
        if (mQuestion == null) {
            mQuestion = new Question();
        }
        mQuestion.setQuestionId(questionId);
        mQuestion.setQuestion(question);
        mQuestion.setOption_1(option1);
        mQuestion.setOption_2(option2);
        mQuestion.setOption_3(option3);
        mQuestion.setOption_4(option4);
        mQuestion.setAnswer(answer);
        mQuestion.setExplanations(explanation);
        return mQuestion;
    }
}
