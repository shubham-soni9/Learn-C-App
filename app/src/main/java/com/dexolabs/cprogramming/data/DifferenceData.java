package com.dexolabs.cprogramming.data;

import java.util.LinkedHashMap;

public class DifferenceData {
    public static LinkedHashMap<String, String> getDifferencesData() {
        LinkedHashMap<String, String> options = new LinkedHashMap<>();
        options.put("C v/s C++", "diff_1.html");
        options.put("C v/s Java", "diff_2.html");
        options.put("Procedure Oriented v/s Object Oriented Programming", "diff_3.html");
        return options;
    }
}
