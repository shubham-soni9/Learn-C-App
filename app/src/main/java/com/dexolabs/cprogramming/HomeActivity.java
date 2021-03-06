package com.dexolabs.cprogramming;

import android.content.res.ColorStateList;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatTextView;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.ProgressBar;

import com.dexolabs.cprogramming.data.Dependencies;

import static com.dexolabs.cprogramming.appdata.Keys.Extras.NAVIGATION_ID;

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
        setData();
        setColors();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putInt(NAVIGATION_ID, bottomNavigationView.getSelectedItemId());
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        int resID = savedInstanceState.getInt(NAVIGATION_ID);
        onNavigationItemClick(resID);
    }

    private void setColors() {
        findViewById(R.id.llParentToolbar).setBackgroundColor(Dependencies.getThemeColor(this));
        ColorStateList colorStateList = getNavigationIconSelector(Dependencies.getThemeColor(this));
        bottomNavigationView.setItemIconTintList(colorStateList);
        bottomNavigationView.setItemTextColor(colorStateList);
    }

    private void setData() {
        tvHomeHeader.setText(R.string.start_learning);
        bottomNavigationView.setSelectedItemId(R.id.action_tutorial);
        onNavigationItemClick(bottomNavigationView.getSelectedItemId());
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
        onNavigationItemClick(menuItem.getItemId());
        return true;
    }

    private void onNavigationItemClick(int itemId) {
        switch (itemId) {
            case R.id.action_tutorial:
                setFragment(TutorialFragment.newInstance(CommonData.getTutorialData()));
                tvHomeHeader.setText(R.string.start_learning);
                break;
            case R.id.action_program:
                setFragment(TutorialFragment.newInstance(CommonData.getProgramData()));
                tvHomeHeader.setText(R.string.practcie_programs);
                break;
            case R.id.action_test:
                setFragment(TestListFragment.newInstance(CommonData.getQuizData()));
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
    }

    private void setFragment(final Fragment fragment) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.frame_home_layout, fragment)
                .commit();
    }

    private ColorStateList getNavigationIconSelector(int checkedColor) {

        int[][] states = new int[][]{
                new int[]{android.R.attr.state_checked}, // enabled
                new int[]{-android.R.attr.state_checked}, // disabled
        };

        int[] colors = new int[]{
                checkedColor,
                ContextCompat.getColor(this, R.color.black)
        };

        return new ColorStateList(states, colors);
    }

}
