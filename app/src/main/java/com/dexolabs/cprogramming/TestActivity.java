package com.dexolabs.cprogramming;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;

import com.dexolabs.cprogramming.adapter.QuestionPagerAdapter;
import com.dexolabs.cprogramming.appdata.Keys;
import com.dexolabs.cprogramming.listener.OnQuestionListener;
import com.dexolabs.cprogramming.listener.OnQuestionTabListener;
import com.dexolabs.cprogramming.model.Question;
import com.dexolabs.cprogramming.structure.BaseActivity;
import com.dexolabs.cprogramming.utility.Transition;
import com.dexolabs.cprogramming.utility.Utils;

import java.util.ArrayList;

public class TestActivity extends BaseActivity implements OnQuestionTabListener, OnQuestionListener, View.OnClickListener {
    private ViewPager             vpQuestions;
    private FragmentManager       fragmentManager;
    private RecyclerView          rvQuestionNumbers;
    private ArrayList<Question>   questionList;
    private QuestionPagerAdapter  questionListAdapter;
    private QuestionNumberAdapter questionNumberAdapter;
    private ImageButton           ibBack;
    private View                  fabPreviousQuestion;
    private View                  fabNextQuestion;
    private FloatingActionButton  fabFinish;
    private int questionPosition = 0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        init();
        setData();
    }

    private void setData() {
        questionList = getIntent().getExtras().getParcelableArrayList(Keys.Extras.MCQ_LIST);
        fragmentManager = getSupportFragmentManager();
        rvQuestionNumbers.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        questionAdapter();
        vpQuestions.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @Override
            public void onPageSelected(final int position) {
                rvQuestionNumbers.smoothScrollToPosition(position);
                questionPosition = position;
                if (questionList.size() > 0) {
                    if (position == 0) {
                        fabPreviousQuestion.setVisibility(View.GONE);
                    } else if (questionList.size() - 1 == position) {
                        fabNextQuestion.setVisibility(View.GONE);
                    } else {
                        fabNextQuestion.setVisibility(View.VISIBLE);
                        fabPreviousQuestion.setVisibility(View.VISIBLE);
                    }
                } else {
                    fabNextQuestion.setVisibility(View.GONE);
                    fabPreviousQuestion.setVisibility(View.GONE);
                }
            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });


        fabPreviousQuestion.setVisibility(View.GONE);
        fabNextQuestion.setVisibility((questionList.size() > 1) ? View.VISIBLE : View.GONE);
    }

    private void init() {
        vpQuestions = findViewById(R.id.vpQuestions);
        rvQuestionNumbers = findViewById(R.id.rvQuestionNumbers);
        ibBack = findViewById(R.id.ibBack);
        fabNextQuestion = findViewById(R.id.fabNextQuestion);
        fabPreviousQuestion = findViewById(R.id.fabPreviousQuestion);
        fabFinish = findViewById(R.id.fabFinish);
        ibBack.setVisibility(View.VISIBLE);
        Utils.setOnClickListener(this, ibBack, fabNextQuestion, fabPreviousQuestion);
    }

    @Override
    public void onQuestionTabSelected(int position) {
        vpQuestions.setCurrentItem(position, true);

    }

    @Override
    public void onQuestionSelected(Question selectQuestion) {
        for (Question mQuestion : questionList) {
            if (mQuestion.getQuestionId() == selectQuestion.getQuestionId()) {
                questionList.set(questionList.indexOf(selectQuestion), selectQuestion);
                questionAdapter();
                break;
            }
        }
    }

    private void questionAdapter() {
        if (questionListAdapter == null) {
            questionListAdapter = new QuestionPagerAdapter(fragmentManager, questionList);
            vpQuestions.setAdapter(questionListAdapter);
        } else {
            questionListAdapter.notifyDataSetChanged();
        }
        if (questionNumberAdapter == null) {
            questionNumberAdapter = new QuestionNumberAdapter(this, questionList);
            rvQuestionNumbers.setAdapter(questionNumberAdapter);
        } else {
            questionNumberAdapter.notifyDataSetChanged();
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.ibBack:
                onBackPressed();
                break;
            case R.id.fabPreviousQuestion:
                vpQuestions.setCurrentItem(questionPosition - 1, true);
                break;
            case R.id.fabNextQuestion:
                vpQuestions.setCurrentItem(questionPosition + 1, true);
                break;
            case R.id.fabFinish:
                break;
        }
    }

    @Override
    public void onBackPressed() {
        Transition.exit(this);
    }
}