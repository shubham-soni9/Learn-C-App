package com.dexolabs.cprogramming;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

import com.dexolabs.cprogramming.appdata.Keys;
import com.dexolabs.cprogramming.structure.BaseActivity;
import com.dexolabs.cprogramming.utility.Transition;
import com.dexolabs.cprogramming.utility.Utils;

public class WebViewActivity extends BaseActivity implements View.OnClickListener {
    private final int iBack = R.id.llBack;
    private String title;
    private String webUrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);
        WebView webView = findViewById(R.id.webViewInvoice);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setDisplayZoomControls(false);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setUseWideViewPort(true);
        Bundle mBundle = getIntent().getExtras();
        if (mBundle != null) {
            title = mBundle.getString(Keys.Extras.WEB_TITLE);
            webUrl = mBundle.getString(Keys.Extras.WEB_URL);
        }
        webView.loadUrl("file:///android_asset/" + webUrl);
        Utils.setOnClickListener(this, findViewById(iBack));
        TextView tvTitle = findViewById(R.id.tvTitle);
        tvTitle.setText(title);
        tvTitle.setSelected(true);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case iBack:
                performBackAction();
                break;
        }
    }

    private void performBackAction() {
        setResult(RESULT_OK);
        Transition.exit(this);
    }

    @Override
    public void onBackPressed() {
        performBackAction();
    }
}
