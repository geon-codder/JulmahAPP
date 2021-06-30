package com.klp6.julmah.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.klp6.julmah.R;

public class filter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filter);

        ImageView notifikasi = (ImageView) findViewById(R.id.imageView37);
        ImageView beranda = (ImageView) findViewById(R.id.imageView41);
        ImageView pengaturan = (ImageView) findViewById(R.id.imageView40);
        ImageView kembali = (ImageView) findViewById(R.id.imageView33);
        ImageView profil = (ImageView) findViewById(R.id.imageView38);
        ImageView sell = (ImageView) findViewById(R.id.imageView43);
        ImageView pencarian = (ImageView) findViewById(R.id.imageView35);

        notifikasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(filter.this, notifikasi.class);
                startActivity(intent);
            }
        });

        pengaturan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(filter.this, pengaturan.class);
                startActivity(intent);
            }
        });
        beranda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(filter.this, MainActivity.class);
                startActivity(intent);
            }
        });
        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(filter.this, MainActivity.class);
                startActivity(intent);
            }
        });
        profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(filter.this, profil.class);
                startActivity(intent);
            }
        });
        sell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(filter.this, jualrumah.class);
                startActivity(intent);
            }
        });
        pencarian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(filter.this, pencarian.class);
                startActivity(intent);
            }
        });
    }
}