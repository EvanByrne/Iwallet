package com.example.evan.iwallet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class SecurityActivity extends AppCompatActivity {

    private TextView secCardInf;
    private TextView secSettings;
    private Button secReturn;
    private ImageButton secProf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_security);

        secReturn = (Button)findViewById(R.id.btnReturnSec);
        secReturn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent();
                i.setClass(getApplicationContext(), MainhubActivity.class);
                startActivity(i);
                finish();
            }
        });

        secCardInf = (TextView)findViewById(R.id.txtVcardInfClickSec);
        secCardInf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClass(getApplicationContext(), CardinfoActivity.class);
                startActivity(i);
                finish();
            }
        });

        secSettings = (TextView)findViewById(R.id.txtVsettingsClickSec);
        secSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClass(getApplicationContext(), SettingsActivity.class);
                startActivity(i);
                finish();
            }
        });

        secProf = (ImageButton)findViewById(R.id.imBtnProfileSec);
        secProf.setOnClickListener(new View.OnClickListener(){
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
