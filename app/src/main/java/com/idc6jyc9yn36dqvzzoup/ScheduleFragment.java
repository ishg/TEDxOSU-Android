package com.idc6jyc9yn36dqvzzoup;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import java.util.List;

public class ScheduleFragment extends Fragment {


    private ScheduleListAdapter mAdapter;
    String[] sectionHeaders = new String[]{
            "Executive Board","Communications Committee", "Logistics Committee", "Community Engagement", "Design Committee", "Finance Committee", "Content Committee", "Marketing Committee", "Advisors"
    };

    String[][] members = new String[][]{
            {
                    "Stephany Tabet",
                    "    Curator",
                    "Avish Jain",
                    "    Director of Communications",
                    "Alex Cochran",
                    "    Director of Content",
                    "Shivang Patel",
                    "    Director of Finance & Development",
                    "Holly Rack",
                    "    Director of Logistics",
                    "Therese Rajasekera",
                    "    Director of Community Engagement",
                    "Brandon Muschlitz",
                    "    Director of Marketing",
                    "Raine McMullen",
                    "    Director of Design"
            },
            {
                    "Tracey Okine",
                    "Liv Birdsall",
                    "Joel Salas",
                    "Viv Le",
                    "Sri Karri",
                    "Maheen Nadeem"
            },
            {
                    "Cassandra Lechner",
                    "Jasneet Singh",
                    "Karan Rai",
                    "Afifah Ayub",
                    "Hallie Nudelman",
                    "Melissa Mahan",
                    "Nabiha Islam",
                    "Bailey Cross",
                    "Sara Liang"
            },
            {
                    "Ali Kovacevich",
                    "Alex Armeni",
                    "Caroline Klug",
                    "Vaughn Hunt"
            },
            {
                    "Wandi Xu",
                    "Nicole Riemer",
                    "Jacob Katz",
                    "Da Lee"
            },
            {
                    "Jay Jackson",
                    "Mengjia Li",
                    "Mansi Arora"
            },
            {
                    "Sarah Beadle",
                    "Vanja Tolj",
                    "Chanan Brown",
                    "Jordan Royster",
                    "Mehak Arora",
                    "Jessica Mongilio",
                    "Michael Watson",
                    "Jordan Moseley",
                    "Sierra Nave",
                    "Corey Keyser"
            },
            {
                    "Samantha Lechner",
                    "Deepti Gupta",
                    "Elizabeth Parisi",
                    "Ryan Hines",
                    "Stephanie Payano",
                    "Jocelyn May",
                    "Greg Nagy",
                    "Mihir Baxi",
                    "Andrew Lewis",
                    "Lexi Hemker",
                    "Jessica Shakesprere"
            },
            {
                    "Jillian Baer",
                    "    College of Public Affairs, OSU",
                    "Dr. Amy Barnes",
                    "    Department of Educational Studies, OSU",
                    "Dr. Gretchen Metzelaars",
                    "    Office of Student Life, OSU"
            }
    };

    public ScheduleFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View rootView = inflater.inflate(R.layout.fragment_schedule, container, false);

        ListView lv = (ListView) rootView.findViewById(R.id.listview_schedule);

        mAdapter = new ScheduleListAdapter(getActivity());



        for (int i=0; i < sectionHeaders.length; i++){
            mAdapter.addSectionHeaderItem(sectionHeaders[i]);

            for(int j=0; j < members[i].length; j++){
                mAdapter.addItem(members[i][j]);
            }
        }

        lv.setAdapter(mAdapter);

        // Inflate the layout for this fragment

        return rootView;
    }

}
