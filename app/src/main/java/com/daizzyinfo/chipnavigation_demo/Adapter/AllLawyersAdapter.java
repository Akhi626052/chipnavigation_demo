package com.daizzyinfo.chipnavigation_demo.Adapter;



import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.daizzyinfo.chipnavigation_demo.AboutLawyer;
import com.daizzyinfo.chipnavigation_demo.AllLawyers;
import com.daizzyinfo.chipnavigation_demo.Model.AllLawyersModel;
import com.daizzyinfo.chipnavigation_demo.Model.AllLawyersResponse;
import com.daizzyinfo.chipnavigation_demo.R;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class AllLawyersAdapter extends RecyclerView.Adapter<AllLawyersAdapter.MainVH>{
    List<AllLawyersResponse> allLawyersResponses = new ArrayList<>();

    Context context;


    public AllLawyersAdapter(List<AllLawyersResponse> allLawyersResponses, Context context) {
        this.allLawyersResponses = allLawyersResponses;
        this.context = context;
    }

    @NonNull
    @Override
    public AllLawyersAdapter.MainVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.lawyer_item_rcy,parent,false);
        return  new AllLawyersAdapter.MainVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AllLawyersAdapter.MainVH holder, @SuppressLint("RecyclerView") int position) {
        holder.name_id.setText(allLawyersResponses.get(position).getData().get(position).getName());
        holder.department_name_id.setText(allLawyersResponses.get(position).getData().get(position).getOfficeAddress());
        holder.experience_id.setText(allLawyersResponses.get(position).getData().get(position).getExperience());
        holder.address_txt.setText(allLawyersResponses.get(position).getData().get(position).getAddress());


        Glide.with(context)
                .load("https://odeguard.com/demo/lawyer/public/" +allLawyersResponses.get(position).getData().get(position).getProfile())
                .override(100, 100)
                .placeholder(R.drawable.fimal_ig)
                .error(R.drawable.fimal_ig)
                .into(holder.female_ic_id);



        holder.allLawyers_li_id.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.e("adapter  ", "ls id - " + allLawyersResponses.get(position).getData().get(position).getLsUid());
                Log.e("adapter  ", " staff id - " + allLawyersResponses.get(position).getData().get(position).getSuid());

                if(allLawyersResponses.get(position).getData().get(position).getLsUid() == null){

                    Intent intent=new Intent(context, AboutLawyer.class);
                    //intent.putExtra("ID",allLawyersResponses.get(position).getData().get(position).getSuid());
                    intent.putExtra("LsUid",allLawyersResponses.get(position).getData().get(position).getSuid());
                    intent.putExtra("Usertype","Staff");
                    context.startActivity(intent);

                }else if(allLawyersResponses.get(position).getData().get(position).getSuid() == null){

                    Intent intent=new Intent(context, AboutLawyer.class);
                    //intent.putExtra("ID",allLawyersResponses.get(position).getData().get(position).getSuid());
                    intent.putExtra("LsUid",allLawyersResponses.get(position).getData().get(position).getLsUid());
                    intent.putExtra("Usertype","Lawyer");
                    context.startActivity(intent);

                }


            }
        });

    }

   @Override
    public int getItemCount() {
        return allLawyersResponses.size();

    }

    public class MainVH extends RecyclerView.ViewHolder{
        TextView name_id,department_name_id,experience_id,address_txt;
        ImageView female_ic_id;
        LinearLayout allLawyers_li_id;

        public MainVH(@NonNull View itemView) {
            super(itemView);
            name_id=itemView.findViewById(R.id.name_id);
            department_name_id=itemView.findViewById(R.id.department_name_id);
            experience_id=itemView.findViewById(R.id.experience_id);
            address_txt=itemView.findViewById(R.id.address_txt);
            female_ic_id=itemView.findViewById(R.id.female_ic_id);
            allLawyers_li_id=itemView.findViewById(R.id.allLawyers_li_id);

        }
    }
}
