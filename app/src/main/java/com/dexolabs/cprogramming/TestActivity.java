package com.dexolabs.cprogramming;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.dexolabs.cprogramming.adapter.QuestionPagerAdapter;
import com.dexolabs.cprogramming.appdata.Keys;
import com.dexolabs.cprogramming.listener.OnQuestionListener;
import com.dexolabs.cprogramming.listener.OnQuestionTabListener;
import com.dexolabs.cprogramming.model.Question;
import com.dexolabs.cprogramming.structure.BaseActivity;

import java.util.ArrayList;

public class TestActivity extends BaseActivity implements OnQuestionTabListener, OnQuestionListener {
    private ViewPager       vpQuestions;
    private FragmentManager fragmentManager;
    private RecyclerView    rvQuestionNumbers;

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
        rvQuestionNumbers.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        QuestionPagerAdapter questionListAdapter = new QuestionPagerAdapter(this, fragmentManager, questionList);
        vpQuestions.setAdapter(questionListAdapter);
        QuestionNumberAdapter questionNumberAdapter = new QuestionNumberAdapter(this, questionList);
        rvQuestionNumbers.setAdapter(questionNumberAdapter);
        vpQuestions.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @Override
            public void onPageSelected(final int position) {
                rvQuestionNumbers.smoothScrollToPosition(position);
            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });
    }

    private void init() {
        vpQuestions = findViewById(R.id.vpQuestions);
        rvQuestionNumbers = findViewById(R.id.rvQuestionNumbers);
    }

    @Override
    public void onQuestionTabSelected(int position) {
        vpQuestions.setCurrentItem(position, true);

    }

    @Override
    public void onQuestionSelected(Question question) {

    }
}