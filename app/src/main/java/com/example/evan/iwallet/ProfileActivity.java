package com.example.evan.iwallet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    private TextView profSecurity;
    private TextView profSettings;
    private TextView profCardInf;
    private Button profReturn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        profReturn = (Button)findViewById(R.id.btnReturnPr);
        profReturn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent();
                i.setClass(getApplicationContext(), MainhubActivity.class);
                startActivity(i);
                finish();
            }
        });

        profCardInf = (TextView)findViewById(R.id.txtVcardInfClickPr);
        profCardInf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClass(getApplicationContext(), CardinfoActivity.class);
                startActivity(i);
                finish();
            }
        });

        profSecurity = (TextView)findViewById(R.id.txtVsecurityClickPr);
        profSecurity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClass(getApplicationContext(), SecurityActivity.class);
                startActivity(i);
                finish();
            }
        });

        profSettings = (TextView)findViewById(R.id.txtVsettingsClickPr);
        profSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClass(getApplicationContext(), SettingsActivity.class);
                startActivity(i);
                finish();
            }
        });
    }
}
