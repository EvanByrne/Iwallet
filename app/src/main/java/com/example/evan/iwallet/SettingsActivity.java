package com.example.evan.iwallet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class SettingsActivity extends AppCompatActivity {

    private TextView setSecurity;//Some Comment
    private TextView setCardInf;// Some Comment
    private Button setReturn;
    private ImageButton setProf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        setReturn = (Button)findViewById(R.id.btnReturnSet);
        setReturn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent();
                i.setClass(getApplicationContext(), MainhubActivity.class);
                startActivity(i);
                finish();
            }
        });

        setCardInf = (TextView)findViewById(R.id.txtVcardInfClickSet);
        setCardInf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClass(getApplicationContext(), CardinfoActivity.class);
                startActivity(i);
                finish();
            }
        });

        setSecurity = (TextView)findViewById(R.id.txtVsecurityClickSet);
        setSecurity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClass(getApplicationContext(), SecurityActivity.class);
                startActivity(i);
                finish();
            }
        });

        setProf = (ImageButton)findViewById(R.id.imBtnProfileSet);
        setProf.setOnClickListener(new View.OnClickListener(){
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
