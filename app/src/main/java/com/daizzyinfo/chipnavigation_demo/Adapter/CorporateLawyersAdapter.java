package com.daizzyinfo.chipnavigation_demo.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.daizzyinfo.chipnavigation_demo.Model.CorporateLawyersModel;
import com.daizzyinfo.chipnavigation_demo.Model.CorporateLawyersResponse;
import com.daizzyinfo.chipnavigation_demo.R;

import java.util.List;

public class CorporateLawyersAdapter extends RecyclerView.Adapter<CorporateLawyersAdapter.MainVH> {
List<CorporateLawyersResponse> corporateLawyersResponses;
Context context;

    public CorporateLawyersAdapter(List<CorporateLawyersResponse> corporateLawyersResponses, Context context) {
        this.corporateLawyersResponses = corporateLawyersResponses;
        this.context = context;
    }

    @NonNull
    @Override
    public CorporateLawyersAdapter.MainVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view =LayoutInflater.from(context).inflate(R.layout.corporate_lawyers,parent,false);
        return new CorporateLawyersAdapter.MainVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CorporateLawyersAdapter.MainVH holder, int position) {
        holder.txt_name2.setText(corporateLawyersResponses.get(position).getData().get(position).getName());
        holder.txt_practice_areas2.setText(corporateLawyersResponses.get(position).getData().get(position).getPracticeAreas());
        holder.txt_experience2.setText(corporateLawyersResponses.get(position).getData().get(position).getExperience());
        holder.txt_address2.setText(corporateLawyersResponses.get(position).getData().get(position).getAddress());


    }

    @Override
    public int getItemCount() {
        return corporateLawyersResponses.size();
    }

    public class MainVH extends RecyclerView.ViewHolder {
        TextView txt_name2,txt_practice_areas2,txt_experience2,txt_address2;
        public MainVH(@NonNull View itemView) {
            super(itemView);
            txt_name2=itemView.findViewById(R.id.txt_name2);
            txt_practice_areas2=itemView.findViewById(R.id.txt_practice_areas2);
            txt_experience2=itemView.findViewById(R.id.txt_experience2);
            txt_address2=itemView.findViewById(R.id.txt_address2);

        }
    }
}
