package com.daizzyinfo.chipnavigation_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class AppointmentDetails extends AppCompatActivity {

    LinearLayout customer_bgColorCh,refunded_color_bg;

    Button buttonHelp;
    TextView cangettx,refunded_name_id;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.appointment_details);
        cangettx=findViewById(R.id.cangettx);
        customer_bgColorCh=findViewById(R.id.customer_bgColorCh);
        refunded_name_id=findViewById(R.id.refunded_name_id);
        refunded_color_bg=findViewById(R.id.refunded_color_bg);
        buttonHelp=findViewById(R.id.buttonHelp);




        String status = getIntent().getStringExtra("colorred");
        cangettx.setText(status);

        if(getIntent().getStringExtra("colorred").equals("Cancelled")){
            //holder.RlStatus.setBackgroundColor(R.color.red);//no color change
            customer_bgColorCh.getBackground().setTint(getResources().getColor(R.color.red));
          //  tx_cance_appoi.setVisibility(View.GONE);
            refunded_color_bg.getBackground().setTint(getResources().getColor(R.color.red));
            refunded_name_id.setText("Refunded");
            buttonHelp.setText("Need help?");


            buttonHelp.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(AppointmentDetails.this,Support.class);
                    startActivity(intent);
                /*   intent.putExtra("colorred",pastModels.get(position).getCn_id());
                context.startActivity(intent);*/
                }
            });


        }else if(getIntent().getStringExtra("colorred").equals("Completed")){
            customer_bgColorCh.getBackground().setTint(getResources().getColor(R.color.parisGreen));
           // tx_cance_appoi.setVisibility(View.GONE);
            /* free information refunded text set in id - refunded_name_id*/
            refunded_color_bg.getBackground().setTint(getResources().getColor(R.color.parisGreen));
            refunded_name_id.setText("Succeed");
            buttonHelp.setText("Call Now");

        }else{
            customer_bgColorCh.getBackground().setTint(getResources().getColor(R.color.lightning));
          //  tx_cance_appoi.setVisibility(View.VISIBLE);
            refunded_color_bg.getBackground().setTint(getResources().getColor(R.color.lightning));
            refunded_name_id.setText("Succeed");
            buttonHelp.setText("Need Help?");


        }









    }
}