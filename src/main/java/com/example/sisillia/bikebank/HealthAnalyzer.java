package com.example.sisillia.bikebank;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.sisillia.bikebank.volley.VolleyCallback;
import com.example.sisillia.bikebank.volley.VolleyHelper;

import org.json.JSONException;

public class HealthAnalyzer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health_analyzer);

        Log.d("volley","tes");

        VolleyHelper vh = new VolleyHelper();
        try {
            vh.getSakit(new VolleyCallback() {
                @Override
                public void onSuccess(String result) {
                    Log.d("volley",result);
                }
            },"a","b");
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
