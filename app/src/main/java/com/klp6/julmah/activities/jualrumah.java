package com.klp6.julmah.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.klp6.julmah.R;

public class jualrumah extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jualrumah);
        ImageView notifikasi = (ImageView) findViewById(R.id.imageView151);
        ImageView pencarian = (ImageView) findViewById(R.id.imageView147);
        ImageButton filter = (ImageButton) findViewById(R.id.imageButton27);
        ImageView beranda = (ImageView) findViewById(R.id.imageView142);
        ImageView pengaturan = (ImageView) findViewById(R.id.imageView141);
        ImageView kembali = (ImageView) findViewById(R.id.imageView31);
        ImageView profil = (ImageView) findViewById(R.id.imageView24);
        ImageView julmah = (ImageView) findViewById(R.id.imageView152);

        notifikasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(jualrumah.this, notifikasi.class);
                startActivity(intent);
            }
        });
        pencarian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(jualrumah.this, pencarian.class);
                startActivity(intent);
            }
        });

        filter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(jualrumah.this, filter.class);
                startActivity(intent);
            }
        });

        pengaturan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(jualrumah.this, pengaturan.class);
                startActivity(intent);
            }
        });
        beranda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(jualrumah.this, MainActivity.class);
                startActivity(intent);
            }
        });
        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(jualrumah.this, MainActivity.class);
                startActivity(intent);
            }
        });
        profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(jualrumah.this, profil.class);
                startActivity(intent);
            }
        });
        julmah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(jualrumah.this, berkasjulmah1.class);
                startActivity(intent);
            }
        });
    }
}