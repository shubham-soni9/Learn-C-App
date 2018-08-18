package com.dexolabs.cprogramming.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.TreeMap;

public class TutorialModel implements Parcelable {
    private String                  heading;
    private TreeMap<String, String> tutorialOptions;

    public TutorialModel() {
    }

    public TutorialModel(String heading, TreeMap<String, String> tutorialOptions) {
        this.heading = heading;
        this.tutorialOptions = tutorialOptions;
    }

    protected TutorialModel(Parcel in) {
        heading = in.readString();
    }

    public static final Creator<TutorialModel> CREATOR = new Creator<TutorialModel>() {
        @Override
        public TutorialModel createFromParcel(Parcel in) {
            return new TutorialModel(in);
        }

        @Override
        public TutorialModel[] newArray(int size) {
            return new TutorialModel[size];
        }
    };

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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(heading);
    }
}
