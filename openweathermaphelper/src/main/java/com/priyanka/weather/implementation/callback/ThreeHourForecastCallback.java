package com.priyanka.weather.implementation.callback;

import com.priyanka.weather.model.threehourforecast.ThreeHourForecast;

public interface ThreeHourForecastCallback{
    void onSuccess(ThreeHourForecast threeHourForecast);
    void onFailure(Throwable throwable);
}