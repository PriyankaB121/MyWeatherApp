package com.priyanka.weather.model.common;

import com.google.gson.annotations.SerializedName;



public class Clouds {

    @SerializedName("all")
    private double all;

    public double getAll() {
        return all;
    }
}


