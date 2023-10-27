package com.daizzyinfo.chipnavigation_demo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.daizzyinfo.chipnavigation_demo.Fragment.HomeFragment;
import com.ismaeldivita.chipnavigation.ChipNavigationBar;

public class BottomNavigtionChipbar extends AppCompatActivity {
ChipNavigationBar chipnavigation;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bottom_navigation_chipbar);
        chipnavigation=findViewById(R.id.chipnavigation);
        chipnavigation.setItemSelected(R.id.nav_home,true);

        OpenFragment(new HomeFragment());




        chipnavigation.setOnItemSelectedListener(new ChipNavigationBar.OnItemSelectedListener() {
            @Override
            public void onItemSelected(int i) {
                int id = i;
                if(id==R.id.nav_home) {

                    OpenFragment(new HomeFragment());


                }else if(id == R.id.nav_all_lawyers) {

                    Intent intent = new Intent(BottomNavigtionChipbar.this,AllLawyers.class);
                    startActivity(intent);

                    Toast.makeText(BottomNavigtionChipbar.this, "all lawyers", Toast.LENGTH_SHORT).show();

                }
                else if (id == R.id.nav_appointment) {

                    Intent intent=new Intent(BottomNavigtionChipbar.this,Appointments.class);
                    startActivity(intent);

                    Toast.makeText(BottomNavigtionChipbar.this, "appointments", Toast.LENGTH_SHORT).show();

                } else if (id == R.id.nav_settings) {

                    Intent intent=new Intent(BottomNavigtionChipbar.this,Setting.class);
                    startActivity(intent);

                    Toast.makeText(BottomNavigtionChipbar.this, "setting", Toast.LENGTH_SHORT).show();

                }

            }
        });




    }
    protected void onResume() {
        super.onResume();

        chipnavigation.setItemSelected(R.id.nav_home,true);
        OpenFragment(new HomeFragment());

    }

    public void OpenFragment(Fragment fragment)
    {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.framlayout, fragment, "fragment_screen");
        transaction.addToBackStack(null);
        transaction.commit();
    }
}