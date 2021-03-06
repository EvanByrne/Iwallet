package com.example.evan.iwallet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class CardinfoActivity extends AppCompatActivity {

    private TextView caInSecurity;
    private TextView caInSettings;
    private Button caInReturn;
    private ImageButton caInProf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardinfo);

        caInReturn = (Button)findViewById(R.id.btnReturnCar);
        caInReturn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent();
                i.setClass(getApplicationContext(), MainhubActivity.class);
                startActivity(i);
                finish();
            }
        });

        caInSecurity = (TextView)findViewById(R.id.txtVsecurityClickCar);
        caInSecurity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClass(getApplicationContext(), SecurityActivity.class);
                startActivity(i);
                finish();
            }
        });

        caInSettings = (TextView)findViewById(R.id.txtVsettingsClickCar);
        caInSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClass(getApplicationContext(), SettingsActivity.class);
                startActivity(i);
                finish();
            }
        });

        caInProf = (ImageButton)findViewById(R.id.imBtnProfileCar);
        caInProf.setOnClickListener(new View.OnClickListener(){
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
