package com.idc6jyc9yn36dqvzzoup;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by ishmeet on 2/10/16.
 */
public class SpeakersFragment extends Fragment {

    public SpeakersFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        String[] itemname ={
                "Safari",
                "Camera",
                "Global",
                "FireFox",
                "UC Browser",
                "Android Folder",
                "VLC Player",
                "Cold War"
        };

        Integer[] imgid={
                R.drawable.abd,
                R.drawable.austin,
                R.drawable.bailo,
                R.drawable.brehm,
                R.drawable.bria,
                R.drawable.carlarne,
                R.drawable.chess,
                R.drawable.cynthia,
        };




        View rootView = inflater.inflate(R.layout.fragment_speakers, container, false);

        SpeakerListAdapter adapter = new SpeakerListAdapter(getActivity(), itemname, imgid);

        // Get a reference to the ListView, and attach this adapter to it.
        ListView listView = (ListView) rootView.findViewById(R.id.listview_speakers);
        listView.setAdapter(adapter);

        // Inflate the layout for this fragment
        return rootView;
    }
}
