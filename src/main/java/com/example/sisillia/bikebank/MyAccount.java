package com.example.sisillia.bikebank;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.sisillia.bikebank.model.UserModel;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MyAccount extends AppCompatActivity {

    private DatabaseReference mRef, mRef1,mRef3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_account);

        final TextView uname = (TextView) findViewById(R.id.namauser);
        final TextView email = (TextView) findViewById(R.id.email);
        final TextView username =(TextView)findViewById(R.id.namaid);

        mRef = FirebaseDatabase.getInstance().getReference().child("users");
        mRef1 = FirebaseDatabase.getInstance().getReference().child("users");
        mRef3 = FirebaseDatabase.getInstance().getReference().child("users");


//        mRef3 = FirebaseDatabase.getInstance().getReference("users").child("username");
        mRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for (DataSnapshot postSnapshot : dataSnapshot.getChildren()) {
                    UserModel userModel = postSnapshot.getValue(UserModel.class);
                    String namauser = userModel.getUsername();
                    uname.setText(namauser);


                }

//                ((TextView)findViewById(R.id.nama)).setText(userModel.getUsername());
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        mRef1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for (DataSnapshot postSnapshot : dataSnapshot.getChildren()) {
                    UserModel userModel = postSnapshot.getValue(UserModel.class);
                    String emailuser = userModel.getEmail();
                    email.setText(emailuser);


                }

//                ((TextView)findViewById(R.id.nama)).setText(userModel.getUsername());
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        mRef3.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for (DataSnapshot postSnapshot : dataSnapshot.getChildren()) {
                    UserModel userModel = postSnapshot.getValue(UserModel.class);
                    String namauser = userModel.getUsername();
                    username.setText(namauser);


                }

//                ((TextView)findViewById(R.id.nama)).setText(userModel.getUsername());
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });


    }
}
