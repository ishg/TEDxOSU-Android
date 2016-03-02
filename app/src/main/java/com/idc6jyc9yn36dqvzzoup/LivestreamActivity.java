package com.idc6jyc9yn36dqvzzoup;

import android.app.ProgressDialog;
import android.graphics.Point;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class LivestreamActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_livestream);
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        int width = 640;
        int height = 360;

        String frameVideo = "<html><body style=\"margin:0;\"><iframe src=\"http://livestream.com/accounts/9213968/events/4839274/player?width="+Integer.toString(width)+"&height="+Integer.toString(height)+"&autoPlay=true&mute=false\" width=\""+Integer.toString(width)+"\" height=\""+Integer.toString(height)+"\" frameborder=\"0\" scrolling=\"no\"></iframe></body></html>";
        //String testVideo = "<html><body style=\"margin: 0\"><iframe src=\"http://livestream.com/accounts/17344117/events/4845440/videos/113347152/player?width="+Integer.toString(width)+"&height="+Integer.toString(height)+"&autoPlay=true&mute=false\" width=\""+Integer.toString(width)+"\" height=\""+Integer.toString(height)+"\" frameborder=\"0\" scrolling=\"no\" allowFullScreen=\"true\" ></iframe></body></html>";


        WebView webView = (WebView) findViewById(R.id.livestreamWebView);
        webView.setPadding(0, 0, 0, 0);
        webView.setInitialScale(getScale());

        final ProgressDialog pDialog = new ProgressDialog(this);
        // Showing progress dialog before making http request
        pDialog.setMessage("Loading...");
        pDialog.show();

        webView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                return false;
            }

            public void onPageFinished(WebView view, String url) {
                // do your stuff here
                pDialog.hide();
            }
        });

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webView.loadData(frameVideo, "text/html", "utf-8");


    }

    private int getScale(){
        DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);

        int width = metrics.widthPixels;

        //Log.d("ApplicationTagName", "Display width in px is " + metrics.widthPixels);

        Double val = new Double(width)/new Double(640);
        val = val * 100d;
        return val.intValue();
    }
}
