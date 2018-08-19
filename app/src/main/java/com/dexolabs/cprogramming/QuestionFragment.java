package com.dexolabs.cprogramming;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dexolabs.cprogramming.structure.BaseFragment;

import java.util.LinkedHashMap;

public class QuestionFragment extends BaseFragment {
    private Context                       mContext;
    private RecyclerView                  rvQuestionList;
    private QuestionListAdapter           questionListAdapter;
    private LinkedHashMap<String, String> questionList;

    public static QuestionFragment newInstance(LinkedHashMap<String, String> questionList) {
        QuestionFragment quizFragment = new QuestionFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("tutorial_list", questionList);
        quizFragment.setArguments(bundle);
        return quizFragment;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mContext = context;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_questions, container, false);
        getData();
        initFragment(rootView);
        return rootView;
    }

    private void getData() {
        Bundle bundle = getArguments();
        questionList = (LinkedHashMap<String, String>) bundle.getSerializable("tutorial_list");
    }

    private void initFragment(ViewGroup rootView) {
        rvQuestionList = rootView.findViewById(R.id.fragment_question_rv_list);
        rvQuestionList.setLayoutManager(new LinearLayoutManager(mContext, LinearLayoutManager.VERTICAL, false));
        questionListAdapter = new QuestionListAdapter(questionList, (Activity) mContext);
        rvQuestionList.setAdapter(questionListAdapter);
    }
}
