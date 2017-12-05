package com.example.evan.iwallet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class SignupActivity extends AppCompatActivity {

    private Button buttonSignU;
    private TextView loginTextV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        buttonSignU = (Button)findViewById(R.id.btnSubmit);
        buttonSignU.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent();
                i.setClass(getApplicationContext(), RegformActivity.class);
                startActivity(i);
                finish();
            }
        });

        loginTextV = (TextView)findViewById(R.id.tVmsg4);
        loginTextV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClass(getApplicationContext(), LoginActivity.class);
                startActivity(i);
                finish();
            }
        });
    }
}
