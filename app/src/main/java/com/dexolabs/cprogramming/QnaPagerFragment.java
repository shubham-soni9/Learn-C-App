package com.dexolabs.cprogramming;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.dexolabs.cprogramming.adapter.InterviewQnaAdapter;
import com.dexolabs.cprogramming.structure.BaseFragment;

import java.util.LinkedHashMap;

import static com.dexolabs.cprogramming.appdata.Keys.Extras.MCQ_LIST;

public class QnaPagerFragment extends BaseFragment {
    private LinkedHashMap<String, String> questionList;
    private int currentPosition = 0;


    public static QnaPagerFragment newInstance(LinkedHashMap<String, String> questionList) {
        QnaPagerFragment testListFragment = new QnaPagerFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable(MCQ_LIST, questionList);
        testListFragment.setArguments(bundle);
        return testListFragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.dialog_question_pager, container, false);
        getData();
        initFragment(rootView);
        return rootView;
    }

    private void initFragment(ViewGroup rootView) {
        Button btnAction = rootView.findViewById(R.id.btnAction);
        ViewPager vpQuestions = rootView.findViewById(R.id.vpQnAPager);
        InterviewQnaAdapter interviewQnaAdapter = new InterviewQnaAdapter(getChildFragmentManager(), questionList);
        vpQuestions.setAdapter(interviewQnaAdapter);
        vpQuestions.setCurrentItem(currentPosition);
        btnAction.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
            }
        });
    }

    private void getData() {
        Bundle bundle = getArguments();
        questionList = (LinkedHashMap<String, String>) bundle.getSerializable(MCQ_LIST);
    }
}
