package com.klp6.julmah.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.klp6.julmah.R;

public class chatsemua extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chatsemua);

        ImageView notifikasi = (ImageView) findViewById(R.id.imageView151);
        ImageView profil = (ImageView) findViewById(R.id.imageView24);
        ImageView beranda = (ImageView) findViewById(R.id.imageView142);
        ImageView pengaturan = (ImageView) findViewById(R.id.imageView141);
        ImageView kembali = (ImageView) findViewById(R.id.imageView31);
        ImageView julmah = (ImageView) findViewById(R.id.imageView152);

        notifikasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(chatsemua.this, notifikasi.class);
                startActivity(intent);
            }
        });
        pengaturan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(chatsemua.this, pengaturan.class);
                startActivity(intent);
            }
        });
        beranda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(chatsemua.this, MainActivity.class);
                startActivity(intent);
            }
        });
        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(chatsemua.this, MainActivity.class);
                startActivity(intent);
            }
        });
        profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(chatsemua.this, profil.class);
                startActivity(intent);
            }
        });
        julmah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(chatsemua.this, jualrumah.class);
                startActivity(intent);
            }
        });

    }
}