package com.daizzyinfo.chipnavigation_demo.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.daizzyinfo.chipnavigation_demo.CategoriesModel;
import com.daizzyinfo.chipnavigation_demo.R;
import com.daizzyinfo.chipnavigation_demo.searchmodel.CategoryModel;

import java.util.List;

public class SearchAdapter extends RecyclerView.Adapter<SearchAdapter.MainVH>{

    List<CategoryModel> catMod;
    Context context;

    public SearchAdapter(List<CategoryModel> catMod, Context context) {
        this.catMod = catMod;
        this.context = context;
    }

    @NonNull
    @Override
    public SearchAdapter.MainVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.item_search,parent,false);

        return new SearchAdapter.MainVH(view);

    }

    @Override
    public void onBindViewHolder(@NonNull MainVH holder, int position) {

        holder.text_names.setText(catMod.get(position).getName());


    }

    @Override
    public int getItemCount() {
        return catMod.size();

    }

           public class MainVH extends RecyclerView.ViewHolder {
           TextView text_names;
        public MainVH(@NonNull View itemView) {
            super(itemView);
            text_names=itemView.findViewById(R.id.text_names);

        }
    }
}
