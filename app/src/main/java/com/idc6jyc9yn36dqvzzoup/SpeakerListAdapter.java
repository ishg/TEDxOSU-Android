package com.idc6jyc9yn36dqvzzoup;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by ishmeet on 2/10/16.
 */
public class SpeakerListAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] speakerName;
    private final Integer[] imgid;
    //private final String [] speakerTitle;


    public SpeakerListAdapter(Activity context, String[] speakerName, Integer[] imgid) {
        super(context, R.layout.speaker_list_view, speakerName);


        this.context=context;
        this.speakerName=speakerName;
        this.imgid=imgid;
        //this.speakerTitle = speakerTitle;
    }

    public View getView(int position, View view, ViewGroup parent) {

        LayoutInflater inflater=context.getLayoutInflater();

        View rowView=inflater.inflate(R.layout.speaker_list_view, null,true);

        TextView nameView = (TextView) rowView.findViewById(R.id.speakerNameTextView);
        //ImageView imageView = (ImageView) rowView.findViewById(R.id.speakerImageView);
        TextView titleView = (TextView) rowView.findViewById(R.id.speakerTitleTextView);

        nameView.setText(speakerName[position]);
        //imageView.setImageResource(imgid[position]);
        titleView.setText("Description "+speakerName[position]);

        return rowView;

    };
}