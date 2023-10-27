package com.daizzyinfo.chipnavigation_demo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class TodayAppointmentAdapter extends RecyclerView.Adapter<TodayAppointmentAdapter.MainVH>{

    List<TodayAppointmentModel> todayAppoint;
    Context context;

    public TodayAppointmentAdapter(List<TodayAppointmentModel> todayAppoint, Context context) {
        this.todayAppoint = todayAppoint;
        this.context = context;
    }

    @NonNull
    @Override
    public TodayAppointmentAdapter.MainVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.today_appointment_item_rey,parent,false);
        return new TodayAppointmentAdapter.MainVH(view);

    }

    @Override
    public void onBindViewHolder(@NonNull TodayAppointmentAdapter.MainVH holder, int position) {
        holder.user_name.setText(todayAppoint.get(position).getUser_name());
        holder.time_and_date_user.setText(todayAppoint.get(position).getTime_and_date_user());

    }

    @Override
    public int getItemCount() {
        return todayAppoint.size();
    }

    public class MainVH extends RecyclerView.ViewHolder {

        TextView user_name,time_and_date_user;

        public MainVH(@NonNull View itemView) {
            super(itemView);
            user_name=itemView.findViewById(R.id.user_name);
            time_and_date_user=itemView.findViewById(R.id.time_and_date_user);


        }
    }
}
