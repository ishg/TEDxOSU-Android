package com.idc6jyc9yn36dqvzzoup;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.text.TextDirectionHeuristic;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

public class AboutFragment extends Fragment {

    String headline = "TEDxOhioStateUniversity is a student organization at Ohio State founded in 2011 and comprises of mainly undergraduate students and university faculty. It is locally funded by various sponsors at Ohio State and within Columbus. Student members organize an annual event comprising of TED Talk videos and live speakers from the greater Ohio State University community.";
    String curatorMessage = "I am more than thrilled to see what this upcoming year has in store for TEDxOhioStateUniversity! After four years on campus, we are ready to take the TEDx experience to a new level this March 5, 2016 at the Mershon Auditorium. While we have many new and exciting things lined up for the year ahead, our organization still works under the mission of cultivating an event for students and city leaders who are passionate about challenging ideas and inspiring others. With this mission in mind, our team will work tirelessly to make this year’s event the best and most innovative the university has yet witnessed. I am confident that with the help of our outstanding partners, we will achieve these goals, allowing Ohio State University to join an international community of thinkers and doers. I could not be prouder to be a part of such an ambitious group of individuals, and I hope that you will join us along this exciting journey as we inspire OSU one idea worth spreading at a time.";
    String aboutTEDText = "TED is a nonprofit organization devoted to \"ideas worth spreading\".";
    String aboutTEDxText = "In the spirit of ideas worth spreading, TEDx is a program of local, self-organized events that bring people together to share a TED-like experience.";

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


    private TeamListAdapter mAdapter;

    public AboutFragment() {
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
        View rootview =  inflater.inflate(R.layout.fragment_about, container, false);

        ((TextView) rootview.findViewById(R.id.aboutHeadlineText)).setText(headline);
        ((TextView) rootview.findViewById(R.id.curatorMessageText)).setText(curatorMessage);
        ((TextView) rootview.findViewById(R.id.aboutTEDText)).setText(aboutTEDText);
        ((TextView) rootview.findViewById(R.id.aboutTedxText)).setText(aboutTEDxText);

        ListView lv = (ListView) rootview.findViewById(R.id.listview_team);

        mAdapter = new TeamListAdapter(getActivity());

        for (int i=0; i < sectionHeaders.length; i++){
            mAdapter.addSectionHeaderItem(sectionHeaders[i]);

            for(int j=0; j < members[i].length; j++){
                mAdapter.addItem(members[i][j]);
            }
        }

        lv.setEnabled(false);
        lv.setDivider(null);
        lv.setAdapter(mAdapter);



        return rootview;
    }
}