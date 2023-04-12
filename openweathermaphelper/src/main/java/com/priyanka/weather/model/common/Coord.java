package com.priyanka.weather.model.common;

import com.google.gson.annotations.SerializedName;



public class Coord {

    @SerializedName("lon")
    private double lon;

    @SerializedName("lat")
    private double lat;

    public double getLon() {
        return lon;
    }

    public double getLat() {
        return lat;
    }
}
