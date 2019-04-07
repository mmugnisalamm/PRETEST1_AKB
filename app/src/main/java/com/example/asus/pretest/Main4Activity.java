package com.example.asus.pretest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Main4Activity extends AppCompatActivity {

    TextView TVNama, TVUmur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        TVNama = (TextView) findViewById(R.id.nama);
        TVUmur = (TextView) findViewById(R.id.umur);

        Intent intent = getIntent();
        String Nama = intent.getStringExtra("Nama");
        String Umur = intent.getStringExtra("Umur");

        TVNama.setText(Nama);
        TVUmur.setText(Umur);
    }
}
