package com.dexolabs.cprogramming;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatTextView;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.ProgressBar;

public class HomeActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {
    private BottomNavigationView bottomNavigationView;
    private ProgressBar          pbFragmentLoader;
    private FrameLayout          frameHome;
    private AppCompatTextView    tvHomeHeader;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        initID();
        tvHomeHeader.setText(R.string.start_learning);
        setFragment(TutorialFragment.newInstance(CommonData.getTutorialData()));
    }

    private void initID() {
        bottomNavigationView = findViewById(R.id.bottom_navigation);
        pbFragmentLoader = findViewById(R.id.home_fragment_loader);
        frameHome = findViewById(R.id.frame_home_layout);
        tvHomeHeader = findViewById(R.id.tvHomeHeader);
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
                tvHomeHeader.setText(R.string.start_learning);
                break;
            case R.id.action_program:
                setFragment(TutorialFragment.newInstance(CommonData.getProgramData()));
                tvHomeHeader.setText(R.string.practcie_programs);
                break;
            case R.id.action_test:
                setFragment(QuizFragment.newInstance(CommonData.getQuizData()));
                tvHomeHeader.setText(R.string.test_your_talent);
                break;
            case R.id.action_question:
                setFragment(QuestionFragment.newInstance(CommonData.getQuestionData()));
                tvHomeHeader.setText(R.string.important_questions);
                break;
            default:
                setFragment(MoreFragment.newInstance());
                tvHomeHeader.setText(R.string.more_options);
                break;
        }
        return true;
    }


    private void setFragment(final Fragment fragment) {
        getSupportFragmentManager().beginTransaction().replace(R.id.frame_home_layout, fragment).commit();
    }
}
