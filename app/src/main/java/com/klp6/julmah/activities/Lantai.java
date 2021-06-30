package com.klp6.julmah.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.klp6.julmah.R;

public class Lantai extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lantai);

        ImageView notifikasi = (ImageView) findViewById(R.id.imageView61);
        ImageView pencarian = (ImageView) findViewById(R.id.imageView59);
        ImageView beranda = (ImageView) findViewById(R.id.imageView54);
        ImageView pengaturan = (ImageView) findViewById(R.id.imageView53);
        ImageView kembali = (ImageView) findViewById(R.id.imageView57);
        ImageView profil = (ImageView) findViewById(R.id.imageView62);
        ImageView julmah = (ImageView) findViewById(R.id.imageView56);

        notifikasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Lantai.this, notifikasi.class);
                startActivity(intent);
            }
        });

        pengaturan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Lantai.this, pengaturan.class);
                startActivity(intent);
            }
        });
        beranda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Lantai.this, MainActivity.class);
                startActivity(intent);
            }
        });
        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Lantai.this, MainActivity.class);
                startActivity(intent);
            }
        });
        profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Lantai.this, profil.class);
                startActivity(intent);
            }
        });
        julmah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Lantai.this, jualrumah.class);
                startActivity(intent);
            }
        });
        pencarian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Lantai.this, pencarian.class);
                startActivity(intent);
            }
        });
    }
}