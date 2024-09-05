package vn.edu.usth.weather;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class WeatherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        HeaderFragment headerFragment = new HeaderFragment();
        fragmentTransaction.replace(R.id.fragment_container_header, headerFragment);

        ForecastFragment forecastFragment = new ForecastFragment();
        fragmentTransaction.replace(R.id.fragment_container_forecast, forecastFragment);

        fragmentTransaction.commit();
    }
}











