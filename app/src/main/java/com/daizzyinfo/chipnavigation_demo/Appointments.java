package com.daizzyinfo.chipnavigation_demo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;
import java.util.List;

public class Appointments extends AppCompatActivity {

    ArrayList<Fragment> fragments=new ArrayList<Fragment>();
    ArrayList<String> title=new ArrayList<String>();


    TabLayout tabLayout;
     ViewPager viewpager;
     TabItem tab1,tab2;


    LinearLayout upcom_past_lr;
    FrameLayout frame_layout;
    TextView upcoming_id,past_id;
//List<UpcomingModel> models=new ArrayList<UpcomingModel>();




    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.appointments);


    /*    upcoming_id = findViewById(R.id.upcoming_id);
        past_id = findViewById(R.id.past_id);
        frame_layout = findViewById(R.id.frame_layout);
        upcom_past_lr = findViewById(R.id.upcom_past_lr);*/








        tab1=findViewById(R.id.tab1);
        tab2=findViewById(R.id.tab2);


        tabLayout=findViewById(R.id.tabLayout);
        viewpager=findViewById(R.id.viewpager);

       // tab1.setText("BeginningText");


        PastFragment pastFragment = new PastFragment();
        UpcomingFragment upcomingFragment = new UpcomingFragment();


       //ViewPagerAdapter viewPagerAdapter= new TabLayoutMediator(getSupportFragmentManager(), (TabLayout) tabLayout, viewpager, (TabLayoutMediator.TabConfigurationStrategy) (tab, position) ->
     /*   ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(),pastFragment,upcomingFragment, (TabLayout) tabLayout, viewpager, (TabLayoutMediator.TabConfigurationStrategy)(tab, position)->
                viewpager.setAdapter(viewPagerAdapter);*/



        ViewPagerAdapter adapters=new ViewPagerAdapter(getSupportFragmentManager(),2);
        adapters.addFragment(new PastFragment(),"fragment" );
        adapters.addFragment(new UpcomingFragment(), "titles");


    /*    tabLayout.addTab(tabLayout.newTab().setText("Home"));
        tabLayout.addTab(tabLayout.newTab().setText("Sport"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);*/

        viewpager.setAdapter(adapters);
        tabLayout.setupWithViewPager(viewpager);




    }



}


    /*    tabLayout.setupwithViewPager(viewpager);
      //  viewpager.setOffscreenPageLimit(2);
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(), 0);
        viewPagerAdapter.addFragment(upcomingFragment, "upcoming");
        viewPagerAdapter.addFragment(pastFragment, "past");

        viewpager.setAdapter(viewPagerAdapter);*/


// main code in tablayout in android studio
        /*AdapterDemo adapter=new AdapterDemo(getSupportFragmentManager(),getLifecycle());
        viewpager.setAdapter(adapter);

        new TabLayoutMediator((TabLayout) tabLayout, viewpager, (TabLayoutMediator.TabConfigurationStrategy) (tab, position) ->

                tab.setText("upcoming"+(position+1))).attach();
*/
      /*  UpcomingFragment upcoming=new UpcomingFragment();
        Bundle args=new Bundle();
        upcoming.setArguments(args);
        UpcomingAdapter adapter1=new UpcomingAdapter((List<UpcomingModel>) getSupportFragmentManager(),getLifecycle());
        viewpager.setAdapter(adapter1);*/




        /*tabLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(),PastFragment.class);
                startActivity(intent);

            }
        });*/


/*

        TabLayout.Tab firstTab = tabLayout.newTab();
        firstTab.setText("First");
        tabLayout.addView(ViewPager2.firstTab);
*/



     //   initonclick();




    

   /* public void onResume() {

        OpenFragment(new UpcomingFragment());
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
      // ft.replace(R.id.frame_layout,new Fragment(),"fragment_screen");

        ft.commit();
      //  layout.setVisibility(View.VISIBLE);
        super.onResume();


    }
*/
   /* private void initonclick() {

        upcoming_id.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                past_id.setTextColor(getResources().getColor(R.color.black));
                upcoming_id.setTextColor(getResources().getColor(R.color.parisGreen));
                OpenFragment(new UpcomingFragment());

            }
        });
        past_id.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                upcoming_id.setTextColor(getResources().getColor(R.color.black));
                past_id.setTextColor(getResources().getColor(R.color.parisGreen));
                OpenFragment(new PastFragment());

            }
        });

    }

    public void OpenFragment(Fragment fragment)
    {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_layout, fragment, "fragment_screen");
        transaction.addToBackStack(null);
        transaction.commit();
    }
*/
/*public void onBackPressed() {

    FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
    ft.addToBackStack(null);
    FragmentManager fm = getSupportFragmentManager();
    ((FragmentManager) fm).popBackStack(null, FragmentManager.POP_BACK_STACK_INCLUSIVE);
        super.onBackPressed();
}*/







