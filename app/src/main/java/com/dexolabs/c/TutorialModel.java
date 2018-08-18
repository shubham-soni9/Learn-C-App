package com.dexolabs.c;

import java.util.HashMap;
import java.util.TreeMap;

public class TutorialModel {
    private String                  heading;
    private TreeMap<String, String> tutorialOptions;

    public TutorialModel() {
    }

    public TutorialModel(String heading, TreeMap<String, String> tutorialOptions) {
        this.heading = heading;
        this.tutorialOptions = tutorialOptions;
    }

    public String getHeading() {
        return heading;
    }

    public TreeMap<String, String> getTutorialOptions() {
        return tutorialOptions;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public void setTutorialOptions(TreeMap<String, String> tutorialOptions) {
        this.tutorialOptions = tutorialOptions;
    }
}
