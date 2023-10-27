package com.daizzyinfo.chipnavigation_demo.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.daizzyinfo.chipnavigation_demo.R;


import com.daizzyinfo.chipnavigation_demo.searchmodel.LawyerModel;


import java.util.List;

   public class SearchLawyersAdapter extends RecyclerView.Adapter<SearchLawyersAdapter.MainVH>{

    List<LawyerModel> searchLawyersAdapters;
    Context context;

       public SearchLawyersAdapter(List<LawyerModel> searchLawyersAdapters, Context context) {
           this.searchLawyersAdapters = searchLawyersAdapters;
           this.context = context;
       }

       @NonNull
    @Override
     public SearchLawyersAdapter.MainVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_lawyers,parent,false);
        return new SearchLawyersAdapter.MainVH(view);

    }

    @Override
    public void onBindViewHolder(@NonNull SearchLawyersAdapter.MainVH holder, int position) {

        holder.txt_name_law.setText(searchLawyersAdapters.get(position).getName());
        holder.txt_address_law.setText(searchLawyersAdapters.get(position).getAddress());
        holder.txt_experience_law.setText(searchLawyersAdapters.get(position).getExperience());
        holder.txt_office_address.setText(searchLawyersAdapters.get(position).getOfficeAddress());

    }

    @Override
    public int getItemCount() {
        return searchLawyersAdapters.size();
    }

    public class MainVH extends RecyclerView.ViewHolder {
        TextView txt_name_law,txt_address_law,txt_experience_law,txt_office_address;

        public MainVH(@NonNull View itemView) {
            super(itemView);

            txt_name_law=itemView.findViewById(R.id.txt_name_law);
            txt_address_law=itemView.findViewById(R.id.txt_address_law);
            txt_experience_law=itemView.findViewById(R.id.txt_experience_law);
            txt_office_address=itemView.findViewById(R.id.txt_office_address);



        }
    }
}
