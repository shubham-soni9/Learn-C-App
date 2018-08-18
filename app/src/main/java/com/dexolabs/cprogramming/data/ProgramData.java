package com.dexolabs.cprogramming.data;

import com.dexolabs.cprogramming.model.TutorialModel;

import java.util.ArrayList;
import java.util.TreeMap;

public class ProgramData {
    public static ArrayList<TutorialModel> getProgramData() {
        ArrayList<TutorialModel> programModelList = new ArrayList<>();
        TreeMap<String, String> options = new TreeMap<>();

        options.put("Hello world Program", "file:///android_asset/program/1_program.html");
        options.put("Program to find even/odd from a number", "");
        options.put("Program to find armstrong number", "");
        options.put("Flowcharts", "");
        options.put("Before C", "");
        programModelList.add(new TutorialModel("Introduction", options));


        options = new TreeMap<>();
        options.put("What is C?", "");
        options.put("Structure of C", "");
        options.put("Compilation", "");
        options.put("Nomenclature", "");
        options.put("DataTypes", "");
        options.put("Operators", "");
        options.put("Qualifiers", "");
        options.put("Output", "");
        options.put("Input", "");
        programModelList.add(new TutorialModel("Overview", options));

        return programModelList;
    }
}
