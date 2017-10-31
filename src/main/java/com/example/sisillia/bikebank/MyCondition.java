package com.example.sisillia.bikebank;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MyCondition extends AppCompatActivity {

    LinearLayout c_ha,c_hpm,c_ws;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_condition);

        c_ha = (LinearLayout) findViewById(R.id.condition_ha);
        c_hpm = (LinearLayout) findViewById(R.id.condition_hpm);
        c_ws = (LinearLayout) findViewById(R.id.condition_ws);



        c_ha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MyCondition.this, HealthAnalyzer.class);
                MyCondition.this.startActivity(intent);
            }
        });

        c_hpm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MyCondition.this, HeartPulseMonitoring.class);
                MyCondition.this.startActivity(intent);
            }
        });

        c_ws.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MyCondition.this, workoutsugesstion.class);
                MyCondition.this.startActivity(intent);
            }
        });

    }
}
