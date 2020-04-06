package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView resText;
    int c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText el1 = findViewById(R.id.num1);
        final EditText el2 = findViewById(R.id.num2);
        resText = findViewById(R.id.result);

        Button plusbtn = findViewById(R.id.plusbtn);
        Button minusbtn = findViewById(R.id.minusbtn);
        Button multiplybtn = findViewById(R.id.multiplybtn);
        Button delbtn = findViewById(R.id.delbtn);


        plusbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process(Integer.parseInt(el1.getText().toString()), Integer.parseInt(el2.getText().toString()), '+');
            }
        });

        minusbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process(Integer.parseInt(el1.getText().toString()), Integer.parseInt(el2.getText().toString()), '-');
            }
        });

        multiplybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process(Integer.parseInt(el1.getText().toString()), Integer.parseInt(el2.getText().toString()), '*');
            }
        });

        delbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process(Integer.parseInt(el1.getText().toString()), Integer.parseInt(el2.getText().toString()), '/');
            }
        });

    }



    public void process(int a, int b, char target) {
        switch (target) {
            case '+':
                c = a + b;
                resText.setText(Integer.toString(c));
                break;
            case '-':
                c = a - b;
                resText.setText(Integer.toString(c));
                break;
            case '*':
                c = a * b;
                resText.setText(Integer.toString(c));
                break;
            case '/':
                c = a / b;
                resText.setText(Integer.toString(c));
                break;
        }

    }
}
