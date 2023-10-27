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

public class AvailableAdapter extends RecyclerView.Adapter<AvailableAdapter.MainVH> {

    List<AvailableModel> availableModels = new ArrayList<AvailableModel>();

    Context context;

    public AvailableAdapter(List<AvailableModel> availableModels, Context context) {
        this.availableModels = availableModels;
        this.context = context;
    }

    @NonNull
    @Override
    public AvailableAdapter.MainVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.day_item_rcy,parent,false);
        return new AvailableAdapter.MainVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AvailableAdapter.MainVH holder, int position) {
      holder.days_txt.setText(availableModels.get(position).getDays_txt());

    }

    @Override
    public int getItemCount() {
        return availableModels.size();
    }

    public class MainVH extends RecyclerView.ViewHolder {
        TextView days_txt;
        public MainVH(@NonNull View itemView) {
            super(itemView);
            days_txt=itemView.findViewById(R.id.days_txt);
        }
    }
}
