package com.dexolabs.cprogramming;

import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;

public class HomeActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {
    private BottomNavigationView bottomNavigationView;
    private ProgressBar          pbFragmentLoader;
    private FrameLayout          frameHome;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        initID();
        setFragment(TutorialFragment.newInstance(CommonData.getTutorialData()));
    }

    private void initID() {
        bottomNavigationView = findViewById(R.id.bottom_navigation);
        pbFragmentLoader = findViewById(R.id.home_fragment_loader);
        frameHome = findViewById(R.id.frame_home_layout);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
        bottomNavigationView.setOnNavigationItemReselectedListener(new BottomNavigationView.OnNavigationItemReselectedListener() {
            @Override
            public void onNavigationItemReselected(@NonNull MenuItem menuItem) {

            }
        });
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.action_tutorial:
                setFragment(TutorialFragment.newInstance(CommonData.getTutorialData()));
                break;
            case R.id.action_program:
                setFragment(TutorialFragment.newInstance(CommonData.getProgramData()));
                break;
            case R.id.action_test:
                setFragment(QuizFragment.newInstance(CommonData.getQuizData()));
                break;
            case R.id.action_question:
                setFragment(QuestionFragment.newInstance(CommonData.getQuestionData()));
                break;
            default:
                setFragment(MoreFragment.newInstance());
                break;
        }
        return true;
    }


    private void setFragment(final Fragment fragment) {
        getSupportFragmentManager().beginTransaction().replace(R.id.frame_home_layout, fragment).commit();
        pbFragmentLoader.setVisibility(View.VISIBLE);
        frameHome.setVisibility(View.GONE);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                pbFragmentLoader.setVisibility(View.GONE);
                frameHome.setVisibility(View.VISIBLE);
            }
        }, 500);
    }
}
