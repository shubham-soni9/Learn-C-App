package com.dexolabs.cprogramming;

import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {
    private BottomNavigationView bottomNavigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        initID();
        setBottomNavigation();
        setFragment();
    }

    private void initID() {
        bottomNavigationView = findViewById(R.id.bottom_navigation);
    }

    private void setBottomNavigation() {

    }

    private void setFragment() {
        getSupportFragmentManager().beginTransaction().replace(R.id.frame_home_layout, TutorialFragment.newInstance()).commit();
    }

}
