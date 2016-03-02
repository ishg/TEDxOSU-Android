package com.idc6jyc9yn36dqvzzoup;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

public class HomeFragment extends Fragment{
    private String headline = "Join TEDxOhioStateUniversity for our 5th annual event. This year's theme, Reconstructing Reality, will feature students, faculty, staff, and alumni as speakers and performers who will inspire and challenge our concepts of science, technology, history, and life.";
    private String locationLabel = "Mershon Auditorium";
    private String locationDesc = "1871 N High St, Columbus, OH";
    private String timeLabel = "Saturday, March 5th, 2016";
    private String timeDesc = "11 AM to 6 PM";
    private String parkInfo = "Doors open in the Ohio Union Archie Griffin Ballroom East at 11:00AM for check-in and a pre-event reception (with refreshments). You are required to check-in at the Ohio Union. The first 500 audience members who check-in will receive a surprise gift!\n\nFor those who are driving to campus, parking is available in the Ohio Union parking garages. The Ohio Union South Garage is preferred. Wheel-chair Accessible Parking is located in front of Mershon Auditorium and in both Ohio Union Garages. Please check with CampusParc for rates.";
    Context context;
    Intent intent;

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = getContext();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView =  inflater.inflate(R.layout.fragment_home, container, false);

        // Set the text for all the labels

        ((TextView) rootView.findViewById(R.id.homeHeadlineText)).setText(headline);
        ((TextView) rootView.findViewById(R.id.locationLabelText)).setText(locationLabel);
        ((TextView) rootView.findViewById(R.id.locationDescText)).setText(locationDesc);
        ((TextView) rootView.findViewById(R.id.timeLabelText)).setText(timeLabel);
        ((TextView) rootView.findViewById(R.id.timeDescText)).setText(timeDesc);
        ((TextView) rootView.findViewById(R.id.parkingInformation)).setText(parkInfo);


        // Set Onclick Listeners for the Social Buttons and Google Maps

        rootView.findViewById(R.id.locationLayout).setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                try {
                    context.getPackageManager().getPackageInfo("com.google.android.gms.maps", 0);
                    intent =  new Intent(Intent.ACTION_VIEW, Uri.parse("comgooglemapsurl://www.google.com/maps/place/Mershon+Auditorium/@40.000683,-83.0093077,15z/data=!4m2!3m1!1s0x0:0x988ef425d5b7d27e"));
                } catch (Exception e) {
                    intent =  new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Mershon+Auditorium/@40.000683,-83.0093077,15z/data=!4m2!3m1!1s0x0:0x988ef425d5b7d27e"));
                }
                startActivity(intent);
            }
        });

        rootView.findViewById(R.id.buttonWebsite).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://tedx.osu.edu"));
                startActivity(intent);

            }
        });
        rootView.findViewById(R.id.buttonFacebook).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click

                try {
                    context.getPackageManager().getPackageInfo("com.facebook.katana", 0);
                    intent = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://facewebmodal/f?href=https://www.facebook.com/TEDxOhioStateU"));
                } catch (Exception e) {
                    intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.facebook.com/TEDxOhioStateU"));
                }
                startActivity(intent);
            }
        });
        rootView.findViewById(R.id.buttonTwitter).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                try {
                    context.getPackageManager().getPackageInfo("com.android.twitter", 0);
                    intent = new Intent(Intent.ACTION_VIEW, Uri.parse("twitter://user?screen_name=TEDxOhioStateU"));
                } catch (Exception e) {
                    intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://twitter.com/TEDxOhioStateU"));
                }
                startActivity(intent);
            }
        });
        rootView.findViewById(R.id.buttonInstagram).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                try {
                    context.getPackageManager().getPackageInfo("com.android.instagram", 0);
                    intent = new Intent(Intent.ACTION_VIEW, Uri.parse("instagram://user?username=tedxohiostateu"));
                } catch (Exception e) {
                    intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://instagram.com/tedxohiostateu"));
                }
                startActivity(intent);
            }
        });
        rootView.findViewById(R.id.buttonYoutube).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=XSvhWs2M9JI&list=PLB18FCCC5AD700BFB"));
                startActivity(intent);
            }
        });

        rootView.findViewById(R.id.livestreamButton).setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                intent = new Intent(getActivity(), LivestreamActivity.class);
                startActivity(intent);
            }
        });

        return rootView;
    }

}
