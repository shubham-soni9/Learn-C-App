package com.dexolabs.cprogramming.structure;

import android.app.Application;

import io.github.kbiakov.codeview.classifier.CodeProcessor;

public class BaseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        CodeProcessor.init(this);
    }
}
