package com.klp6.julmah.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.klp6.julmah.R;

public class pencarian extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pencarian);

        ImageView notifikasi = (ImageView) findViewById(R.id.imageView49);
        ImageView beranda = (ImageView) findViewById(R.id.imageView65);
        ImageView pengaturan = (ImageView) findViewById(R.id.imageView64);
        ImageView kembali = (ImageView) findViewById(R.id.imageView45);
        ImageView profil = (ImageView) findViewById(R.id.imageView50);
        ImageView sell = (ImageView) findViewById(R.id.imageView67);

        notifikasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(pencarian.this, notifikasi.class);
                startActivity(intent);
            }
        });

        pengaturan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(pencarian.this, pengaturan.class);
                startActivity(intent);
            }
        });
        beranda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(pencarian.this, MainActivity.class);
                startActivity(intent);
            }
        });
        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(pencarian.this, MainActivity.class);
                startActivity(intent);
            }
        });
        profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(pencarian.this, profil.class);
                startActivity(intent);
            }
        });
        sell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(pencarian.this, jualrumah.class);
                startActivity(intent);
            }
        });
    }
}