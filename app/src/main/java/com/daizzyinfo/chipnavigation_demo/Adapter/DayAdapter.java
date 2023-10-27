package com.daizzyinfo.chipnavigation_demo.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.daizzyinfo.chipnavigation_demo.Model.DayModel;
import com.daizzyinfo.chipnavigation_demo.Model.LawyersDetailsResponse;
import com.daizzyinfo.chipnavigation_demo.R;

import java.util.List;

public class DayAdapter extends RecyclerView.Adapter<DayAdapter.MainVH> {
            List<DayModel> dayModels;
            Context context;

    public DayAdapter(List<DayModel> dayModels, Context context) {
        this.dayModels = dayModels;
        this.context = context;
    }

    @NonNull
    @Override
    public DayAdapter.MainVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.day_item_rcy,parent,false);
        return new DayAdapter.MainVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DayAdapter.MainVH holder, int position) {

        holder.days_txt.setText(dayModels.get(position).getPickDays());

    }

    @Override
    public int getItemCount() {
        return dayModels.size();
    }

    public class MainVH extends RecyclerView.ViewHolder {

        TextView days_txt;
        public MainVH(@NonNull View itemView) {
            super(itemView);
            days_txt=itemView.findViewById(R.id.days_txt);
        }
    }
}
