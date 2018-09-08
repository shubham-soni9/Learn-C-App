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

import com.dexolabs.cprogramming.adapter.TestListAdapter;
import com.dexolabs.cprogramming.model.Question;
import com.dexolabs.cprogramming.structure.BaseFragment;
import com.dexolabs.cprogramming.utility.Utils;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import static com.dexolabs.cprogramming.appdata.Keys.Extras.MCQ_LIST;

public class TestListFragment extends BaseFragment {
    private Context                                    mContext;
    private RecyclerView                               rvQuizList;
    private TestListAdapter                            testListAdapter;
    private LinkedHashMap<String, ArrayList<Question>> testList;

    public static TestListFragment newInstance(LinkedHashMap<String, ArrayList<Question>> testList) {
        TestListFragment testListFragment = new TestListFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable(MCQ_LIST, testList);
        testListFragment.setArguments(bundle);
        Utils.logRequestBody(testList);
        return testListFragment;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mContext = context;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_test_list, container, false);
        getData();
        initFragment(rootView);
        return rootView;
    }

    private void getData() {
        Bundle bundle = getArguments();
        testList = (LinkedHashMap<String, ArrayList<Question>>) bundle.getSerializable(MCQ_LIST);
    }

    private void initFragment(ViewGroup rootView) {
        rvQuizList = rootView.findViewById(R.id.fragment_quiz_rv_list);
        rvQuizList.setLayoutManager(new LinearLayoutManager(mContext, LinearLayoutManager.VERTICAL, false));
        testListAdapter = new TestListAdapter((Activity) mContext, testList);
        rvQuizList.setAdapter(testListAdapter);
    }
}
