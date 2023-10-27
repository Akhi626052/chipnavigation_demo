package com.daizzyinfo.chipnavigation_demo;

import static androidx.recyclerview.widget.LinearLayoutManager.*;
import static java.security.AccessController.getContext;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class AllCategories extends AppCompatActivity {
    RecyclerView All_Ct_rcy_id;
    List<AllCategoriesModel> allCategories=new ArrayList<AllCategoriesModel>();

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.all_categories);
        All_Ct_rcy_id=findViewById(R.id.All_Ct_rcy_id);
        allCategories.add(new AllCategoriesModel("Child Custody"));
        allCategories.add(new AllCategoriesModel("Child Custody"));
        allCategories.add(new AllCategoriesModel("Child Custody"));
        allCategories.add(new AllCategoriesModel("Child Custody"));
        allCategories.add(new AllCategoriesModel("Child Custody"));
        allCategories.add(new AllCategoriesModel("Child Custody"));
        allCategories.add(new AllCategoriesModel("Child Custody"));
        allCategories.add(new AllCategoriesModel("Child Custody"));
        allCategories.add(new AllCategoriesModel("Child Custody"));
        allCategories.add(new AllCategoriesModel("Child Custody"));



        AllCategoriesAdapter adapter=new AllCategoriesAdapter(allCategories,this);
        GridLayoutManager manager1 = new GridLayoutManager(this, 3, LinearLayoutManager.VERTICAL, false);
        All_Ct_rcy_id.setLayoutManager(manager1);
        All_Ct_rcy_id.setAdapter(adapter);




    }
}