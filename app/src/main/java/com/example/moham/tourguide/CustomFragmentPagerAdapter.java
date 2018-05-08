package com.example.moham.tourguide;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;


public class CustomFragmentPagerAdapter extends FragmentStatePagerAdapter {

    Context context;

    public CustomFragmentPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch(position) {
            case 0:
                return new FragmentOne();
            case 1:
                return new FragmentTwo();
            case 2:
                return new FragmentThree();
            case 3:
                return new FragmentFour();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch(position) {
            case 0:
                return  context.getString(R.string.fragment_one_header);
            case 1:
                return context.getString(R.string.fragment_two_header);
            case 2:
                return context.getString(R.string.fragment_three_header);
            case 3:
                return context.getString(R.string.fragment_four_header);
            default:
                return null;
        }
    }
}
