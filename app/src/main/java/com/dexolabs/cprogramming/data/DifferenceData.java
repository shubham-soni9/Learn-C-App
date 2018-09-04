package com.dexolabs.cprogramming.data;

import java.util.LinkedHashMap;

public class DifferenceData {
    public static LinkedHashMap<String, String> getDifferencesData() {
        LinkedHashMap<String, String> options = new LinkedHashMap<>();
        options.put("C v/s C++", "diff_1.html");
        return options;
    }
}
