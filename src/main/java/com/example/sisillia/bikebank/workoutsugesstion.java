package com.example.sisillia.bikebank;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.sisillia.bikebank.volley.VolleyCallback;
import com.example.sisillia.bikebank.volley.VolleyHelper;

import org.json.JSONException;
import org.json.JSONObject;

public class workoutsugesstion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workoutsugesstion);

                VolleyHelper vh = new VolleyHelper();
        try {
            vh.getSakit2(new VolleyCallback() {
                @Override
                public void onSuccess(String result) {
                    Log.d("volley",result);
                }

                @Override
                public void onSuccess(JSONObject json) {
                    try {

                        json.get("durasi");
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }


            },"a","b");
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
