package com.priyanka.weather.implementation.callback;

import com.priyanka.weather.model.currentweather.CurrentWeather;

public interface CurrentWeatherCallback{
    void onSuccess(CurrentWeather currentWeather);
    void onFailure(Throwable throwable);
}
