package com.dexolabs.cprogramming;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;

import com.dexolabs.cprogramming.adapter.TutorialListAdapter;
import com.dexolabs.cprogramming.data.Dependencies;
import com.dexolabs.cprogramming.structure.BaseActivity;
import com.dexolabs.cprogramming.utility.Transition;
import com.dexolabs.cprogramming.utility.Utils;

public class DifferenceActivity extends BaseActivity implements View.OnClickListener {
    private RecyclerView        rvDifferences;
    private TutorialListAdapter tutorialListAdapter;
    private ImageButton         ibBack;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_difference);
        rvDifferences = findViewById(R.id.rvDifferences);
        ibBack = findViewById(R.id.ibBack);
        rvDifferences.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        tutorialListAdapter = new TutorialListAdapter(this, CommonData.getDifferenceData(), true);
        rvDifferences.setAdapter(tutorialListAdapter);
        ibBack.setVisibility(View.VISIBLE);
        Utils.setOnClickListener(this, ibBack);
        setColors();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.ibBack:
                onBackPressed();
                break;
        }
    }

    private void setColors() {
        findViewById(R.id.llParentToolbar).setBackgroundColor(Dependencies.getThemeColor(this));
    }

    @Override
    public void onBackPressed() {
        Transition.exit(this);
    }
}
