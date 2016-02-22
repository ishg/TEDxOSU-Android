package com.idc6jyc9yn36dqvzzoup;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;

public class SpeakerDetailActivity extends AppCompatActivity {

    ImageLoader imageLoader = AppController.getInstance().getImageLoader();
    private ProgressDialog pDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speaker_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setTitle("Speakers");

        pDialog = new ProgressDialog(this);
        // Showing progress dialog before making http request
        pDialog.setMessage("Loading...");
        pDialog.show();

        Intent intent = this.getIntent();
        if (intent != null && intent.hasExtra("speaker")){
            String[] s = intent.getStringArrayExtra("speaker");


            ((TextView) findViewById(R.id.speakerName)).setText(s[0]);
            ((TextView) findViewById(R.id.speakerTitle)).setText(s[1]);
            ((TextView) findViewById(R.id.speakerBio)).setText(s[3]);
            ((NetworkImageView) findViewById(R.id.speakerImage)).setImageUrl(s[2], imageLoader);

            pDialog.hide();

        }
    }

}
