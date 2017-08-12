package com.example.android.patialatourguideapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import static com.example.android.patialatourguideapp.R.string.hotel;

public class FragmentPageAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public FragmentPageAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new Attractions();
        } else if (position == 1) {
            return new Hotels();
        } else if (position == 2) {
            return new Restaurants();
        } else {
            return new Shopping();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.attraction);
        } else if (position == 1) {
            return mContext.getString(hotel);
        } else if (position == 2) {
            return mContext.getString(R.string.restaurant);
        } else {
            return mContext.getString(R.string.shopping);
        }
    }
}
