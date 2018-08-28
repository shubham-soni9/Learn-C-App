package com.dexolabs.cprogramming;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.dexolabs.cprogramming.appdata.Keys;
import com.dexolabs.cprogramming.structure.BaseFragment;

import org.sufficientlysecure.htmltextview.HtmlTextView;

public class InterviewQnaPagerFragment extends BaseFragment {
    private TextView     tvTitle;
    private HtmlTextView tvMessage;

    public static InterviewQnaPagerFragment newInstance(String title, String message) {
        InterviewQnaPagerFragment interviewQnaPagerFragment = new InterviewQnaPagerFragment();
        Bundle bundle = new Bundle();
        bundle.putString(Keys.Extras.QUESTION_TITLE, title);
        bundle.putString(Keys.Extras.QUESTION_MESSAGE, message);
        interviewQnaPagerFragment.setArguments(bundle);
        return interviewQnaPagerFragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_interview_qna, container, false);
        getData();
        initFragment(rootView);
        return rootView;
    }

    private void initFragment(ViewGroup rootView) {
        tvTitle = rootView.findViewById(R.id.tvTitle);
        tvMessage = rootView.findViewById(R.id.tvMessage);
    }

    private void getData() {
        Bundle bundle = getArguments();
        if (bundle != null) {
            tvTitle.setText(bundle.getString(Keys.Extras.QUESTION_TITLE));
            tvMessage.setHtml(bundle.getString(Keys.Extras.QUESTION_MESSAGE));
        }
    }
}
