package com.dexolabs.cprogramming;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.dexolabs.cprogramming.listener.OnQuestionListener;
import com.dexolabs.cprogramming.listener.OnQuestionTabListener;
import com.dexolabs.cprogramming.model.Question;
import com.dexolabs.cprogramming.structure.BaseFragment;
import com.dexolabs.cprogramming.utility.Utils;

import static com.dexolabs.cprogramming.appdata.Keys.Extras.MCQ_Question;

public class McqFragment extends BaseFragment implements View.OnClickListener {
    private Context         mContext;
    private RecyclerView    rvQuizList;
    private TestListAdapter tutorialListAdapter;
    private Question        question;
    private TextView        fragment_mcq_tv_question;
    private TextView        fragment_mcq_tv_option_1;
    private TextView        fragment_mcq_tv_option_2;
    private TextView        fragment_mcq_tv_option_3;
    private TextView        fragment_mcq_tv_option_4;
    private TextView        fragment_mcq_tv_expanation;
    private OnQuestionTabListener onQuestionListener;

    public static McqFragment newInstance(OnQuestionListener onQuestionListener, Question question) {
        McqFragment mcqFragment = new McqFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable(MCQ_Question, question);
        mcqFragment.setArguments(bundle);
        return mcqFragment;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mContext = context;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_mcq, container, false);
        getData();
        initFragment(rootView);
        setData();
        return rootView;
    }

    private void getData() {
        Bundle bundle = getArguments();
        question = bundle.getParcelable(MCQ_Question);
    }

    private void initFragment(ViewGroup rootView) {
        fragment_mcq_tv_question = rootView.findViewById(R.id.fragment_mcq_tv_question);
        fragment_mcq_tv_option_1 = rootView.findViewById(R.id.fragment_mcq_tv_option_1);
        fragment_mcq_tv_option_2 = rootView.findViewById(R.id.fragment_mcq_tv_option_2);
        fragment_mcq_tv_option_3 = rootView.findViewById(R.id.fragment_mcq_tv_option_3);
        fragment_mcq_tv_option_4 = rootView.findViewById(R.id.fragment_mcq_tv_option_4);
        fragment_mcq_tv_expanation = rootView.findViewById(R.id.fragment_mcq_tv_expanation);
    }

    private void setData() {
        fragment_mcq_tv_question.setText(question.getQuestion());
        fragment_mcq_tv_option_1.setText(question.getOption_1());
        fragment_mcq_tv_option_2.setText(question.getOption_2());
        fragment_mcq_tv_option_3.setText(question.getOption_3());
        fragment_mcq_tv_option_4.setText(question.getOption_4());
        Utils.setOnClickListener(this, fragment_mcq_tv_option_1, fragment_mcq_tv_option_2, fragment_mcq_tv_option_3, fragment_mcq_tv_option_4);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.fragment_mcq_tv_option_1:
                checkAnswer(view, 1);
                break;
            case R.id.fragment_mcq_tv_option_2:
                checkAnswer(view, 2);
                break;
            case R.id.fragment_mcq_tv_option_3:
                checkAnswer(view, 3);
                break;
            case R.id.fragment_mcq_tv_option_4:
                checkAnswer(view, 4);
                break;
        }
    }

    private void checkAnswer(final View view, int selectedOption) {
        if (selectedOption == question.getAnswer()) {
            view.setBackgroundResource(R.drawable.rounded_background_green);
        } else {
            view.setBackgroundResource(R.drawable.rounded_background_red);
            switch (question.getAnswer()) {
                case 1:
                    fragment_mcq_tv_option_1.setBackgroundResource(R.drawable.rounded_background_green);
                    break;
                case 2:
                    fragment_mcq_tv_option_2.setBackgroundResource(R.drawable.rounded_background_green);
                    break;
                case 3:
                    fragment_mcq_tv_option_3.setBackgroundResource(R.drawable.rounded_background_green);
                    break;
                case 4:
                    fragment_mcq_tv_option_4.setBackgroundResource(R.drawable.rounded_background_green);
                    break;
            }
        }
        fragment_mcq_tv_option_1.setEnabled(false);
        fragment_mcq_tv_option_2.setEnabled(false);
        fragment_mcq_tv_option_3.setEnabled(false);
        fragment_mcq_tv_option_4.setEnabled(false);

        if (question.getExplanations() != null && !question.getExplanations().isEmpty()) {
            fragment_mcq_tv_expanation.setText(question.getExplanations());
            fragment_mcq_tv_expanation.setVisibility(View.VISIBLE);
        } else {
            fragment_mcq_tv_expanation.setVisibility(View.GONE);
        }
    }
}