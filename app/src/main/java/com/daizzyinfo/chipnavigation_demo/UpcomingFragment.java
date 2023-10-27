package com.daizzyinfo.chipnavigation_demo;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class UpcomingFragment extends Fragment {
RecyclerView recycler_upcoming_id;
List <UpcomingModel> upcoming=new ArrayList<>();


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view= inflater.inflate(R.layout.upcoming_fragment, container, false);
        recycler_upcoming_id=view.findViewById(R.id.recycler_upcoming_id);
        upcoming.add(new UpcomingModel("Suksham Aggarwal","Male, 25 years","27/02/2023 | 12:30 PM","Cancelled"));
        upcoming.add(new UpcomingModel("Suksham Aggarwal","Male, 25 years","27/02/2023 | 12:30 PM","Cancelled"));
        RecyclerView.LayoutManager layoutManagerm=new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        UpcomingAdapter adapter=new UpcomingAdapter(upcoming,getContext());
        recycler_upcoming_id.setLayoutManager(layoutManagerm);
        recycler_upcoming_id.setAdapter(adapter);

       return view;






    }
}