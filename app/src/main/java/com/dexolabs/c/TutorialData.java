package com.dexolabs.c;

import java.util.ArrayList;
import java.util.TreeMap;

public class TutorialData {

    public static ArrayList<TutorialModel> getTutorialData() {
        ArrayList<TutorialModel> tutorialModelList = new ArrayList<>();
        TreeMap<String, String> options = new TreeMap<>();

        options.put("Introduction", "");
        options.put("Problem Solving", "");
        options.put("Algorithm", "");
        options.put("Flowcharts", "");
        options.put("Before C", "");
        tutorialModelList.add(new TutorialModel("Introduction", options));


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
        tutorialModelList.add(new TutorialModel("Overview", options));


        return tutorialModelList;
    }
}

