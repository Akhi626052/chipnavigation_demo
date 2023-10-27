package com.daizzyinfo.chipnavigation_demo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class AllCategoriesAdapter extends RecyclerView.Adapter<AllCategoriesAdapter.MainVH> {
List<AllCategoriesModel> categoriesModels;
Context context;

    public AllCategoriesAdapter(List<AllCategoriesModel> categoriesModels, Context context) {
        this.categoriesModels = categoriesModels;
        this.context = context;
    }

    @NonNull
    @Override
    public AllCategoriesAdapter.MainVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.all_categories_rey,parent,false);
        return new AllCategoriesAdapter.MainVH(view);

    }

    @Override
    public void onBindViewHolder(@NonNull AllCategoriesAdapter.MainVH holder, int position) {
       holder.categories_tv.setText(categoriesModels.get(position).getCategories_tv());


    }

    @Override
    public int getItemCount() {
        return categoriesModels.size();
    }

    public class MainVH extends RecyclerView.ViewHolder {
        TextView categories_tv;
        public MainVH(@NonNull View itemView) {
            super(itemView);
            categories_tv=itemView.findViewById(R.id.categories_tv);

        }
    }
}
