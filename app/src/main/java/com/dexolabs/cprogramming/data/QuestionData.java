package com.dexolabs.cprogramming.data;

import java.util.TreeMap;

public class QuestionData {
    public static TreeMap<String, String> getQuestionData() {
        TreeMap<String, String> options = new TreeMap<>();

        options.put("What is C", "");
        options.put("Why you should learn C", "");
        options.put("What is C/C++", "");
        options.put("What is data type", "");
        options.put("What is enum data type", "");
        return options;
    }
}
