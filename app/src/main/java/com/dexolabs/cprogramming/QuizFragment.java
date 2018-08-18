package com.dexolabs.cprogramming;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dexolabs.cprogramming.adapter.TutorialListAdapter;
import com.dexolabs.cprogramming.structure.BaseFragment;

import java.util.TreeMap;

public class QuizFragment extends BaseFragment {
    private Context                 mContext;
    private    RecyclerView            rvQuizList;
    private    QuizListAdapter     tutorialListAdapter;
    private    TreeMap<String, String> tutorialList;

    public static QuizFragment newInstance(TreeMap<String, String> tutorialList) {
        QuizFragment quizFragment = new QuizFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("tutorial_list", tutorialList);
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
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_quiz, container, false);
        getData();
        initFragment(rootView);
        return rootView;
    }

    private void getData() {
        Bundle bundle = getArguments();
        tutorialList = (TreeMap<String, String>) bundle.getSerializable("tutorial_list");
    }

    private void initFragment(ViewGroup rootView) {
        rvQuizList = rootView.findViewById(R.id.fragment_quiz_rv_list);
        rvQuizList.setLayoutManager(new LinearLayoutManager(mContext, LinearLayoutManager.VERTICAL, false));
        tutorialListAdapter = new QuizListAdapter(tutorialList);
        rvQuizList.setAdapter(tutorialListAdapter);
    }
}