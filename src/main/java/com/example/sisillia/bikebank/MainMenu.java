package com.example.sisillia.bikebank;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainMenu extends AppCompatActivity

        implements NavigationView.OnNavigationItemSelectedListener {
        private DatabaseReference mRef;
        private DatabaseReference mRef2;
        private DatabaseReference mRef3;
        private FirebaseAuth mAuth;
        private FirebaseAuth.AuthStateListener authListener;
    Long tampung=0L;
    Long total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        mAuth = FirebaseAuth.getInstance();

        authListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser user = firebaseAuth.getCurrentUser();
                if (user == null) {
                    // user auth state is changed - user is null
                    // launch login activity
                    startActivity(new Intent(MainMenu.this, MainActivity.class));
                    finish();
                }
            }
        };

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final TextView poin = (TextView) findViewById(R.id.poin);
        final TextView level = (TextView) findViewById(R.id.level);
        final TextView tegangan = (TextView) findViewById(R.id.tegangan);
        final TextView detak = (TextView) findViewById(R.id.detak);
        final TextView cal = (TextView) findViewById(R.id.cal1);
        final TextView dis = (TextView) findViewById(R.id.dis1);
        final TextView spe1 = (TextView) findViewById(R.id.speed1);
        final TextView uname = (TextView) findViewById(R.id.nama);


        mRef = FirebaseDatabase.getInstance().getReference().child("tegangan");
        mRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                Long value = dataSnapshot.getValue(Long.class);
                tegangan.setText(Float.toString(value));
                total = tampung + value;
                tampung=total;

                //Newbie
                        //Novice
                //Rookie
                        //Beginner
                //Talented
                        //Skilled
                //Intermediate
                        //Skillful
                //Seasoned
                        //Proficient
                //Experienced
                        //Advanced
                //Senior
                        //Expert

                level.setText(Float.toString(total));

                if (total>10){
                    poin.setText("1");
                }
                else if (total>20){
                    poin.setText("2");
                }
                if (total>30){
                    poin.setText("3");
                }
                else if (total>40){
                    poin.setText("4");
                }
                //

                cal.setText(Float.toString(value));

                spe1.setText(Float.toString(value));

                dis.setText(Float.toString(value));
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {
            }
        });

        mRef2 = FirebaseDatabase.getInstance().getReference().child("detak");
        mRef2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                Long value2 = dataSnapshot.getValue(Long.class);
                detak.setText(Float.toString(value2));
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {
            }
        });

//        mRef3 = FirebaseDatabase.getInstance().getReference().child("users");
//
//
////        mRef3 = FirebaseDatabase.getInstance().getReference("users").child("username");
//        mRef3.addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(DataSnapshot dataSnapshot) {
////                String value3 = dataSnapshot.getValue(String.class);
//////                uname.setText(value3);
////
////                uname.setText(String.valueOf(value3));
//
//
//
//                UserModel userModel = dataSnapshot.getValue(UserModel.class);
//                String namauser = userModel.getUsername();
//                uname.setText(namauser);
//
////                ((TextView)findViewById(R.id.nama)).setText(userModel.getUsername());
//            }
//
//            @Override
//            public void onCancelled(DatabaseError databaseError) {
//
//            }
//        });
//
//

                DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


    }


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_account) {
            Intent intent = new Intent(MainMenu.this, MyAccount.class);
            startActivity(intent);

        } else if (id == R.id.nav_history) {
            Intent intent = new Intent(MainMenu.this, History.class);
            MainMenu.this.startActivity(intent);


        } else if (id == R.id.nav_poin) {
            Intent intent = new Intent(MainMenu.this, MyPoint.class);
            MainMenu.this.startActivity(intent);

        } else if (id == R.id.nav_condition){
            Intent intent = new Intent(MainMenu.this, MyCondition.class);
            MainMenu.this.startActivity(intent);

        } else if (id == R.id.nav_about){
            Intent intent = new Intent(MainMenu.this, About.class);
            MainMenu.this.startActivity(intent);

        }
        else if (id == R.id.logut){
            signOut();

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
    //sign out method
    public void signOut() {
        mAuth.signOut();
    }

    @Override
    public void onStart() {
        super.onStart();
        mAuth.addAuthStateListener(authListener);
    }

    @Override
    public void onStop() {
        super.onStop();
        if (authListener != null) {
            mAuth.removeAuthStateListener(authListener);
        }
    }
}
