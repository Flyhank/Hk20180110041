package com.n9s.flyjet.hk201801100411;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

public class DetailActivity extends AppCompatActivity
{
    WebView wv;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent it = getIntent();
        String link = it.getStringExtra("link");
        Log.d("NET", "Link:" + link);  //Debug mode

        wv = (WebView) findViewById(R.id.webView);
        wv.setWebChromeClient(new WebChromeClient());
        wv.getSettings().setJavaScriptEnabled(true);
        wv.loadUrl(link);
    }
}
