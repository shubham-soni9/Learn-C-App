package com.dexolabs.cprogramming;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;

import com.dexolabs.cprogramming.adapter.ReferenceAdapter;
import com.dexolabs.cprogramming.data.Dependencies;
import com.dexolabs.cprogramming.structure.BaseActivity;
import com.dexolabs.cprogramming.utility.Transition;

public class ReferenceActivity extends BaseActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reference);
        ReferenceAdapter referenceAdapter = new ReferenceAdapter(CommonData.getReferenceData());
        RecyclerView rvReference = findViewById(R.id.rvReference);
        rvReference.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        rvReference.setAdapter(referenceAdapter);
        ImageButton ibBack = findViewById(R.id.ibBack);
        ibBack.setVisibility(View.VISIBLE);
        ibBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
        setColors();
    }

    private void setColors() {
        findViewById(R.id.llParentToolbar).setBackgroundColor(Dependencies.getThemeColor(this));
    }

    @Override
    public void onBackPressed() {
        Transition.exit(this);
    }
}
