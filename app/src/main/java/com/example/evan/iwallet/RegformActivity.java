package com.example.evan.iwallet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegformActivity extends AppCompatActivity {

    private Button buttonSignUreg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regform);

        buttonSignUreg = (Button)findViewById(R.id.btnSubmitReg);
        buttonSignUreg.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent();
                i.setClass(getApplicationContext(), MainhubActivity.class);
                startActivity(i);
                finish();
            }
        });
    }
}
