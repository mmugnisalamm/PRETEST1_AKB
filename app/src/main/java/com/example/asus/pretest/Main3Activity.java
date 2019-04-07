package com.example.asus.pretest;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    TextView txtNama, txtUmur;
    EditText etNama, etUmur;
    Button butonSelanjutnya;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        txtNama = (TextView) findViewById(R.id.TVNama);
        txtUmur = (TextView) findViewById(R.id.TVUmur);
        etNama = (EditText) findViewById(R.id.ETNama);
        etUmur = (EditText) findViewById(R.id.ETUmur);
        butonSelanjutnya = (Button) findViewById(R.id.buttonSelanjutnya);

        Typeface customfont = Typeface.createFromAsset(getAssets(), "font/nunito_bold.ttf");
        Typeface customfont2 = Typeface.createFromAsset(getAssets(), "font/rubik_regular.ttf");

        txtNama.setTypeface(customfont);
        txtUmur.setTypeface(customfont);
        etNama.setTypeface(customfont2);
        etUmur.setTypeface(customfont2);
        butonSelanjutnya.setTypeface(customfont);

        butonSelanjutnya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String nama = etNama.getText().toString();
                String umur = etUmur.getText().toString();

                Intent intent = new Intent(Main3Activity.this, Main4Activity.class);
                intent.putExtra("Nama", nama);
                intent.putExtra("Umur", umur);
                startActivity(intent);

            }
        });

    }
}
