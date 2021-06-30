package com.klp6.julmah.activities;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.klp6.julmah.R;


public class Halaman_mendaftar extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = null;
    private TextView masuk, buatAkun;
    private EditText ETNamaPengguna, ETEmail, ETpass, ETrepass;
    private ProgressBar progressBar;
    private ImageButton fb, google;
    private GoogleSignInClient mGoogleSignInClient;
    private final static int RC_SIGN_IN = 123;
    private FirebaseAuth mAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_mendaftar);
        FirebaseAuth mAuth;
// ...
// Initialize Firebase Auth
        mAuth = FirebaseAuth.getInstance();

        masuk = (TextView) findViewById(R.id.textView8);
        masuk.setOnClickListener(this);

        buatAkun = (TextView) findViewById(R.id.textView7);
        buatAkun.setOnClickListener(this);

        ETNamaPengguna = (EditText) findViewById(R.id.editTextTextPersonName3);
        ETEmail = (EditText) findViewById(R.id.editTextTextEmailAddress);
        ETpass = (EditText) findViewById(R.id.editTextTextPassword3);
        ETrepass = (EditText) findViewById(R.id.editTextTextPassword4);

        progressBar = (ProgressBar) findViewById(R.id.progressBar2);

        fb = (ImageButton) findViewById(R.id.imageButton10);
        google = (ImageButton) findViewById(R.id.imageButton11);

        FirebaseUser user = mAuth.getCurrentUser();
        if (user != null) {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.textView8:
                startActivity(new Intent(this, halaman_login.class));
                break;
            case R.id.textView7:
                buatAkun();
                break;
        }
    }

    private void buatAkun() {
        String namaPengguna = ETNamaPengguna.getText().toString().trim();
        String email = ETEmail.getText().toString().trim();
        String password = ETpass.getText().toString().trim();
        String repassword = ETrepass.getText().toString().trim();

        if (namaPengguna.isEmpty()) {
            ETNamaPengguna.setError("Nama pengguna dibutuhkan");
            ETNamaPengguna.requestFocus();
            return;
        }
        if (email.isEmpty()) {
            ETEmail.setError("Email dibutuhkan");
            ETEmail.requestFocus();
            return;
        }
        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            ETEmail.setError("Silakan masukkan alamat email yang valid");
            ETEmail.requestFocus();
            return;
        }
        if (password.isEmpty()) {
            ETpass.setError("Password dibutuhkan");
            ETpass.requestFocus();
            return;
        }
        if (repassword.isEmpty()) {
            ETrepass.setError("silakan memasukkan ulang passwordnya");
            ETrepass.requestFocus();
            return;
        }
        if (password.length() < 6) {
            ETpass.setError("Minimal panjang password 6 digit");
            ETpass.requestFocus();
            return;
        }
        progressBar.setVisibility(View.VISIBLE);


    }
}