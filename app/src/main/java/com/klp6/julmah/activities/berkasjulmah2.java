package com.klp6.julmah.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.klp6.julmah.R;

public class berkasjulmah2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_berkasjulmah2);

        ImageView notifikasi = (ImageView) findViewById(R.id.imageView72);
        ImageView profil = (ImageView) findViewById(R.id.imageView81);
        ImageButton lanjutkan = (ImageButton) findViewById(R.id.imageButton21);
        ImageView pengaturan = (ImageView) findViewById(R.id.imageView83);
        ImageView kembali = (ImageView) findViewById(R.id.imageView78);

        notifikasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(berkasjulmah2.this, notifikasi.class);
                startActivity(intent);
            }
        });

        profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(berkasjulmah2.this, profil.class);
                startActivity(intent);
            }
        });

        lanjutkan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(berkasjulmah2.this, berkasjulmah3.class);
                startActivity(intent);
            }
        });

        pengaturan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(berkasjulmah2.this, pengaturan.class);
                startActivity(intent);
            }
        });

        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(berkasjulmah2.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}