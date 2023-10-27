package com.daizzyinfo.chipnavigation_demo.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.daizzyinfo.chipnavigation_demo.Model.notificationModel;
import com.daizzyinfo.chipnavigation_demo.Model.notificationResponse;
import com.daizzyinfo.chipnavigation_demo.R;

import java.security.AccessControlContext;
import java.util.ArrayList;
import java.util.List;

public class NotificationAdapter extends RecyclerView.Adapter<NotificationAdapter.ViewVH> {

    List<notificationResponse>  notifResonse;
    Context context;

    public NotificationAdapter(List<notificationResponse> notifResonse, Context context) {
        this.notifResonse = notifResonse;
        this.context = context;
    }

    @NonNull
    @Override
    public NotificationAdapter.ViewVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.notification_item_rcy,parent,false);
        return new NotificationAdapter.ViewVH(view);


    }

    @Override
    public void onBindViewHolder(@NonNull NotificationAdapter.ViewVH holder, int position) {

        holder.title_name_txt.setText(notifResonse.get(position).getData().get(position).getTitleName());
        holder.description_txt.setText(notifResonse.get(position).getData().get(position).getDescription());
        holder.user_type_txt1.setText(notifResonse.get(position).getData().get(position).getUserType());
        //holder.status_txt1.setText(notifResonse.get(position).getData().get(position).getStatus());


    }

    @Override
    public int getItemCount() {
        return notifResonse.size();
    }

    public class ViewVH extends RecyclerView.ViewHolder {

        TextView title_name_txt,description_txt,user_type_txt1,status_txt1;
        public ViewVH(@NonNull View itemView) {
            super(itemView);

            title_name_txt=itemView.findViewById(R.id.title_name_txt);
            description_txt=itemView.findViewById(R.id.description_txt);
            user_type_txt1=itemView.findViewById(R.id.user_type_txt1);
            status_txt1=itemView.findViewById(R.id.status_txt1);


        }
    }
}



