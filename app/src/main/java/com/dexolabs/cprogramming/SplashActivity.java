package com.dexolabs.cprogramming;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.view.View;

import com.dexolabs.cprogramming.data.Dependencies;
import com.dexolabs.cprogramming.structure.BaseActivity;

public class SplashActivity extends BaseActivity {
    private View splashView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        splashView = findViewById(R.id.splashView);
        splashView.setBackgroundColor(Dependencies.getThemeColor(this));
        openHome();
    }

    private void openHome() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, HomeActivity.class);
                startActivity(intent);
                finish();
            }
        }, 1000);
    }
}
