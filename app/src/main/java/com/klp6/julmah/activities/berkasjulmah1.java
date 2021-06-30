package com.klp6.julmah.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.klp6.julmah.R;

public class berkasjulmah1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_berkasjulmah1);

        ImageView notifikasi = (ImageView) findViewById(R.id.imageView73);
        ImageView profil = (ImageView) findViewById(R.id.imageView74);
        ImageButton lanjutkan = (ImageButton) findViewById(R.id.imageButton26);
        ImageView pengaturan = (ImageView) findViewById(R.id.imageView76);
        ImageView kembali = (ImageView) findViewById(R.id.imageView77);

        notifikasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(berkasjulmah1.this, notifikasi.class);
                startActivity(intent);
            }
        });

        profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(berkasjulmah1.this, profil.class);
                startActivity(intent);
            }
        });

        lanjutkan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(berkasjulmah1.this, berkasjulmah2.class);
                startActivity(intent);
            }
        });

        pengaturan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(berkasjulmah1.this, pengaturan.class);
                startActivity(intent);
            }
        });

        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(berkasjulmah1.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}