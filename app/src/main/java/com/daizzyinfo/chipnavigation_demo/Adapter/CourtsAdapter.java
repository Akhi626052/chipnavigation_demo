package com.daizzyinfo.chipnavigation_demo.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.daizzyinfo.chipnavigation_demo.Model.CourtsModel;
import com.daizzyinfo.chipnavigation_demo.R;

import java.util.List;

public class CourtsAdapter extends RecyclerView.Adapter<CourtsAdapter.MainVHr> {
    List<CourtsModel> courtsModels;
    Context context;

    public CourtsAdapter(List<CourtsModel> courtsModels, Context context) {
        this.courtsModels = courtsModels;
        this.context = context;
    }

    @NonNull
    @Override
    public CourtsAdapter.MainVHr onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.courts,parent,false);
         return new CourtsAdapter.MainVHr(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CourtsAdapter.MainVHr holder, int position) {


holder.tv_adj.setText(courtsModels.get(position).getData().get(position).getCourtName());

      //  holder.tv_adj.setText(courtsModels.get(position).getTv_adj());


    }

    @Override
    public int getItemCount() {
        return courtsModels.size();
    }

    public class MainVHr extends RecyclerView.ViewHolder {
        TextView tv_adj;
        public MainVHr(@NonNull View itemView) {
            super(itemView);

            tv_adj=itemView.findViewById(R.id.tv_adj);


        }
    }
}
