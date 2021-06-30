package com.klp6.julmah.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.klp6.julmah.R;

public class halaman_login extends AppCompatActivity implements View.OnClickListener {

    private TextView textView5;
    private FirebaseAuth mAuth;
// ...

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_login);

        textView5 = (TextView) findViewById(R.id.textView5);
        textView5.setOnClickListener(this);

        // Initialize Firebase Auth
//        mAuth = FirebaseAuth.getInstance();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.textView5:
                startActivity(new Intent(this, Halaman_mendaftar.class));
                break;
        }
    }

//    @Override
//    public void onStart() {
//        super.onStart();
//        // Check if user is signed in (non-null) and update UI accordingly.
//        FirebaseUser currentUser = mAuth.getCurrentUser();
//        if (null != currentUser) {
//            updateUI(currentUser);
//        }
//    }
//
//    private void updateUI(FirebaseUser currentUser) {
//    }
//
//    private void signIn(String email, String password) {
//        // [START sign_in_with_email]
//        mAuth.signInWithEmailAndPassword(email, password)
//                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
//                    @Override
//                    public void onComplete(@NonNull Task<AuthResult> task) {
//                        if (task.isSuccessful()) {
//                            // Sign in success, update UI with the signed-in user's information
//                            FirebaseUser user = mAuth.getCurrentUser();
//                            updateUI(user);
//                        } else {
//                            // If sign in fails, display a message to the user.
//                            Toast.makeText(halaman_login.this, "Authentication failed.",
//                                    Toast.LENGTH_SHORT).show();
//                            updateUI(null);
//                        }
//                    }
//
//                    private void updateUI(FirebaseUser user) {
//                    }
//                });
//
//    }
//    public void signOut() {
//        // [START auth_sign_out]
//        FirebaseAuth.getInstance().signOut();
//        // [END auth_sign_out]
//    }

}