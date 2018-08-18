package com.dexolabs.cprogramming.data;

import com.dexolabs.cprogramming.model.TutorialModel;

import java.util.ArrayList;
import java.util.TreeMap;

public class TutorialData {

    public static ArrayList<TutorialModel> getTutorialData() {
        ArrayList<TutorialModel> tutorialModelList = new ArrayList<>();
        TreeMap<String, String> options = new TreeMap<>();

        options.put("Introduction", "http://www.facebook.com");
        options.put("Problem Solving", "http://www.yahoo.com");
        options.put("Algorithm", "http://www.youtube.com");
        options.put("Flowcharts", "http://www.alphabet.com");
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
