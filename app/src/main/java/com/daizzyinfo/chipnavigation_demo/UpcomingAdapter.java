package com.daizzyinfo.chipnavigation_demo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class UpcomingAdapter extends RecyclerView.Adapter<UpcomingAdapter.MainVH>{
List<UpcomingModel> upcoming;
Context context;

    public UpcomingAdapter(List<UpcomingModel> upcoming, Context context) {
        this.upcoming = upcoming;
        this.context = context;

    }

    @NonNull
    @Override
    public UpcomingAdapter.MainVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.upcoming_screen_rcy,parent,false);
        return new UpcomingAdapter.MainVH(view);

    }

    @Override
    public void onBindViewHolder(@NonNull UpcomingAdapter.MainVH holder, int position) {
holder.txt_name.setText(upcoming.get(position).getTxt_name());
holder.txt_age.setText(upcoming.get(position).getTxt_age());
holder.dt_id.setText(upcoming.get(position).getDt_id());
holder.UpcmStatus.setText(upcoming.get(position).getUpcmStatus());

    }

    @Override
    public int getItemCount() {
        return upcoming.size();
    }

    public class MainVH extends RecyclerView.ViewHolder {

        TextView txt_name,txt_age,dt_id,UpcmStatus;
        public MainVH(@NonNull View itemView) {
            super(itemView);
            txt_name = itemView.findViewById(R.id.txt_name);
            txt_age=itemView.findViewById(R.id.txt_age);
            dt_id=itemView.findViewById(R.id.dt_id);
            UpcmStatus=itemView.findViewById(R.id.UpcmStatus);

        }
    }
}
