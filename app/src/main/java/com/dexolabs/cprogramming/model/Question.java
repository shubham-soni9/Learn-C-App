package com.dexolabs.cprogramming.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.dexolabs.cprogramming.appdata.Constant;

public class Question implements Parcelable {
    private int    questionId;
    private String question;
    private String option_1;
    private String option_2;
    private String option_3;
    private String option_4;
    private int answer = 0;
    private String explanations;
    private int selectedOption = 0;

    protected Question(Parcel in) {
        questionId = in.readInt();
        question = in.readString();
        option_1 = in.readString();
        option_2 = in.readString();
        option_3 = in.readString();
        option_4 = in.readString();
        answer = in.readInt();
        explanations = in.readString();
        selectedOption = in.readInt();
    }

    public Question() {
    }


    public Question(int questionId, String question, String option_1, String option_2, String option_3, String option_4, int answer, String explanations, int selectedOption) {
        this.questionId = questionId;
        this.question = question;
        this.option_1 = option_1;
        this.option_2 = option_2;
        this.option_3 = option_3;
        this.option_4 = option_4;
        this.answer = answer;
        this.explanations = explanations;
        this.selectedOption = selectedOption;
    }

    public static final Creator<Question> CREATOR = new Creator<Question>() {
        @Override
        public Question createFromParcel(Parcel in) {
            return new Question(in);
        }

        @Override
        public Question[] newArray(int size) {
            return new Question[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(questionId);
        parcel.writeString(question);
        parcel.writeString(option_1);
        parcel.writeString(option_2);
        parcel.writeString(option_3);
        parcel.writeString(option_4);
        parcel.writeInt(answer);
        parcel.writeString(explanations);
        parcel.writeInt(selectedOption);
    }

    public String getQuestion() {
        return question;
    }

    public String getOption_1() {
        return option_1;
    }

    public String getOption_2() {
        return option_2;
    }

    public String getOption_3() {
        return option_3;
    }

    public String getOption_4() {
        return option_4;
    }

    public int getAnswer() {
        return answer;
    }
    public void setAnswer(int answer) {
        this.answer = answer;
    }

    public String getExplanations() {
        return explanations;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setOption_1(String option_1) {
        this.option_1 = option_1;
    }

    public void setOption_2(String option_2) {
        this.option_2 = option_2;
    }

    public void setOption_3(String option_3) {
        this.option_3 = option_3;
    }

    public void setOption_4(String option_4) {
        this.option_4 = option_4;
    }


    public void setExplanations(String explanations) {
        this.explanations = explanations;
    }


    public int getSelectedOption() {
        return selectedOption;
    }

    public void setSelectedOption(int selectedOption) {
        this.selectedOption = selectedOption;
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }


}
