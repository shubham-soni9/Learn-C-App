package com.dexolabs.cprogramming.adapter;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.dexolabs.cprogramming.R;
import com.dexolabs.cprogramming.WebViewActivity;
import com.dexolabs.cprogramming.appdata.Codes;
import com.dexolabs.cprogramming.appdata.Keys;
import com.dexolabs.cprogramming.model.TutorialModel;
import com.dexolabs.cprogramming.utility.Log;
import com.dexolabs.cprogramming.utility.Transition;

import java.util.TreeMap;

public class TutorialListAdapter extends RecyclerView.Adapter<TutorialListAdapter.ViewHolder> {
    private TreeMap<String, String> tutorialList;
    private String[]                tutorialTitleList;
    private String TAG = TutorialListAdapter.class.getName();
    private Context       mContext;
    private TutorialModel tutorialModel;


    public TutorialListAdapter(Context mContext, TutorialModel tutorialModel) {
        this.tutorialList = tutorialModel.getTutorialOptions();
        this.tutorialModel = tutorialModel;
        this.mContext = mContext;
        tutorialTitleList = tutorialList.keySet().toArray(new String[tutorialList.size()]);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_tutorial_list, parent, false);
        return new TutorialListAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder viewHolder, final int pos) {
        final int position = viewHolder.getAdapterPosition();
        viewHolder.tvTutorialTitle.setText(tutorialTitleList[position]);
        viewHolder.tvTutorialTitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openWebView(tutorialList.get(tutorialTitleList[position]));
            }
        });
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

    private void openWebView(String webUrl) {
        Bundle bundle = new Bundle();
        bundle.putString(Keys.Extras.WEB_TITLE, tutorialModel.getHeading());
        bundle.putString(Keys.Extras.WEB_URL, webUrl);
        Transition.transitForResult((Activity) mContext, WebViewActivity.class, Codes.RequestCode.OPEN_WEB_VIEW, bundle);
    }
}
