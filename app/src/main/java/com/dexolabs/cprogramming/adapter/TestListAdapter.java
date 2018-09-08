package com.dexolabs.cprogramming.adapter;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.dexolabs.cprogramming.R;
import com.dexolabs.cprogramming.TestActivity;
import com.dexolabs.cprogramming.appdata.Keys;
import com.dexolabs.cprogramming.data.Dependencies;
import com.dexolabs.cprogramming.model.Question;
import com.dexolabs.cprogramming.utility.Log;
import com.dexolabs.cprogramming.utility.Transition;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class TestListAdapter extends RecyclerView.Adapter<TestListAdapter.ViewHolder> {
    private LinkedHashMap<String, ArrayList<Question>> tutorialList;
    private String[]                                   tutorialTitleList;
    private String TAG = TestListAdapter.class.getName();
    private Activity activity;
    private int      themeColor;


    public TestListAdapter(Activity activity, LinkedHashMap<String, ArrayList<Question>> tutorialList) {
        this.tutorialList = tutorialList;
        this.activity = activity;
        tutorialTitleList = tutorialList.keySet().toArray(new String[tutorialList.size()]);
        themeColor = Dependencies.getThemeColor(activity);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_tutorial_list, parent, false);
        return new TestListAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder viewHolder, int pos) {
        int position = viewHolder.getAdapterPosition();
        viewHolder.tvTutorialTitle.setText(tutorialTitleList[position]);
        viewHolder.tvTutorialNumber.setText(String.valueOf(pos + 1));
        viewHolder.tvTutorialNumber.append(".");
        viewHolder.tvTutorialNumber.setTextColor(themeColor);
        Log.e(TAG, tutorialTitleList[pos]);
        viewHolder.tvTutorialTitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putParcelableArrayList(Keys.Extras.MCQ_LIST, tutorialList.get(tutorialTitleList[viewHolder.getAdapterPosition()]));
                Transition.transitForResult(activity, TestActivity.class, 0, bundle);
            }
        });
    }

    @Override
    public int getItemCount() {
        return tutorialList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tvTutorialTitle;
        private TextView tvTutorialNumber;

        public ViewHolder(View itemView) {
            super(itemView);
            tvTutorialTitle = itemView.findViewById(R.id.tvTutorialTitle);
            tvTutorialNumber = itemView.findViewById(R.id.tvTutorialNumber);

        }
    }

}
