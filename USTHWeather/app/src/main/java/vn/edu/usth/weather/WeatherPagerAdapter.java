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
            case 0: return ForecastFragment.newInstance("","page # 1");
            case 1: return WeatherFragment.newInstance("","page # 2");
            case 2: return WeatherAndForecastFragment.newInstance("","page # 3");
        }
        return new ForecastFragment();
    }
    @Override
    public CharSequence getPageTitle(int page) {
        final String[] titles = new String[] { "Hanoi", "Paris", "Toulouse" };
        return titles[page];
    }
}