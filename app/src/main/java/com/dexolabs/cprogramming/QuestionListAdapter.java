package com.dexolabs.cprogramming;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.dexolabs.cprogramming.dialog.QuestionDialog;
import com.dexolabs.cprogramming.utility.Log;

import java.util.LinkedHashMap;

public class QuestionListAdapter extends RecyclerView.Adapter<QuestionListAdapter.ViewHolder> {
    private LinkedHashMap<String, String> questionList;
    private String[]                      questionTitleList;
    private String TAG = TestListAdapter.class.getName();
    private Activity        mContext;
    private FragmentManager fragmentManager;


    public QuestionListAdapter(FragmentManager fragmentManager, LinkedHashMap<String, String> questionList, Activity mContext) {
        this.questionList = questionList;
        this.mContext = mContext;
        this.fragmentManager = fragmentManager;
        questionTitleList = questionList.keySet().toArray(new String[questionList.size()]);
    }

    @NonNull
    @Override
    public QuestionListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_question_list, parent, false);
        return new QuestionListAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull QuestionListAdapter.ViewHolder viewHolder, final int pos) {
        final int position = viewHolder.getAdapterPosition();
        viewHolder.tvQuestionTitle.setText(questionTitleList[position].trim());
        viewHolder.tvQuestionNumber.setText(String.valueOf(pos + 1));
        viewHolder.tvQuestionNumber.append(".");
        Log.e(TAG, questionTitleList[pos]);

        viewHolder.llParent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showAnswer(position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return questionList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView     tvQuestionTitle;
        private TextView     tvQuestionNumber;
        private LinearLayout llParent;

        public ViewHolder(View itemView) {
            super(itemView);
            tvQuestionTitle = itemView.findViewById(R.id.tvQuestion);
            tvQuestionNumber = itemView.findViewById(R.id.tvQuestionNumber);
            llParent = itemView.findViewById(R.id.question_ll_parent);
        }
    }

    private void showAnswer(int position) {
        QuestionDialog.Builder builder = new QuestionDialog.Builder(mContext);
        builder.currentPosition(position);
        builder.questionDataList(questionList);
        builder.positiveButton(R.string.next);
        builder.negativeButton(R.string.previous);
        builder.build().show();
    }
}
