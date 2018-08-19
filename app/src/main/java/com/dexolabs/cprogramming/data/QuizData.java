package com.dexolabs.cprogramming.data;

import java.util.LinkedHashMap;

public class QuizData {

    public static LinkedHashMap<String, String> getQuizData() {
        LinkedHashMap<String, String> options = new LinkedHashMap<>();

        options.put("Data type - 1", "");
        options.put("Data type - 2", "");
        options.put("Data type - 3", "");
        options.put("Data type - 4", "");
        options.put("Data type - 5", "");
        return options;
    }
}
