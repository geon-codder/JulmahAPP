package com.klp6.julmah.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.klp6.julmah.R;

public class pengaturan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pengaturan);

        ImageView notifikasi = (ImageView) findViewById(R.id.imageView118);
        ImageView profil = (ImageView) findViewById(R.id.imageView119);
        ImageView beranda = (ImageView) findViewById(R.id.imageView107);
        ImageView jualrumah = (ImageView) findViewById(R.id.imageView114);

        TextView notif = (TextView) findViewById(R.id.textView77);
        TextView riwayat = (TextView) findViewById(R.id.textView78);
        TextView tentang = (TextView) findViewById(R.id.textView88);
        TextView keluar = (TextView) findViewById(R.id.textView87);

        notifikasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(pengaturan.this, notifikasi.class);
                startActivity(intent);
            }
        });

        profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(pengaturan.this, profil.class);
                startActivity(intent);
            }
        });

        jualrumah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(pengaturan.this, jualrumah.class);
                startActivity(intent);
            }
        });

        beranda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(pengaturan.this, MainActivity.class);
                startActivity(intent);
            }
        });

        notif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(pengaturan.this, notifikasi.class);
                startActivity(intent);
            }
        });
        riwayat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(pengaturan.this, chatsemua.class);
                startActivity(intent);
            }
        });
        tentang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(pengaturan.this, tentangaplikasi.class);
                startActivity(intent);
            }
        });
        keluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(pengaturan.this, halaman_login.class);
                startActivity(intent);
            }
        });

    }
}