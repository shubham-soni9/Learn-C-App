package com.dexolabs.cprogramming;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    /**
     * Method called when a fragment inside the BaseActivity
     * has completed intialization
     *
     * @param fragment the current active fragment
     */
    protected void onFragmentInitialized(final BaseFragment fragment) {
        // Override this method to perform operations
    }
}
