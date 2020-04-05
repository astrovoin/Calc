package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText el1 = findViewById(R.id.num1);
    EditText el2 = findViewById(R.id.num2);
    TextView resText = findViewById(R.id.result);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickPlusBtn ( View v) {

        int num1 = Integer.parseInt(el1.getText().toString());
        int num2 = Integer.parseInt(el2.getText().toString());
        int resSum = num1 + num2;
        resText.setText(Integer.toString(resSum));

    }
    public void onClickMinusBtn ( View v) {

        int num1 = Integer.parseInt(el1.getText().toString());
        int num2 = Integer.parseInt(el2.getText().toString());
        int resSum = num1 - num2;
        resText.setText(Integer.toString(resSum));

    }

    public void onClickMultiplyBtn ( View v) {

        int num1 = Integer.parseInt(el1.getText().toString());
        int num2 = Integer.parseInt(el2.getText().toString());
        int resSum = num1 * num2;
        resText.setText(Integer.toString(resSum));

    }

    public void onClickDelBtn ( View v) {

        int num1 = Integer.parseInt(el1.getText().toString());
        int num2 = Integer.parseInt(el2.getText().toString());
        int resSum = num1 / num2;
        resText.setText(Integer.toString(resSum));

    }

}
