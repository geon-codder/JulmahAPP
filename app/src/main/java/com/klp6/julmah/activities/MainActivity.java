package com.klp6.julmah.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.klp6.julmah.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView notifikasi = (ImageView) findViewById(R.id.imageView23);
        ImageView pencarian = (ImageView) findViewById(R.id.imageView145);
        ImageButton filter = (ImageButton) findViewById(R.id.imageButton27);
        ImageView sell = (ImageView) findViewById(R.id.imageView142);
        ImageView pengaturan = (ImageView) findViewById(R.id.imageView141);
        ImageView profil = (ImageView) findViewById(R.id.imageView147);

        notifikasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, com.klp6.julmah.activities.notifikasi.class);
                startActivity(intent);
            }
        });
        pencarian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, com.klp6.julmah.activities.pencarian.class);
                startActivity(intent);
            }
        });

        filter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, com.klp6.julmah.activities.filter.class);
                startActivity(intent);
            }
        });
        sell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, jualrumah.class);
                startActivity(intent);
            }
        });
        pengaturan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, com.klp6.julmah.activities.pengaturan.class);
                startActivity(intent);
            }
        });
        profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, com.klp6.julmah.activities.profil.class);
                startActivity(intent);
            }
        });
    }
}