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
import com.dexolabs.cprogramming.utility.Log;
import com.dexolabs.cprogramming.utility.Transition;

import java.util.LinkedHashMap;

public class TutorialListAdapter extends RecyclerView.Adapter<TutorialListAdapter.ViewHolder> {
    private LinkedHashMap<String, String> webUrlList;
    private String[]                      tutorialTitleList;
    private String TAG = TutorialListAdapter.class.getName();
    private Context mContext;
    private boolean showSerialNumber;

    public TutorialListAdapter(Context mContext, LinkedHashMap<String, String> webUrlList, boolean showSerialNumber) {
        this.webUrlList = webUrlList;
        this.mContext = mContext;
        this.showSerialNumber = showSerialNumber;
        tutorialTitleList = webUrlList.keySet().toArray(new String[webUrlList.size()]);
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
        viewHolder.tvTutorialTitle.setText(tutorialTitleList[position].trim());
        viewHolder.tvTutorialTitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openWebView(webUrlList.get(tutorialTitleList[position]), tutorialTitleList[position]);
            }
        });

        if (showSerialNumber) {
            viewHolder.tvTutorialNumber.setText(String.valueOf(pos + 1));
            viewHolder.tvTutorialNumber.append(".");
        }
        Log.e(TAG, tutorialTitleList[pos]);
    }

    @Override
    public int getItemCount() {
        return webUrlList.size();
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

    private void openWebView(String webUrl, String title) {
        Bundle bundle = new Bundle();
        bundle.putString(Keys.Extras.WEB_TITLE, title);
        bundle.putString(Keys.Extras.WEB_URL, webUrl);
        Transition.transitForResult((Activity) mContext, WebViewActivity.class, Codes.RequestCode.OPEN_WEB_VIEW, bundle);
    }
}
