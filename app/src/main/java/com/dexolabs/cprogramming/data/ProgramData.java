package com.dexolabs.cprogramming.data;

import com.dexolabs.cprogramming.model.TutorialModel;

import java.util.ArrayList;
import java.util.TreeMap;

public class ProgramData {
    public static ArrayList<TutorialModel> getProgramData() {
        ArrayList<TutorialModel> programModelList = new ArrayList<>();
        TreeMap<String, String> options = new TreeMap<>();

        options.put("Hello world Program", "1_program.html");
        options.put("Print an Integer (Entered by the User)", "2_program.html");
        options.put("Program to find armstrong number", "2_program.html");
        options.put("Flowcharts", "2_program.html");
        options.put("Before C", "2_program.html");
        programModelList.add(new TutorialModel("Basic Programs", options));


        options = new TreeMap<>();
        options.put("What is C?", "2_program.html");
        options.put("Structure of C", "2_program.html");
        options.put("Compilation", "2_program.html");
        options.put("Nomenclature", "2_program.html");
        options.put("DataTypes", "2_program.html");
        options.put("Operators", "2_program.html");
        options.put("Qualifiers", "2_program.html");
        options.put("Output", "2_program.html");
        options.put("Input", "2_program.html");
        programModelList.add(new TutorialModel("Overview", options));

        return programModelList;
    }
}
