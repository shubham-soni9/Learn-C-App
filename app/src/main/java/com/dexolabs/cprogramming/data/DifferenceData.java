package com.dexolabs.cprogramming.data;

import java.util.LinkedHashMap;

public class DifferenceData {
    public static LinkedHashMap<String, String> getDifferencesData() {
        LinkedHashMap<String, String> options = new LinkedHashMap<>();
        options.put("C v/s C++", "diff_1.html");
        options.put("C++ v/s Java", "diff_2.html");
        options.put("C v/s Java", "diff_11.html");
        options.put("Procedure Oriented v/s Object Oriented Programming", "diff_3.html");
        options.put("Structure v/s Union", "diff_4.html");
        options.put("Array v/s Pointer", "diff_5.html");
        options.put("Array v/s Structure", "diff_6.html");
        options.put("Object v/s Class", "diff_7.html");
        options.put("Malloc() v/s Calloc()", "diff_8.html");
        options.put("Call By Value v/s Call by Reference", "diff_9.html");
        return options;
    }
}
