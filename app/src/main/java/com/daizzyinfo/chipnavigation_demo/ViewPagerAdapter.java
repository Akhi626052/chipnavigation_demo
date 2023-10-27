package com.daizzyinfo.chipnavigation_demo;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    ArrayList<Fragment> fragments=new ArrayList<Fragment>();
    ArrayList<String> title=new ArrayList<String>();



    public ViewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }




    public Fragment getItem() {

        return getItem(2);
    }

    public Fragment getItem(int position) {

        return fragments.get(position);

    }

    public int getCount() {

        return fragments.size();
    }
    public void addFragment(Fragment fragment,String titles) {

        fragments.add(fragment);
        title.add(titles);

    }


    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0: {
                return "Upcoming";

            }

            case 1: {
                return "Past";
            }
            default:
                return null;
        }
    }






    //return title.get(position);

    }

   /* public CharSequence getPageTitle(int position) {
        return (CharSequence) fragments.get(position);
    }*/




