package com.priyanka.openweather;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.SearchView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;

import com.kwabenaberko.openweathermaplib.constant.Languages;
import com.kwabenaberko.openweathermaplib.constant.Units;
import com.kwabenaberko.openweathermaplib.implementation.OpenWeatherMapHelper;
import com.kwabenaberko.openweathermaplib.implementation.callback.CurrentWeatherCallback;
import com.kwabenaberko.openweathermaplib.model.currentweather.CurrentWeather;


public class MainActivity extends AppCompatActivity {

    public static final String TAG = MainActivity.class.getSimpleName();
    TextView tv;
     AppCompatTextView tvMinmax,tvHumidity,tvPressure,tvWind,tvTemp,tvTempDetails,tvAddress;
     AppCompatImageView imageViewWeather;
    SearchView search_view;
    OpenWeatherMapHelper helper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=findViewById(R.id.tv);
        tvTemp=findViewById(R.id.tvTemp);
        tvTempDetails=findViewById(R.id.tvTempDetails);
        tvAddress=findViewById(R.id.tvAddress);
        tvMinmax=findViewById(R.id.tvMinmax);
        tvHumidity=findViewById(R.id.tvHumidity);
        tvPressure=findViewById(R.id.tvPressure);
        tvWind=findViewById(R.id.tvWind);
        imageViewWeather=findViewById(R.id.ivWeather);
        search_view=findViewById(R.id.search_view);
         helper = new OpenWeatherMapHelper(getString(R.string.OPEN_WEATHER_MAP_API_KEY));
        helper.setUnits(Units.IMPERIAL);
        helper.setLanguage(Languages.ENGLISH);
        tv.setVisibility(View.GONE);
        weather("USA");
        search_view.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                   weather(query);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });

    }

    private void weather(String query) {
        helper.getCurrentWeatherByCityName(query, new CurrentWeatherCallback() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onSuccess(CurrentWeather currentWeather) {
                tv.setVisibility(View.GONE);
                tvHumidity.setText(""+currentWeather.getMain().getHumidity()+" %");
                tvPressure.setText(""+currentWeather.getMain().getPressure()+" hpa");
                tvWind.setText(""+currentWeather.getWind().getSpeed()+" mph");
                tvMinmax.setText(""+currentWeather.getMain().getTempMin()+"/"+currentWeather.getMain().getTempMax());
                tvTemp.setText(""+currentWeather.getMain().getTempMax());
                tvTempDetails.setText(""+currentWeather.getWeather().get(0).getDescription());
                tvAddress.setText(""+ currentWeather.getName()+ ", " + currentWeather.getSys().getCountry());
                setDescriptionAgId(String.valueOf(currentWeather.getWeather().get(0).getId()));

            }

            @Override
            public void onFailure(Throwable throwable) {
                Log.v(TAG, throwable.getMessage());
                tv.setVisibility(View.VISIBLE);
            }
        });

    }

    private void setDescriptionAgId(String id) {
        if (id.equals("200")) {

            imageViewWeather.setBackgroundDrawable(getResources().getDrawable(R.drawable.seventh_weather));

        } else if (id.equals("201")) {

            imageViewWeather.setBackgroundDrawable(getResources().getDrawable(R.drawable.seventh_weather));

        } else if (id.equals("202")) {

            imageViewWeather.setBackgroundDrawable(getResources().getDrawable(R.drawable.seventh_weather));

        } else if (id.equals("210")) {

            imageViewWeather.setBackgroundDrawable(getResources().getDrawable(R.drawable.seventh_weather));

        } else if (id.equals("211")) {

            imageViewWeather.setBackgroundDrawable(getResources().getDrawable(R.drawable.seventh_weather));

        } else if (id.equals("212")) {

            imageViewWeather.setBackgroundDrawable(getResources().getDrawable(R.drawable.seventh_weather));

        } else if (id.equals("221")) {

            imageViewWeather.setBackgroundDrawable(getResources().getDrawable(R.drawable.seventh_weather));

        } else if (id.equals("230")) {

            imageViewWeather.setBackgroundDrawable(getResources().getDrawable(R.drawable.seventh_weather));

        } else if (id.equals("231")) {

            imageViewWeather.setBackgroundDrawable(getResources().getDrawable(R.drawable.seventh_weather));

        } else if (id.equals("232")) {

            imageViewWeather.setBackgroundDrawable(getResources().getDrawable(R.drawable.seventh_weather));

        } else if (id.equals("300")) {

            imageViewWeather.setBackgroundDrawable(getResources().getDrawable(R.drawable.fifth_weather));

        } else if (id.equals("301")) {

            imageViewWeather.setBackgroundDrawable(getResources().getDrawable(R.drawable.fifth_weather));

        } else if (id.equals("302")) {

            imageViewWeather.setBackgroundDrawable(getResources().getDrawable(R.drawable.fifth_weather));

        } else if (id.equals("310")) {

            imageViewWeather.setBackgroundDrawable(getResources().getDrawable(R.drawable.fifth_weather));

        } else if (id.equals("311")) {

            imageViewWeather.setBackgroundDrawable(getResources().getDrawable(R.drawable.fifth_weather));

        } else if (id.equals("312")) {

            imageViewWeather.setBackgroundDrawable(getResources().getDrawable(R.drawable.fifth_weather));

        } else if (id.equals("313")) {

            imageViewWeather.setBackgroundDrawable(getResources().getDrawable(R.drawable.fifth_weather));

        } else if (id.equals("314")) {

            imageViewWeather.setBackgroundDrawable(getResources().getDrawable(R.drawable.fifth_weather));

        } else if (id.equals("321")) {

            imageViewWeather.setBackgroundDrawable(getResources().getDrawable(R.drawable.fifth_weather));

        } else if (id.equals("500")) {

            imageViewWeather.setBackgroundDrawable(getResources().getDrawable(R.drawable.sixth_weather));

        } else if (id.equals("501")) {

            imageViewWeather.setBackgroundDrawable(getResources().getDrawable(R.drawable.sixth_weather));

        } else if (id.equals("502")) {

            imageViewWeather.setBackgroundDrawable(getResources().getDrawable(R.drawable.sixth_weather));

        } else if (id.equals("503")) {

            imageViewWeather.setBackgroundDrawable(getResources().getDrawable(R.drawable.sixth_weather));

        } else if (id.equals("504")) {

            imageViewWeather.setBackgroundDrawable(getResources().getDrawable(R.drawable.sixth_weather));

        } else if (id.equals("511")) {

            imageViewWeather.setBackgroundDrawable(getResources().getDrawable(R.drawable.eighth_weather));

        } else if (id.equals("520")) {

            imageViewWeather.setBackgroundDrawable(getResources().getDrawable(R.drawable.fifth_weather));

        } else if (id.equals("521")) {

            imageViewWeather.setBackgroundDrawable(getResources().getDrawable(R.drawable.fifth_weather));

        } else if (id.equals("522")) {

            imageViewWeather.setBackgroundDrawable(getResources().getDrawable(R.drawable.fifth_weather));

        } else if (id.equals("531")) {

            imageViewWeather.setBackgroundDrawable(getResources().getDrawable(R.drawable.fifth_weather));

        } else if (id.equals("600")) {

            imageViewWeather.setBackgroundDrawable(getResources().getDrawable(R.drawable.eighth_weather));

        } else if (id.equals("601")) {

            imageViewWeather.setBackgroundDrawable(getResources().getDrawable(R.drawable.eighth_weather));

        } else if (id.equals("602")) {

            imageViewWeather.setBackgroundDrawable(getResources().getDrawable(R.drawable.eighth_weather));

        } else if (id.equals("611")) {

            imageViewWeather.setBackgroundDrawable(getResources().getDrawable(R.drawable.eighth_weather));

        } else if (id.equals("612")) {

            imageViewWeather.setBackgroundDrawable(getResources().getDrawable(R.drawable.eighth_weather));

        } else if (id.equals("615")) {

            imageViewWeather.setBackgroundDrawable(getResources().getDrawable(R.drawable.eighth_weather));

        } else if (id.equals("616")) {

            imageViewWeather.setBackgroundDrawable(getResources().getDrawable(R.drawable.eighth_weather));

        } else if (id.equals("620")) {

            imageViewWeather.setBackgroundDrawable(getResources().getDrawable(R.drawable.eighth_weather));

        } else if (id.equals("621")) {

            imageViewWeather.setBackgroundDrawable(getResources().getDrawable(R.drawable.eighth_weather));

        } else if (id.equals("622")) {

            imageViewWeather.setBackgroundDrawable(getResources().getDrawable(R.drawable.eighth_weather));

        } else if (id.equals("701")) {

            imageViewWeather.setBackgroundDrawable(getResources().getDrawable(R.drawable.ninth_weather));

        } else if (id.equals("711")) {

            imageViewWeather.setBackgroundDrawable(getResources().getDrawable(R.drawable.ninth_weather));

        } else if (id.equals("721")) {

            imageViewWeather.setBackgroundDrawable(getResources().getDrawable(R.drawable.ninth_weather));

        } else if (id.equals("731")) {

            imageViewWeather.setBackgroundDrawable(getResources().getDrawable(R.drawable.ninth_weather));

        } else if (id.equals("741")) {

            imageViewWeather.setBackgroundDrawable(getResources().getDrawable(R.drawable.ninth_weather));

        } else if (id.equals("751")) {

            imageViewWeather.setBackgroundDrawable(getResources().getDrawable(R.drawable.ninth_weather));

        } else if (id.equals("761")) {

            imageViewWeather.setBackgroundDrawable(getResources().getDrawable(R.drawable.ninth_weather));

        } else if (id.equals("762")) {

            imageViewWeather.setBackgroundDrawable(getResources().getDrawable(R.drawable.ninth_weather));

        } else if (id.equals("771")) {

            imageViewWeather.setBackgroundDrawable(getResources().getDrawable(R.drawable.ninth_weather));

        } else if (id.equals("781")) {

            imageViewWeather.setBackgroundDrawable(getResources().getDrawable(R.drawable.ninth_weather));

        } else if (id.equals("800")) {

            imageViewWeather.setBackgroundDrawable(getResources().getDrawable(R.drawable.first_weather));

        } else if (id.equals("801")) {

            imageViewWeather.setBackgroundDrawable(getResources().getDrawable(R.drawable.second_weather));

        } else if (id.equals("802")) {

            imageViewWeather.setBackgroundDrawable(getResources().getDrawable(R.drawable.third_weather));

        } else if (id.equals("803")) {

            imageViewWeather.setBackgroundDrawable(getResources().getDrawable(R.drawable.fourth_weather));

        } else if (id.equals("804")) {

            imageViewWeather.setBackgroundDrawable(getResources().getDrawable(R.drawable.fourth_weather));

        }


    }

}
