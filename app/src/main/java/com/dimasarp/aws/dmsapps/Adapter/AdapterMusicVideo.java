package com.dimasarp.aws.dmsapps.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.dimasarp.aws.dmsapps.DetailFragment.DetailMusicFragment;
import com.dimasarp.aws.dmsapps.DetailFragment.DetailVideoFragment;

public class AdapterMusicVideo extends FragmentStatePagerAdapter {
    //integer to count number of tabs
    int tabCount;

    //Constructor to the class
    public AdapterMusicVideo(FragmentManager fm, int tabCount) {
        super(fm);
        //Initializing tab count
        this.tabCount= tabCount;
    }

    //Overriding method getItem
    @Override
    public Fragment getItem(int position) {
        //Returning the current tabs
        switch (position) {
            case 0:
                DetailMusicFragment tab1 = new DetailMusicFragment();
                return tab1;
            case 1:
                DetailVideoFragment tab2 = new DetailVideoFragment();
                return tab2;
            default:
                return null;
        }
    }

    //Overriden method getCount to get the number of tabs
    @Override
    public int getCount() {
        return tabCount;
    }
}
