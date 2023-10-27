package com.daizzyinfo.chipnavigation_demo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class TopLawyersAdapter extends RecyclerView.Adapter<TopLawyersAdapter.MainVH> {
List<TopLawyersModel> models;

Context context;

    public TopLawyersAdapter(List<TopLawyersModel> models, Context context) {
        this.models = models;
        this.context = context;
    }

    @NonNull
    @Override
    public TopLawyersAdapter.MainVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.top_lawyers,parent,false);
        return new TopLawyersAdapter.MainVH(view);

    }

    @Override
    public void onBindViewHolder(@NonNull TopLawyersAdapter.MainVH holder, int position) {
        holder.ur_name.setText(models.get(position).getUr_name());
        holder.tv_det_inf.setText(models.get(position).getTv_det_inf());
        holder.experience.setText(models.get(position).getExperience());
        holder.lacation_tv.setText(models.get(position).getLacation_tv());
        holder.rupee.setText(models.get(position).getRupee());
        holder.tex_rating.setText(models.get(position).getTex_rating());

    }

    @Override
    public int getItemCount() {
        return models.size();
    }

    public class MainVH extends RecyclerView.ViewHolder{
        ImageView female;
        TextView ur_name,tv_det_inf,experience,lacation_tv,rupee,tex_rating;

        public MainVH(@NonNull View itemView) {
            super(itemView);
            ur_name=itemView.findViewById(R.id.ur_name);
            tv_det_inf=itemView.findViewById(R.id.tv_det_inf);
            experience=itemView.findViewById(R.id.experience);
            lacation_tv=itemView.findViewById(R.id.lacation_tv);
            rupee=itemView.findViewById(R.id.rupee);
            tex_rating=itemView.findViewById(R.id.tex_rating);


        }
    }
}
