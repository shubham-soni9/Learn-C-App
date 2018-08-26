package com.dexolabs.cprogramming;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;

import com.dexolabs.cprogramming.adapter.QuestionPagerAdapter;
import com.dexolabs.cprogramming.appdata.Keys;
import com.dexolabs.cprogramming.model.Question;
import com.dexolabs.cprogramming.structure.BaseActivity;

import java.util.ArrayList;

public class TestActivity extends BaseActivity {
    private ViewPager       vpQuestions;
    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        init();
        setData();
    }

    private void setData() {
        ArrayList<Question> questionList = getIntent().getExtras().getParcelableArrayList(Keys.Extras.MCQ_LIST);
        fragmentManager = getSupportFragmentManager();
        QuestionPagerAdapter questionListAdapter = new QuestionPagerAdapter(fragmentManager, questionList);
        vpQuestions.setAdapter(questionListAdapter);
    }

    private void init() {
        vpQuestions = findViewById(R.id.vpQuestions);
    }
}