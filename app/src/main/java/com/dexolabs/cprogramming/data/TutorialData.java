package com.dexolabs.cprogramming.data;

import com.dexolabs.cprogramming.model.TutorialModel;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class TutorialData {

    public static ArrayList<TutorialModel> getTutorialData() {
        ArrayList<TutorialModel> tutorialModelList = new ArrayList<>();
        LinkedHashMap<String, String> options = new LinkedHashMap<>();

        options.put("Introduction", "tutorial_1.html");
        options.put("The First C Program", "tutorial_2.html");
        options.put("Compilation and Execution", "http://www.alphabet.com");
        options.put("Before C", "");
        tutorialModelList.add(new TutorialModel("Overview", options));


        options = new LinkedHashMap<>();
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

