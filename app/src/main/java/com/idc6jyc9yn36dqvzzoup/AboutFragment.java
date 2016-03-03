package com.idc6jyc9yn36dqvzzoup;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.text.TextDirectionHeuristic;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

public class AboutFragment extends Fragment {

    String headline = "TEDxOhioStateUniversity is a student organization at Ohio State founded in 2011 and comprises of mainly undergraduate students and university faculty. It is locally funded by various sponsors at Ohio State and within Columbus. Student members organize an annual event comprising of TED Talk videos and live speakers from the greater Ohio State University community.";
    String curatorMessage = "Welcome to the fifth annual TEDxOhioStateUniversity conference!\n\nThe TEDxOhioStateUniversity team has worked tirelessly to curate a day of inspiring ideas worth spreading, and we are so proud to present a lineup of powerful speakers and performers that will transform your perceptions and reconstruct your realities.\n\nNone of this could have been possible without the dedication of fifty-five hard-working students, the generosity of our partners, and guidance of our three incredible faculty advisors. We are also eternally grateful to the engaged Buckeyes who fill this auditorium year after year. Thank you for joining us in our mission of showcasing the stories, innovations, and experiences of your fellow peers, faculty, and alumni.\n\nToday, we invite you to join us with an open mind and a willingness to contribute to the collective conversation of existing realities. Most importantly, we challenge you to reconstruct your own.";
    String aboutTEDText = "TED is a nonprofit organization devoted to \"ideas worth spreading\".";
    String aboutTEDxText = "In the spirit of ideas worth spreading, TEDx is a program of local, self-organized events that bring people together to share a TED-like experience.";

    String[] sectionHeaders = new String[]{
            "Executive Board", "Communications Committee", "Logistics Committee", "Community Engagement", "Design Committee", "Finance Committee", "Content Committee", "Marketing Committee", "Advisors"
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

    int[] sponsorImages = new int[]{
        R.drawable.sponsor_ares,
        R.drawable.sponsor_baronfig,
        R.drawable.sponsor_bartha,
        R.drawable.sponsor_crimson,
        R.drawable.sponsor_dlcouch,
        R.drawable.sponsor_interface,
        R.drawable.sponsor_kind,
        R.drawable.sponsor_king,
        R.drawable.sponsor_maharam,
        R.drawable.sponsor_panera,
        R.drawable.sponsor_reckon,
        R.drawable.sponsor_unofficialcardboard,
        R.drawable.sponsor_wexarts,
        R.drawable.sponsor_wosu

    };

    String[] sponsorLinks = new String[]{
        "https://areswear.com/",
        "http://www.baronfig.com/",
        "http://bartha.com/",
        "http://www.crimsoncup.com/",
        "http://www.dlcouch.com/",
        "http://www.interface.com/US/en-US/homepage",
        "http://www.kindsnacks.com/",
        "http://www.kbiinc.com/",
        "http://maharam.com/",
        "https://www.panerabread.com/en-us/home.html",
        "http://www.reckonreclaimed.com/",
        "http://www.unofficialcardboard.com/",
        "http://www.wexarts.org/",
        "http://wosu.org/"
    };


    private TeamListAdapter mAdapter;

    Intent intent;

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
        View rootView =  inflater.inflate(R.layout.fragment_about, container, false);

        ((TextView) rootView.findViewById(R.id.aboutHeadlineText)).setText(headline);
        ((TextView) rootView.findViewById(R.id.curatorMessageText)).setText(curatorMessage);
        ((TextView) rootView.findViewById(R.id.aboutTEDText)).setText(aboutTEDText);
        ((TextView) rootView.findViewById(R.id.aboutTedxText)).setText(aboutTEDxText);
        ((TextView) rootView.findViewById(R.id.appDeveloperName)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ishmeetgrewal.com"));
                startActivity(intent);
            }
        });

        ((TextView) rootView.findViewById(R.id.aboutTedLink)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ted.com"));
                startActivity(intent);
            }
        });

        ((TextView) rootView.findViewById(R.id.aboutTedxLink)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ted.com/about/programs-initiatives/tedx-program"));
                startActivity(intent);
            }
        });

        rootView.findViewById(R.id.sponsorOsuImage).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.osu.edu"));
                startActivity(intent);
            }
        });

        rootView.findViewById(R.id.sponsorKanodiaImage).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://kanodiamd.com/"));
                startActivity(intent);
            }
        });

        rootView.findViewById(R.id.sponsorEvolucixImage).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.evolucix.com/"));
                startActivity(intent);
            }
        });


        ListView lv = (ListView) rootView.findViewById(R.id.listview_team);

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


        //Add Sponsor Image Views
        LinearLayout sponsorLayout = (LinearLayout) rootView.findViewById(R.id.sponsorScrollLayout);

        ImageButton[] sponsorButtons = new ImageButton[14];

        for (int i=0; i<sponsorImages.length; i++){
            sponsorButtons[i] = new ImageButton(getContext());
            sponsorButtons[i].setImageResource(sponsorImages[i]);
            sponsorButtons[i].setOnClickListener(SponsorClickListener);
            sponsorButtons[i].setBackgroundColor(Color.TRANSPARENT);
            sponsorButtons[i].setMaxHeight(100);
            sponsorButtons[i].setPadding(0,0,40,0);
            sponsorButtons[i].setAdjustViewBounds(true);
            sponsorButtons[i].setTag(i);
            sponsorButtons[i].setId(i);


            sponsorLayout.addView(sponsorButtons[i]);
        }




        return rootView;
    }


    private View.OnClickListener SponsorClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int selected_item = (Integer) v.getTag();
            System.out.println(selected_item);
            intent = new Intent(Intent.ACTION_VIEW, Uri.parse(sponsorLinks[selected_item]));
            startActivity(intent);
        }
    };
}