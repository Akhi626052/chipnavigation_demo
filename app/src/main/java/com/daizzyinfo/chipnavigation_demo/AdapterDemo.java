package com.daizzyinfo.chipnavigation_demo;

import static androidx.viewpager.widget.PagerAdapter.POSITION_NONE;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class AdapterDemo extends FragmentStateAdapter {
    private DemoFragment2 demoFrag;
    public AdapterDemo(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {

       Fragment fragment = new DemoFragment();
        Bundle args = new Bundle();
        //args.putString(DemoFragment.TITLE,"Tabdsgfds"+(position+1));
        fragment.setArguments(args);



        demoFrag=new DemoFragment2();
        demoFrag.setArguments(args);
        return demoFrag;
        //return fragment;


    }

    @Override
    public int getItemCount() {

        return 2;

    }

    public int getItemPosition() {
        return 1;
    }


}
