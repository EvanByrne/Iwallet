package com.example.evan.iwallet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainhubActivity extends AppCompatActivity {

    private ImageButton imageBTN;
    private ImageButton imageBTN2;
    private ImageButton imageBTN3;
    private ImageButton imageBTN4;
    private ImageButton imageBTN5;
    private ImageButton imageBTN6;
    private ImageButton imageBTN7;
    private ImageButton imageBTN8;
    private ImageButton imageBTN9;
    private ImageButton imageBTN10;
    private TextView txtVcInf;
    private TextView txtVsec;
    private TextView txtVset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainhub);

        imageBTN = (ImageButton)findViewById(R.id.imBtnPayment);
        imageBTN.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent();
                i.setClass(getApplicationContext(), PaymentActivity.class);
                startActivity(i);
                finish();
            }
        });

        imageBTN2 = (ImageButton)findViewById(R.id.imBtnBudget);
        imageBTN2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent();
                i.setClass(getApplicationContext(), BudgetActivity.class);
                startActivity(i);
                finish();
            }
        });

        imageBTN3 = (ImageButton)findViewById(R.id.imBtnID);
        imageBTN3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent();
                i.setClass(getApplicationContext(), IdhubActivity.class);
                startActivity(i);
                finish();
            }
        });

        imageBTN4 = (ImageButton)findViewById(R.id.imBtnScanRec);
        imageBTN4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent();
                i.setClass(getApplicationContext(), ScanrecActivity.class);
                startActivity(i);
                finish();
            }
        });

        imageBTN5 = (ImageButton)findViewById(R.id.imBtnStoreInf);
        imageBTN5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent();
                i.setClass(getApplicationContext(), StoreinfoActivity.class);
                startActivity(i);
                finish();
            }
        });

        imageBTN6 = (ImageButton)findViewById(R.id.imBtnVouchers);
        imageBTN6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent();
                i.setClass(getApplicationContext(), VouchersActivity.class);
                startActivity(i);
                finish();
            }
        });

        imageBTN7 = (ImageButton)findViewById(R.id.imBtnCkeys);
        imageBTN7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent();
                i.setClass(getApplicationContext(), CardK.class);
                startActivity(i);
                finish();
            }
        });

        imageBTN8 = (ImageButton)findViewById(R.id.imBtnTodo);
        imageBTN8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent();
                i.setClass(getApplicationContext(), TodoActivity.class);
                startActivity(i);
                finish();
            }
        });

        imageBTN9 = (ImageButton)findViewById(R.id.imBtnImpDates);
        imageBTN9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent();
                i.setClass(getApplicationContext(), ImpDatesActivity.class);
                startActivity(i);
                finish();
            }
        });

        imageBTN10 = (ImageButton)findViewById(R.id.imBtnProfileMh);
        imageBTN10.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent();
                i.setClass(getApplicationContext(), ProfileActivity.class);
                startActivity(i);
                finish();
            }
        });
    }

}
