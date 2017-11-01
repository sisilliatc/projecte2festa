package com.example.sisillia.bikebank;

//public class Register extends Activity {
//
//    TextView backlogin;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_register);
//
//        backlogin = (TextView)findViewById(R.id.backlogin);
//
//        backlogin.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(Register.this, MainActivity.class);
//                Register.this.startActivity(intent);
//                Register.this.finish();
//            }
//        });
//    }
//}
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;

//import com.google.firebase.quickstart.database.models.User;
//import com.google.firebase.quickstart.database.models.Comment;
//import com.google.firebase.quickstart.database.models.Post;

///////////////////////////////////////////////////////////////

public class Register extends Activity implements
        View.OnClickListener {

    private DatabaseReference mDatabase;

    private static final String TAG = "Register";

     EditText mRusename;
     EditText mRemail;
     EditText mRgender;
     EditText mSmoker;
     EditText mDHistory;
     EditText mRage;
     EditText mPass;
     EditText mPass1;

    // [START declare_auth]
    private FirebaseAuth mAuth;
    // [END declare_auth]

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        // Views
        mRusename = (EditText)findViewById(R.id.field_Rusername);
        mRemail = (EditText)findViewById(R.id.field_Remail);
        mRage = (EditText)findViewById(R.id.field_Rage);
        mRgender = (EditText) findViewById(R.id.field_gender);
        mPass = (EditText)findViewById(R.id.field_Rpass);
        mPass1 = (EditText)findViewById(R.id.field_Rpass1);
        mSmoker = (EditText) findViewById(R.id.smoker);
        mDHistory = (EditText) findViewById(R.id.diseasehistory);

        // Buttons
        findViewById(R.id.regis).setOnClickListener(this);
        findViewById(R.id.backlogin).setOnClickListener(this);

        // [START initialize_auth]
        mAuth = FirebaseAuth.getInstance();
        // [END initialize_auth]
    }

//    mDatabase.child(ricky).addValueEventListener(new ValueEventListener() {
//        @Override
//        public void onDataChange(DataSnapshot dataSnapshot) {
//
//            User user = dataSnapshot.getValue(User.class);
//
//            Log.d(TAG, "User name: " + user.getName() + ", email " + user.getEmail());
//        }
//
//        @Override
//        public void onCancelled(DatabaseError error) {
//            // Failed to read value
//            Log.w(TAG, "Failed to read value.", error.toException());
//        }
//    });

    private void createAccount(String email, String password) {
        Log.d(TAG, "createAccount:" + email);
        // [START create_user_with_email]
        mAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information
                            Log.d(TAG, "createUserWithEmail:success");
                            FirebaseUser user = mAuth.getCurrentUser();
                            Toast.makeText(Register.this, "Create User Success.",
                                    Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(Register.this, MainActivity.class);
                            Register.this.startActivity(intent);
                            Register.this.finish();
                        } else {
                            // If sign in fails, display a message to the user.
                            Log.w(TAG, "createUserWithEmail:failure", task.getException());
                            Toast.makeText(Register.this, "Authentication failed.",
                                    Toast.LENGTH_SHORT).show();
                        }
                    }
                });
        // [END create_user_with_email]
    }

//    private void signIn(String email, String password) {
//        Log.d(TAG, "signIn:" + email);
////        if (!validateForm()) {
////            return;
////        }
//        // [START sign_in_with_email]
//        mAuth.signInWithEmailAndPassword(email, password)
//                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
//                    @Override
//                    public void onComplete(@NonNull Task<AuthResult> task) {
//                        if (task.isSuccessful()) {
//                            // Sign in success, update UI with the signed-in user's information
//                            Log.d(TAG, "signInWithEmail:success");
//                            FirebaseUser user = mAuth.getCurrentUser();
//                        } else {
//                            // If sign in fails, display a message to the user.
//                            Log.w(TAG, "signInWithEmail:failure", task.getException());
//                            Toast.makeText(Register.this, "Authentication failed.",
//                                    Toast.LENGTH_SHORT).show();
//                        }
//                    }
//                });
//        // [END sign_in_with_email]
//    }
//
//    private void signOut() {
//        mAuth.signOut();
//    }

//    private void sendEmailVerification() {
//        // Disable button
//        findViewById(R.id.verify_email_button).setEnabled(false);
//
//        // Send verification email
//        // [START send_email_verification]
//        final FirebaseUser user = mAuth.getCurrentUser();
//        user.sendEmailVerification()
//                .addOnCompleteListener(this, new OnCompleteListener<Void>() {
//                    @Override
//                    public void onComplete(@NonNull Task<Void> task) {
//                        // [START_EXCLUDE]
//                        // Re-enable button
//                        findViewById(R.id.verify_email_button).setEnabled(true);
//
//                        if (task.isSuccessful()) {
//                            Toast.makeText(EmailPasswordActivity.this,
//                                    "Verification email sent to " + user.getEmail(),
//                                    Toast.LENGTH_SHORT).show();
//                        } else {
//                            Log.e(TAG, "sendEmailVerification", task.getException());
//                            Toast.makeText(EmailPasswordActivity.this,
//                                    "Failed to send verification email.",
//                                    Toast.LENGTH_SHORT).show();
//                        }
//                        // [END_EXCLUDE]
//                    }
//                });
//        // [END send_email_verification]
//    }

//    private boolean validateForm() {
//        boolean valid = true;
//
//        String email = mRemail.getText().toString();
//        if (TextUtils.isEmpty(email)) {
//            mRemail.setError("Required.");
//            valid = false;
//        } else {
//            mRemail.setError(null);
//        }
//
//        String password = mPass.getText().toString();
//        if (TextUtils.isEmpty(password)) {
//            mPass.setError("Required.");
//            valid = false;
//        } else {
//            mPass.setError(null);
//        }
//
//        return valid;
//    }

    @Override
    public void onClick(View v) {
        int i = v.getId();
        if (i == R.id.regis) {
            createAccount(mRemail.getText().toString(), mPass.getText().toString());
        } else if (i == R.id.backlogin) {
                Intent intent = new Intent(Register.this, MainActivity.class);
                Register.this.startActivity(intent);
                Register.this.finish();
        }
    }
}