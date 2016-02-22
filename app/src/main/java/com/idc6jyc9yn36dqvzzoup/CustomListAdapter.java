package com.idc6jyc9yn36dqvzzoup;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;

import java.util.List;

/**
 * Created by ishmeet on 2/21/16.
 */
public class CustomListAdapter extends BaseAdapter {
    private Activity activity;
    private LayoutInflater inflater;
    private List<Speaker> speakers;
    ImageLoader imageLoader = AppController.getInstance().getImageLoader();

    public CustomListAdapter(Activity activity, List<Speaker> speakers) {
        this.activity = activity;
        this.speakers = speakers;
    }

    @Override
    public int getCount() {
        return speakers.size();
    }

    @Override
    public Speaker getItem(int location) {
        return speakers.get(location);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (inflater == null)
            inflater = (LayoutInflater) activity
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (convertView == null)
            convertView = inflater.inflate(R.layout.speaker_list_view, null);

        if (imageLoader == null)
            imageLoader = AppController.getInstance().getImageLoader();

        NetworkImageView thumbNail = (NetworkImageView) convertView
                .findViewById(R.id.speakerImageView);

        TextView title = (TextView) convertView.findViewById(R.id.speakerTitleTextView);
        TextView name = (TextView) convertView.findViewById(R.id.speakerNameTextView);


        // getting movie data for the row
        Speaker s = speakers.get(position);

        // thumbnail image
        thumbNail.setImageUrl(s.getPicture(), imageLoader);

        // title
        title.setText(s.getTitle());

        // rating
        name.setText(s.getName());

        return convertView;
    }

}
