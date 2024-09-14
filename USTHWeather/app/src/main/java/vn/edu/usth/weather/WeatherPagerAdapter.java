package vn.edu.usth.weather;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class WeatherPagerAdapter extends FragmentPagerAdapter {

    public WeatherPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getCount() {
        return 3;
    }

    @NonNull
    @Override
    public Fragment getItem(int page) {
        switch (page) {
            case 0: return new ForecastFragment();
            case 1: return new WeatherFragment();
            case 2: return new WeatherAndForecastFragment();
        }
        return new ForecastFragment();
    }
    @Override
    public CharSequence getPageTitle(int page) {
        final String[] titles = new String[] { "Hanoi", "Berlin", "Toulouse" };
        return titles[page];
    }
}