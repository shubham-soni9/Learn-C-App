package com.dexolabs.cprogramming;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.dexolabs.cprogramming.listener.OnQuestionTabListener;
import com.dexolabs.cprogramming.model.Question;

import java.util.ArrayList;

public class QuestionNumberAdapter extends RecyclerView.Adapter<QuestionNumberAdapter.ViewHolder> {
    private ArrayList<Question>   questionList;
    private OnQuestionTabListener onQuestionTabListener;

    public QuestionNumberAdapter(OnQuestionTabListener onQuestionTabListener, ArrayList<Question> questions) {
        this.questionList = questions;
        this.onQuestionTabListener = onQuestionTabListener;
    }

    @NonNull
    @Override
    public QuestionNumberAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_question_number, viewGroup, false);
        return new QuestionNumberAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull QuestionNumberAdapter.ViewHolder viewHolder, final int position) {
        Question question = questionList.get(viewHolder.getAdapterPosition());
        viewHolder.tvQuestionNumber.setText(String.valueOf(position + 1));
        viewHolder.tvQuestionNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onQuestionTabListener.onQuestionTabSelected(position);
            }
        });
        viewHolder.tvQuestionNumber.setBackgroundResource(question.getIsAttemptAnswer() > 0 ? (question.getIsAttemptAnswer() == 1
                ? R.drawable.oval_background_green : R.drawable.oval_background_red) : R.drawable.oval_background_white);
    }

    @Override
    public int getItemCount() {
        return questionList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tvQuestionNumber;

        public ViewHolder(View itemView) {
            super(itemView);
            tvQuestionNumber = itemView.findViewById(R.id.tvQuestionNumber);
        }
    }

}
