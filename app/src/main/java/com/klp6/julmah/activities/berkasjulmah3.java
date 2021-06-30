package com.klp6.julmah.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.klp6.julmah.R;

public class berkasjulmah3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_berkasjulmah3);

        ImageView notifikasi = (ImageView) findViewById(R.id.imageView93);
        ImageView profil = (ImageView) findViewById(R.id.imageView92);
        ImageButton lanjutkan = (ImageButton) findViewById(R.id.imageButton23);
        ImageView pengaturan = (ImageView) findViewById(R.id.imageView95);
        ImageView kembali = (ImageView) findViewById(R.id.imageView84);

        notifikasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(berkasjulmah3.this, notifikasi.class);
                startActivity(intent);
            }
        });

        profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(berkasjulmah3.this, profil.class);
                startActivity(intent);
            }
        });

        lanjutkan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(berkasjulmah3.this, berkasjulmah4.class);
                startActivity(intent);
            }
        });

        pengaturan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(berkasjulmah3.this, pengaturan.class);
                startActivity(intent);
            }
        });

        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(berkasjulmah3.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}