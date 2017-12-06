package com.example.evan.iwallet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SettingsActivity extends AppCompatActivity {

    private TextView setSecurity;//Some Comment
    private TextView setCardInf;// Some Comment

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

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
    }
}
