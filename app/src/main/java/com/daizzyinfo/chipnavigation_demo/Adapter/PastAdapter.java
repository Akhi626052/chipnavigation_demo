package com.daizzyinfo.chipnavigation_demo.Adapter;

import static android.media.CamcorderProfile.get;
import static com.daizzyinfo.chipnavigation_demo.R.layout.past_item_rey;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.daizzyinfo.chipnavigation_demo.AppointmentDetails;
import com.daizzyinfo.chipnavigation_demo.Model.PastModel;
import com.daizzyinfo.chipnavigation_demo.R;

import java.util.List;

public class PastAdapter extends RecyclerView.Adapter<PastAdapter.MainVH> {
List<PastModel> pastModels;
Context context;

    public PastAdapter(List<PastModel> pastModels, Context context) {
        this.pastModels = pastModels;
        this.context = context;
    }

    public MainVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(past_item_rey,parent,false);
        return new MainVH(view);

    }

    @Override
    public void onBindViewHolder(@NonNull MainVH holder, int position) {
      holder.text_name.setText(pastModels.get(position).getText_name());
      holder.text_age.setText(pastModels.get(position).getText_age());
      holder.date_id.setText(pastModels.get(position).getDate_id());
      holder.Cn_id.setText(pastModels.get(position).getCn_id());


        if(pastModels.get(position).getCn_id().equals("Cancelled")){
            //holder.RlStatus.setBackgroundColor(R.color.red);//no color change
            holder.RlStatus.setBackgroundTintList(ContextCompat.getColorStateList(context, R.color.red));

        }else if(pastModels.get(position).getCn_id().equals("Completed")){
            holder.RlStatus.setBackgroundTintList(ContextCompat.getColorStateList(context, R.color.parisGreen));
        }else{

            holder.RlStatus.setBackgroundTintList(ContextCompat.getColorStateList(context, R.color.lightning));

        }

//value passin adapter to activity----
        holder.linearlayout_item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), AppointmentDetails.class);

                intent.putExtra("colorred",pastModels.get(position).getCn_id());
                context.startActivity(intent);
            }
        });



      
    }

    @Override
    public int getItemCount() {
        return pastModels.size();

    } public class MainVH extends RecyclerView.ViewHolder {
        LinearLayout linearlayout_item;
        RelativeLayout RlStatus;
        TextView text_name,text_age,date_id,Cn_id;
        public MainVH(@NonNull View itemView) {
            super(itemView);
            text_name=itemView.findViewById(R.id.text_name);
            text_age=itemView.findViewById(R.id.text_age);
            date_id=itemView.findViewById(R.id.date_id);
            Cn_id=itemView.findViewById(R.id.Cn_id);
            RlStatus=itemView.findViewById(R.id.RlStatus);
            linearlayout_item=itemView.findViewById(R.id.linearlayout_item);



        }
    }
}
