package com.example.coffeeorder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {
    RadioButton rb_kopiRobusta, rb_ekspresso, rb_kopilLuwak, rb_cream, rb_sugar, rb_bubukKopi, rb_nasiGoreng, rb_mieGoreng, rb_mieRebus ;
    TextView  tvTotalbayar;
    Button btnBayar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rb_kopiRobusta = findViewById(R.id.rb_kopiRobusta);
        rb_ekspresso = findViewById(R.id.rb_ekspresso);
        rb_kopilLuwak = findViewById(R.id.rb_kopiLuwak);
        rb_cream = findViewById(R.id.rb_cream);
        rb_sugar = findViewById(R.id.rb_sugar);
        rb_bubukKopi = findViewById(R.id.rb_bubukKopi);
        rb_nasiGoreng = findViewById(R.id.rb_nasiGoreng);
        rb_mieGoreng = findViewById(R.id.rb_mieGoreng);
        rb_mieRebus = findViewById(R.id.rb_mieRebus);
        tvTotalbayar = findViewById(R.id.tvTotalbayar);
        btnBayar = findViewById(R.id.btnBayar);

        btnBayar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvTotalbayar.setText("Rp  " + String.valueOf(totalBayar()));
            }
        });
    }

    private int totalBayar() {
        int Total = 0;

        if(rb_kopilLuwak.isChecked()){
            Total += 30000;
        }else if (rb_kopiRobusta.isChecked()){
            Total += 20000;
        }else if (rb_ekspresso.isChecked()) {
            Total  += 10000;
        }

        if(rb_sugar.isChecked()){
            Total  += 500;
        }else if (rb_cream.isChecked()){
            Total  += 3000;
        }else if (rb_bubukKopi.isChecked()) {
            Total  += 4000;
        }

        if(rb_nasiGoreng.isChecked()){
            Total  += 15000;
        }else if (rb_mieGoreng.isChecked()){
            Total  += 25000;
        }else if (rb_mieRebus.isChecked()) {
            Total  += 10000;
        }
        return Total;
    }}
