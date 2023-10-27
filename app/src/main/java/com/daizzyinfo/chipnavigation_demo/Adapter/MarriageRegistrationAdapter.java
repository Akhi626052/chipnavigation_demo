package com.daizzyinfo.chipnavigation_demo.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.daizzyinfo.chipnavigation_demo.Model.MarriageRegistrationModel;
import com.daizzyinfo.chipnavigation_demo.R;

import java.util.List;

public class  MarriageRegistrationAdapter extends RecyclerView.Adapter<MarriageRegistrationAdapter.MainVH> {
    List<MarriageRegistrationModel> marriageRegistrationModel ;
    Context context;

    public MarriageRegistrationAdapter(List<MarriageRegistrationModel> marriageRegistrationModel, Context context) {
        this.marriageRegistrationModel = marriageRegistrationModel;
        this.context = context;
    }

    @NonNull
    @Override
    public MainVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.marriage_registration,parent,false);
        return new MainVH(itemView);

    }

    @Override
    public void onBindViewHolder(@NonNull MarriageRegistrationAdapter.MainVH holder, int position) {
        /*holder.mrg_details_id.setText(marriageRegistrationModel.get(position).getMrg_details_id());
        holder.mrg_details2_id.setText(marriageRegistrationModel.get(position).getMrg_details2_id());*/
        holder.mrg_details_id.setText(marriageRegistrationModel.get(position).getData().get(position).getTitleName());
        holder.mrg_details2_id.setText(marriageRegistrationModel.get(position).getData().get(position).getDescription());
    }

    @Override
    public int getItemCount() {
        return marriageRegistrationModel.size();
    }

    public class MainVH extends RecyclerView.ViewHolder {

        TextView mrg_details_id,mrg_details2_id;

        public MainVH(@NonNull View itemView) {
            super(itemView);
            mrg_details_id=itemView.findViewById(R.id.mrg_details_id);
            mrg_details2_id=itemView.findViewById(R.id.mrg_details2_id);

        }
    }
}
