package com.example.android.quakereport;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * Created by Alex on 19-Jun-17.
 * Information for a single earthquake
 */

public class Earthquake {

    /**
     * Earthquake information: magnitude / location / date / time
     */
    private double mMagnitude;
    private String mLocation;
    private String mDate;
    private long mTimeInMilliseconds;
    public final String mUrl;

    /**
     * Constructor to create an object
     */

//    //public Earthquake(String magnitude, String location, String date, Url)
//    public Earthquake(double magnitude, String location, long time) {
//        mMagnitude = magnitude;
//        mLocation = location;
//        //mDate = date;
//        mTimeInMilliseconds = time;
//    }

    //public Earthquake(String magnitude, String location, String date, Url)
    public Earthquake(double magnitude, String location, long time, String url) {
        mMagnitude = magnitude;
        mLocation = location;
        //mDate = date;
        mTimeInMilliseconds = time;
        mUrl = url;
    }

    /**
     * Return the earthquake magnitude
     */
    public double getMagnitude() {
        return mMagnitude;
    }

    /**
     * Return the earthquake location
     */
    public String getLocation() {
        return mLocation;
    }

//    /**
//     * Return the earthquake date
//     */
//    public String getDate() {
//        return mDate;
//    }

    /**
     * Return the earthquake time
     */
    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    /**
     * Return the earthquake url
     */
    public String getUrl() {
        return mUrl;
    }
}
