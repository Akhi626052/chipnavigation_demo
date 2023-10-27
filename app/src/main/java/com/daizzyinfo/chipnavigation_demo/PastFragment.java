package com.daizzyinfo.chipnavigation_demo;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;

import com.daizzyinfo.chipnavigation_demo.Adapter.PastAdapter;
import com.daizzyinfo.chipnavigation_demo.Model.PastModel;

import java.util.ArrayList;
import java.util.List;

public class PastFragment extends Fragment {

    RecyclerView recyclerview_past;
    List<PastModel> pastModels=new ArrayList<>();
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

       View view= inflater.inflate(R.layout.past_fragment, container, false);
       recyclerview_past=view.findViewById(R.id.recyclerview_past);

       pastModels.add(new PastModel("Suksham Aggarwal","Male, 25 years","27/02/2023 | 12:30 PM","Cancelled"));
        pastModels.add(new PastModel("Suksham Aggarwal","Male, 25 years","27/02/2023 | 12:30 PM","Completed"));
        pastModels.add(new PastModel("Suksham Aggarwal","Male, 25 years","27/02/2023 | 12:30 PM","Upcoming"));


        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);

        PastAdapter pastAdapter=new PastAdapter(pastModels,getContext());

        recyclerview_past.setLayoutManager(layoutManager);
        recyclerview_past.setAdapter(pastAdapter);
       return view;
    }
}