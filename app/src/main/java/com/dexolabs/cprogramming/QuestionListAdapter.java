package com.dexolabs.cprogramming;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.dexolabs.cprogramming.utility.Log;

import java.util.TreeMap;

public class QuestionListAdapter extends RecyclerView.Adapter<QuestionListAdapter.ViewHolder> {
    private TreeMap<String, String> questionList;
    private String[]                questionTitleList;
    private String TAG = QuizListAdapter.class.getName();


    public QuestionListAdapter(TreeMap<String, String> questionList) {
        this.questionList = questionList;
        questionTitleList = questionList.keySet().toArray(new String[questionList.size()]);
    }

    @NonNull
    @Override
    public QuestionListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_question_list, parent, false);
        return new QuestionListAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull QuestionListAdapter.ViewHolder viewHolder, int pos) {
        int position = viewHolder.getAdapterPosition();
        viewHolder.tvQuestionTitle.setText(questionTitleList[position]);
        Log.e(TAG, questionTitleList[pos]);
    }

    @Override
    public int getItemCount() {
        return questionList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tvQuestionTitle;

        public ViewHolder(View itemView) {
            super(itemView);
            tvQuestionTitle = itemView.findViewById(R.id.tvQuestionTitle);
        }
    }

}
