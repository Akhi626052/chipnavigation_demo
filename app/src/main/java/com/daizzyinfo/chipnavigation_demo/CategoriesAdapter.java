package com.daizzyinfo.chipnavigation_demo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class CategoriesAdapter extends RecyclerView.Adapter<CategoriesAdapter.MainVH> {

    List<CategoriesModel> CategoriesModel;
    Context context;


    public CategoriesAdapter(List<com.daizzyinfo.chipnavigation_demo.CategoriesModel> categoriesModel, Context context) {
        CategoriesModel = categoriesModel;
        this.context = context;
    }


    @NonNull
    @Override
    public CategoriesAdapter.MainVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.categories_item_rey, parent, false);
        return new MainVH(view);

    }

    @Override
    public void onBindViewHolder(@NonNull CategoriesAdapter.MainVH holder, int position) {
   /*holder.categories_tv.setText(CategoriesModel.get(position).getCategories_tv());
    holder.categories_ig.setImageResource(CategoriesModel.get(position).getCategories_ig());*/
        holder.categories_tv.setText(CategoriesModel.get(position).getData().get(position).getName());
       // holder.categories_ig.setImageResource(CategoriesModel.get(position).getData().get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return CategoriesModel.size();
    }

    public class MainVH extends RecyclerView.ViewHolder {
        TextView categories_tv;
        ImageView categories_ig;
        public MainVH(@NonNull View itemView) {
            super(itemView);
            categories_tv=itemView.findViewById(R.id.categories_tv);
            categories_ig=itemView.findViewById(R.id.categories_ig);


        }
    }
}
