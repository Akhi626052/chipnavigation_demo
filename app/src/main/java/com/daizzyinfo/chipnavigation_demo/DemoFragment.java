package com.daizzyinfo.chipnavigation_demo;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class DemoFragment extends Fragment {
TextView textView;
public static final String TITLE="title";


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.demo_fragment, container, false);
        
        textView=view.findViewById(R.id.textView);

       // textView.setText(getArguments().getString(TITLE));

       return view;

    }
}