package com.klp6.julmah.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.klp6.julmah.R;

public class profil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);

        ImageView notifikasi = (ImageView) findViewById(R.id.imageView108);
        ImageView kembali = (ImageView) findViewById(R.id.imageView104);
        ImageButton buatpost = (ImageButton) findViewById(R.id.imageButton25);
        ImageView pengaturan = (ImageView) findViewById(R.id.imageView110);

        notifikasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(profil.this, notifikasi.class);
                startActivity(intent);
            }
        });

        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(profil.this, MainActivity.class);
                startActivity(intent);
            }
        });

        buatpost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(profil.this, berkasjulmah1.class);
                startActivity(intent);
            }
        });

        pengaturan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(profil.this, pengaturan.class);
                startActivity(intent);
            }
        });
    }
}