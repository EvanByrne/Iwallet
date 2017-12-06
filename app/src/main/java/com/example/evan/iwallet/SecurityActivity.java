package com.example.evan.iwallet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecurityActivity extends AppCompatActivity {

    private TextView secCardInf;
    private TextView secSettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_security);

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
    }
}
