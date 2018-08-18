package com.dexolabs.cprogramming.data;

import java.util.TreeMap;

public class QuizData {

    public static TreeMap<String, String> getQuizData() {
        TreeMap<String, String> options = new TreeMap<>();

        options.put("Data type - 1", "");
        options.put("Data type - 2", "");
        options.put("Data type - 3", "");
        options.put("Data type - 4", "");
        options.put("Data type - 5", "");
        return options;
    }
}
