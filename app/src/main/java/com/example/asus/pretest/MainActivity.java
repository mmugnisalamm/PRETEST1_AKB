package com.example.asus.pretest;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txt1;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        txt1 = (TextView) findViewById(R.id.textMonitory);
        btn1 = (Button) findViewById(R.id.buttonMulai);

        Typeface customfont = Typeface.createFromAsset(getAssets(), "font/nunito_bold.ttf");
        Typeface customfont2 = Typeface.createFromAsset(getAssets(), "font/rubik_regular.ttf");

        txt1.setTypeface(customfont);
        btn1.setTypeface(customfont2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);
            }
        });

    }
}
