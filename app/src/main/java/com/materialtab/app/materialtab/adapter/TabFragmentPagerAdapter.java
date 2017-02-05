package com.materialtab.app.materialtab.adapter;

/**
 * Created by Lenovo on 20/01/2017.
 */

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;

import com.materialtab.app.materialtab.fragment.Tab1Fragment;
import com.materialtab.app.materialtab.fragment.Tab2Fragment;


public class TabFragmentPagerAdapter extends FragmentPagerAdapter {
    //Nama Tab-nya
    String[] title = new String[]{
            "Tab 1", "Tab 2"
    };

    public TabFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }



    //Method ini yg akan memeanipulasi penampilan Fragment dilayar
    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position) {
            case 0:
                fragment = new Tab1Fragment();
                break;
            case 1:
                fragment = new Tab2Fragment();
                break;
            default:
                fragment = null;
                break;
        }
        return fragment;
    }


    @Override
    public CharSequence getPageTitle(int position) {
        return title[position];
    }

    @Override
    public int getCount() {
        return title.length;
    }


}