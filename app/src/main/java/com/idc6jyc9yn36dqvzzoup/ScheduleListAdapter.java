package com.idc6jyc9yn36dqvzzoup;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.TreeSet;

class ScheduleListAdapter extends BaseAdapter {

    private static final int TYPE_ITEM = 0;
    private static final int TYPE_SEPARATOR = 1;
    ImageLoader imageLoader = AppController.getInstance().getImageLoader();

    TextView textView, timeView;
    NetworkImageView imageView;

    private ArrayList<Pair<String,String>> mData = new ArrayList<Pair<String,String>>();
    private TreeSet<Integer> sectionHeader = new TreeSet<Integer>();

    private LayoutInflater mInflater;

    public ScheduleListAdapter(Context context) {
        mInflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public void addItem(final String text, final String image) {
        mData.add(new Pair<String, String>(text,image));
        notifyDataSetChanged();
    }

    public void addSectionHeaderItem(final String text, final String time) {
        mData.add(new Pair<String,String>(text,time));
        sectionHeader.add(mData.size() - 1);
        notifyDataSetChanged();
    }

    @Override
    public int getItemViewType(int position) {
        return sectionHeader.contains(position) ? TYPE_SEPARATOR : TYPE_ITEM;
    }

    @Override
    public int getViewTypeCount() {
        return 2;
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public Pair getItem(int position) {
        return mData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        if (imageLoader == null)
            imageLoader = AppController.getInstance().getImageLoader();

        int rowType = getItemViewType(position);

        switch (rowType) {
            case TYPE_ITEM:
                convertView = mInflater.inflate(R.layout.schedule_member_list_view, null);

                textView = (TextView) convertView.findViewById(R.id.speechTitle);
                imageView = (NetworkImageView) convertView.findViewById(R.id.scheduleImageView);

                textView.setText(mData.get(position).getL());
                imageView.setImageUrl(mData.get(position).getR(), imageLoader);

                break;
            case TYPE_SEPARATOR:
                convertView = mInflater.inflate(R.layout.schedule_header_list_view, null);

                textView = (TextView) convertView.findViewById(R.id.scheduleHeaderTitle);
                timeView = (TextView) convertView.findViewById(R.id.scheduleHeaderTime);

                textView.setText(mData.get(position).getL());
                timeView.setText(mData.get(position).getR());

                break;
        }

        return convertView;
    }

    public static class ViewHolder {
        public TextView textView;
    }

}
