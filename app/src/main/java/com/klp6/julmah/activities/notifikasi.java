package com.klp6.julmah.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.klp6.julmah.R;

public class notifikasi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notifikasi);

        ImageView kembali = (ImageView) findViewById(R.id.imageView104);
        ImageView profil = (ImageView) findViewById(R.id.imageView119);


        profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(notifikasi.this, profil.class);
                startActivity(intent);
            }
        });

        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(notifikasi.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}