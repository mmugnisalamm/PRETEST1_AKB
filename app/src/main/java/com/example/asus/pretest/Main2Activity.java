package com.example.asus.pretest;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    Button buttonMasuk, buttonBeli;
    TextView txt1, txt2, txt3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        buttonMasuk = (Button) findViewById(R.id.BT1);
        buttonBeli = (Button) findViewById(R.id.buttonBeli);
        txt1 = (TextView) findViewById(R.id.TV1);
        txt2 = (TextView) findViewById(R.id.TV2);
        txt3 = (TextView) findViewById(R.id.TV3);

        Typeface customfont = Typeface.createFromAsset(getAssets(), "font/nunito_bold.ttf");
        Typeface customfont2 = Typeface.createFromAsset(getAssets(), "font/rubik_regular.ttf");

        txt1.setTypeface(customfont);
        txt2.setTypeface(customfont2);
        txt3.setTypeface(customfont2);
        buttonMasuk.setTypeface(customfont2);
        buttonBeli.setTypeface(customfont2);

        buttonMasuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this, Main3Activity.class);
                startActivity(intent);
            }
        });

    }
}
