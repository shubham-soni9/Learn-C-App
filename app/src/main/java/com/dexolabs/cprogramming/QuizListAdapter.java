package com.dexolabs.cprogramming;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.dexolabs.cprogramming.utility.Log;

import java.util.LinkedHashMap;

public class QuizListAdapter extends RecyclerView.Adapter<QuizListAdapter.ViewHolder> {
    private LinkedHashMap<String, String> tutorialList;
    private String[]                      tutorialTitleList;
    private String TAG = QuizListAdapter.class.getName();


    public QuizListAdapter(LinkedHashMap<String, String> tutorialList) {
        this.tutorialList = tutorialList;
        tutorialTitleList = tutorialList.keySet().toArray(new String[tutorialList.size()]);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_tutorial_list, parent, false);
        return new QuizListAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int pos) {
        int position = viewHolder.getAdapterPosition();
        viewHolder.tvTutorialTitle.setText(tutorialTitleList[position]);
        Log.e(TAG, tutorialTitleList[pos]);
    }

    @Override
    public int getItemCount() {
        return tutorialList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tvTutorialTitle;

        public ViewHolder(View itemView) {
            super(itemView);
            tvTutorialTitle = itemView.findViewById(R.id.tvTutorialTitle);
        }
    }

}
