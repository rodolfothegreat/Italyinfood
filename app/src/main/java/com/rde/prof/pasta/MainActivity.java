package com.rde.prof.pasta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      //  getSupportActionBar().hide(); //<< this
        setContentView(R.layout.activity_main);
        WebView myWebView = (WebView) findViewById(R.id.webViewLorenzo);
        myWebView.getSettings().setBuiltInZoomControls(true);
        myWebView.getSettings().setJavaScriptEnabled(true);
        myWebView.getSettings().setDomStorageEnabled(true);
        myWebView.loadUrl("file:///android_asset/lorenzo/Pasta.html");

    }
}
