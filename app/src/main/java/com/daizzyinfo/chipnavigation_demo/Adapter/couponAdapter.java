package com.daizzyinfo.chipnavigation_demo.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.daizzyinfo.chipnavigation_demo.Model.couponModel;
import com.daizzyinfo.chipnavigation_demo.R;

import java.util.ArrayList;
import java.util.List;

public class couponAdapter extends RecyclerView.Adapter<couponAdapter.MainVH> {
List<couponModel> couponList ;
Context context;

    public couponAdapter(List<couponModel> couponList, Context context) {
        this.couponList = couponList;
        this.context = context;
    }

    @NonNull
    @Override
    public couponAdapter.MainVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.coupon_item_rcy,parent,false);
        return new couponAdapter.MainVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull couponAdapter.MainVH holder, int position) {
   holder.coupon_code_txt.setText(couponList.get(position).getData().get(position).getCouponCode());
   holder.title_txt.setText(couponList.get(position).getData().get(position).getTitle());
   holder.user_type_txt.setText(couponList.get(position).getData().get(position).getUserType());

    }

    @Override
    public int getItemCount() {
        return couponList.size();
    }

    public class MainVH extends RecyclerView.ViewHolder{
TextView coupon_code_txt,title_txt,user_type_txt;
        public MainVH(@NonNull View itemView) {
            super(itemView);
            coupon_code_txt=itemView.findViewById(R.id.coupon_code_txt);
            title_txt=itemView.findViewById(R.id.title_txt);
            user_type_txt=itemView.findViewById(R.id.user_type_txt);




        }
    }
}
