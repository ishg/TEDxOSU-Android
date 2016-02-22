package com.idc6jyc9yn36dqvzzoup;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class Speaker {

    private String id;
    private String name;
    private String title;
    private String picture;
    private String lines;
    private String speech;

    public String getName() {
        return this.name;
    }

    public String getTitle() {
        return this.title;
    }

    public String getPicture() {
        return this.picture;
    }

    public String getLines(){
        return this.lines;
    }

    public String getSpeech(){
        return this.speech;
    }

    // Single object constructor
    public static Speaker fromJson(JSONObject jsonObject) {
        Speaker s = new Speaker();
        // Deserialize json into object fields
        try {
            s.name = jsonObject.getString("name");
            s.title = jsonObject.getString("title");
            s.picture = jsonObject.getString("picture");
            s.lines = jsonObject.getString("lines");
            s.speech = jsonObject.getString("speech");
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
        // Return new object
        return s;
    }

    //Array constructor
    public static ArrayList<Speaker> fromJson(JSONArray jsonArray) {
        ArrayList<Speaker> businesses = new ArrayList<Speaker>(jsonArray.length());

        // Process each result in json array, decode and convert to speaker object
        for (int i=0; i < jsonArray.length(); i++) {
            JSONObject speakerJson = null;
            try {
                speakerJson = jsonArray.getJSONObject(i);
            } catch (Exception e) {
                e.printStackTrace();
                continue;
            }

            Speaker speaker = Speaker.fromJson(speakerJson);
            if (speaker != null) {
                businesses.add(speaker);
            }
        }

        return businesses;
    }
}
