package com.example.sisillia.bikebank;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.example.sisillia.bikebank.model.UserModel;
import com.example.sisillia.bikebank.volley.VolleyCallback;
import com.example.sisillia.bikebank.volley.VolleyHelper;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import org.json.JSONException;
import org.json.JSONObject;

public class workoutsugesstion extends AppCompatActivity {

    private DatabaseReference mSearchedLocationReference;
    private FirebaseAuth mAuth;
    private DatabaseReference mUsers;
    TextView result,hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workoutsugesstion);

        result = (TextView) findViewById(R.id.resultWorkOut);
        hasil = (TextView) findViewById(R.id.cobalah);

        final VolleyHelper vh = new VolleyHelper();
        mSearchedLocationReference = FirebaseDatabase
                .getInstance()
                .getReference("users");
        mAuth = FirebaseAuth.getInstance();
        mUsers = FirebaseDatabase.getInstance().getReference().child("users");

        mUsers.child(mAuth.getCurrentUser().getUid())
                .addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        Log.d("coba",dataSnapshot.child("username").getValue(String.class));

                        UserModel userModel = dataSnapshot.getValue(UserModel.class);
                        Log.d("username",userModel.username);
                        try {
                            vh.getSakit(new VolleyCallback() {
                                @Override
                                public void onSuccess(String result) {
                                    Log.d("volley",result);

                                }

                                @Override
                                public void onSuccess(JSONObject json) {
                                    try {
                                        Log.d("volley-json", String.valueOf(json.get("duration")));
                                        hasil.setText(String.valueOf(json.get("duration")));
                                    } catch (JSONException e) {
                                        e.printStackTrace();
                                    }
                                }


                            },userModel.getSmoker(),userModel.getAge(),userModel.getGender(),userModel.getHeart_disease());
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });


    }

}
