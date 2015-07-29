package com.example.gambal.creditcardhelper;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Gambal on 15-Jul-15.
 */


    public class MainActivity extends Activity {
        EditText cc_open_bal1,r_int1,min_amt1,final_bal1,r_Month1,total_int_paid;
        Button compute_ctr,cancel_ctr;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.home);

        cc_open_bal1 = (EditText)findViewById(R.id.cc_open_bal);
        r_int1 = (EditText)findViewById(R.id.r_int);
        min_amt1 = (EditText)findViewById(R.id.min_amt);
        final_bal1=(EditText)findViewById(R.id.final_bal);
        r_Month1=(EditText)findViewById(R.id.r_month);
        total_int_paid=(EditText)findViewById(R.id.int_paid);

        compute_ctr=(Button)findViewById(R.id.bt_compute);
        cancel_ctr =(Button)findViewById(R.id.bt_cancel);

        compute_ctr.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String cc_open_bal2= cc_open_bal1.getText().toString();
                double cc_open_bal3 = Double.valueOf(cc_open_bal2);

                String r_int2= r_int1.getText().toString();
                double r_int3 = Double.valueOf(r_int2);

                String min_amt2= min_amt1.getText().toString();
                double min_amt3 = Double.valueOf(min_amt2);

                //double

                double principle = cc_open_bal3;

                double r_int4 = (r_int3/100)/12;


                double min_amt_paid1=(min_amt3 - (principle * r_int4));

                double int_paid1=(principle * r_int4);
                double monthly_principle_paid=(min_amt3 - (principle * r_int4));

               // double total_int_paid+= int_paid1;

                    double total_month = 0;
                for(int i=0;i<total_month;i++) {
                    total_month += i;
                }



               //final_bal1.setText((cc_open_bal3 + 2) + "");
                //total_int_paid.setText(monthly_principle_paid + "");
                r_Month1.setText(total_month + "");


               //Toast.makeText(getApplicationContext(),"Hi",Toast.LENGTH_LONG).show();

            }
        });
        }



    }

