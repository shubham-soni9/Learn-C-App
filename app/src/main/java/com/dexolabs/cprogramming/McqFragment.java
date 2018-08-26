package com.dexolabs.cprogramming;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.dexolabs.cprogramming.appdata.Constant;
import com.dexolabs.cprogramming.listener.OnQuestionListener;
import com.dexolabs.cprogramming.model.Question;
import com.dexolabs.cprogramming.structure.BaseFragment;
import com.dexolabs.cprogramming.utility.Utils;

import static com.dexolabs.cprogramming.appdata.Keys.Extras.MCQ_Question;

public class McqFragment extends BaseFragment implements View.OnClickListener {
    private Context            mContext;
    private Question           question;
    private TextView           fragment_mcq_tv_question;
    private TextView           fragment_mcq_tv_option_1;
    private TextView           fragment_mcq_tv_option_2;
    private TextView           fragment_mcq_tv_option_3;
    private TextView           fragment_mcq_tv_option_4;
    private TextView           fragment_mcq_tv_expanation;
    private OnQuestionListener onQuestionListener;

    public McqFragment() {
    }

    public static McqFragment newInstance(Question question) {
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
        onQuestionListener = (OnQuestionListener) mContext;
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
        onAnswerSelectedView();
        Utils.setOnClickListener(this, fragment_mcq_tv_option_1, fragment_mcq_tv_option_2, fragment_mcq_tv_option_3, fragment_mcq_tv_option_4);
    }

    private void onAnswerSelectedView() {
        if (question.getSelectedOption() != Constant.AnswerType.UNANSWERED) {
            View view = getAnswerView(question.getAnswer());
            if (view != null) {
                view.setBackgroundResource(R.drawable.rounded_background_green);
            }
            view = getAnswerView(question.getSelectedOption());
            if (view != null) {
                if (question.getSelectedOption() != question.getAnswer()) {
                    view.setBackgroundResource(R.drawable.rounded_background_red);
                }
            }
        }
    }

    private View getAnswerView(int position) {
        switch (position) {
            case 1:
                return fragment_mcq_tv_option_1;
            case 2:
                return fragment_mcq_tv_option_2;
            case 3:
                return fragment_mcq_tv_option_3;
            case 4:
                return fragment_mcq_tv_option_4;
        }
        return null;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.fragment_mcq_tv_option_1:
                checkAnswer(1);
                break;
            case R.id.fragment_mcq_tv_option_2:
                checkAnswer(2);
                break;
            case R.id.fragment_mcq_tv_option_3:
                checkAnswer(3);
                break;
            case R.id.fragment_mcq_tv_option_4:
                checkAnswer(4);
                break;
        }
    }

    private void checkAnswer(int selectedOption) {
        question.setSelectedOption(selectedOption);
        Utils.setEnabled(false, fragment_mcq_tv_option_1, fragment_mcq_tv_option_2, fragment_mcq_tv_option_3, fragment_mcq_tv_option_4);
        onQuestionListener.onQuestionSelected(question);
        if (question.getExplanations() != null && !question.getExplanations().isEmpty()) {
            fragment_mcq_tv_expanation.setText(question.getExplanations());
            fragment_mcq_tv_expanation.setVisibility(View.VISIBLE);
        } else {
            fragment_mcq_tv_expanation.setVisibility(View.GONE);
        }
        onAnswerSelectedView();
    }
}