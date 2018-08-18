package com.dexolabs.cprogramming.data;

import com.dexolabs.cprogramming.model.TutorialModel;

import java.util.ArrayList;

public class CommonData {

    public static ArrayList<TutorialModel> getTutorialData() {
        return TutorialData.getTutorialData();
    }

    public static ArrayList<TutorialModel> getProgramData() {
        return ProgramData.getProgramData();
    }
}
