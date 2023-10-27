package com.daizzyinfo.chipnavigation_demo.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.daizzyinfo.chipnavigation_demo.Model.LawyersDetailsResponse;
import com.daizzyinfo.chipnavigation_demo.Model.TimeslotModel;
import com.daizzyinfo.chipnavigation_demo.R;

import java.util.List;

public class TimeslotAdapter extends RecyclerView.Adapter<TimeslotAdapter.MainVH> {
   //  List<LawyersDetailsResponse> detailsResponses;
   List<TimeslotModel> timeslotModels;
   Context context;

    public TimeslotAdapter(List<TimeslotModel> timeslotModels, Context context) {
        this.timeslotModels = timeslotModels;
        this.context = context;
    }

    @NonNull
    @Override
    public TimeslotAdapter.MainVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

       View view = LayoutInflater.from(context).inflate(R.layout.timeslot_item_rcv,parent,false);
       return new MainVH(view);

    }

    @Override
    public void onBindViewHolder(@NonNull TimeslotAdapter.MainVH holder, int position) {

        holder.txt_timeslot.setText(timeslotModels.get(position).getTimeslot().toString());

    }

    @Override
    public int getItemCount() {

        return timeslotModels.size();

    }

    public class MainVH extends RecyclerView.ViewHolder {

        TextView txt_timeslot;

        public MainVH(@NonNull View itemView) {
            super(itemView);

            txt_timeslot=itemView.findViewById(R.id.txt_timeslot);


        }
    }
}
