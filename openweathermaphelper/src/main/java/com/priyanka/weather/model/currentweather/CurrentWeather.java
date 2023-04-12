package com.priyanka.weather.model.currentweather;

import com.google.gson.annotations.SerializedName;
import com.priyanka.weather.model.common.Clouds;
import com.priyanka.weather.model.common.Main;
import com.priyanka.weather.model.common.Rain;
import com.priyanka.weather.model.common.Snow;
import com.priyanka.weather.model.common.Weather;
import com.priyanka.weather.model.common.Wind;
import com.priyanka.weather.model.common.Coord;
import com.priyanka.weather.model.common.Sys;

import java.util.List;



public class CurrentWeather {

    @SerializedName("coord")
    private Coord coord;

    @SerializedName("weather")
    private List<Weather> weather;

    @SerializedName("base")
    private String base;

    @SerializedName("main")
    private Main main;

    @SerializedName("visibility")
    private Long visibility;

    @SerializedName("wind")
    private Wind wind;

    @SerializedName("clouds")
    private Clouds clouds;

    @SerializedName("rain")
    private Rain rain;

    @SerializedName("snow")
    private Snow snow;

    @SerializedName("dt")
    private Long dt;

    @SerializedName("sys")
    private Sys sys;

    @SerializedName("timezone")
    private Long timezone;

    @SerializedName("id")
    private Long id;

    @SerializedName("name")
    private String name;

    @SerializedName("cod")
    private Integer cod;

    public Coord getCoord() {
        return coord;
    }

    public List<Weather> getWeather() {
        return weather;
    }

    public String getBase() {
        return base;
    }

    public Main getMain() {
        return main;
    }

    public Long getVisibility() {
        return visibility;
    }

    public Wind getWind() {
        return wind;
    }

    public Clouds getClouds() {
        return clouds;
    }

    public Rain getRain() {
        return rain;
    }

    public Snow getSnow() {
        return snow;
    }

    public Long getDt() {
        return dt;
    }

    public Sys getSys() {
        return sys;
    }

    public Long getTimezone() {
        return timezone;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getCod() {
        return cod;
    }
}
