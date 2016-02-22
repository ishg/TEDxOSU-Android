package com.idc6jyc9yn36dqvzzoup;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by ishmeet on 2/10/16.
 */
public class HomeFragment extends Fragment{
    private String headline = "Join TEDxOhioStateUniversity for our 5th annual event. This year's theme, Reconstructing Reality, will feature students, faculty, staff, and alumni as speakers and performers who will inspire and challenge our concepts of science, technology, history, and life.";
    private String locationLabel = "Mershon Auditorium";
    private String locationDesc = "1871 N High St, Columbus, OH";
    private String timeLabel = "Saturday, March 5th, 2016";
    private String timeDesc = "11 AM to 6 PM";

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView =  inflater.inflate(R.layout.fragment_home, container, false);

        ((TextView) rootView.findViewById(R.id.homeHeadlineText)).setText(headline);
        ((TextView) rootView.findViewById(R.id.locationLabelText)).setText(locationLabel);
        ((TextView) rootView.findViewById(R.id.locationDescText)).setText(locationDesc);
        ((TextView) rootView.findViewById(R.id.timeLabelText)).setText(timeLabel);
        ((TextView) rootView.findViewById(R.id.timeDescText)).setText(timeDesc);



        return rootView;
    }
}
