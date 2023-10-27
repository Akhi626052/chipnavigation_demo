package com.daizzyinfo.chipnavigation_demo.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.daizzyinfo.chipnavigation_demo.Model.LawyersbycourtModel;
import com.daizzyinfo.chipnavigation_demo.R;

import java.util.ArrayList;
import java.util.List;

public class LawyersbycourtAdapter extends RecyclerView.Adapter<LawyersbycourtAdapter.MainVH> {
List<LawyersbycourtModel> lawyersbycourtModels;
Context context;

    public LawyersbycourtAdapter(List<LawyersbycourtModel> lawyersbycourtModels, Context context) {
        this.lawyersbycourtModels = lawyersbycourtModels;
        this.context = context;
    }


    @NonNull
    @Override
    public LawyersbycourtAdapter.MainVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.lawyers_by_court,parent,false);
        return new LawyersbycourtAdapter.MainVH(view);

    }

    @Override
    public void onBindViewHolder(@NonNull LawyersbycourtAdapter.MainVH holder, int position) {
        holder.tv_high_court.setText(lawyersbycourtModels.get(position).getTv_high_court());

    }

    @Override
    public int getItemCount() {
        return lawyersbycourtModels.size();
    }

    public class MainVH extends RecyclerView.ViewHolder {
        TextView tv_high_court;
        public MainVH(@NonNull View itemView) {
            super(itemView);
            tv_high_court=itemView.findViewById(R.id.tv_high_court);
        }
    }
}
