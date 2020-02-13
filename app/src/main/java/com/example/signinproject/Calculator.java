package com.example.signinproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Calculator extends AppCompatActivity {

    Button btn_Multiply;
    Button btn_Division;
    Button btn_Increase;
    Button btn_Decrease;
    EditText txt_FirstNum;
    EditText txt_SecNum;
    TextView tv_Result;

    Double a;
    Double b;
    Double c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        getSupportActionBar().hide();

        tv_Result = findViewById(R.id.tv_Result);
        txt_FirstNum = findViewById(R.id.txt_FirstNum);
        txt_SecNum = findViewById(R.id.txt_SecNum);
        btn_Division = findViewById(R.id.btn_Division);
        btn_Multiply = findViewById(R.id.btn_Multiply);
        btn_Increase = findViewById(R.id.btn_Increase);
        btn_Decrease = findViewById(R.id.btn_Decrease);


        btn_Decrease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (txt_SecNum.getText().toString().length() != 0 || txt_FirstNum.getText().toString().length() != 0 ){
                    a = Double.parseDouble(txt_FirstNum.getText().toString());
                    b = Double.parseDouble(txt_SecNum.getText().toString());
                    c = a - b;
                    tv_Result.setText(c.toString());
                }
                else
                {
                    Toast.makeText(Calculator.this, "Please Input A Number", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btn_Increase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (txt_SecNum.getText().toString().length() != 0 || txt_FirstNum.getText().toString().length() != 0 ){
                    a = Double.parseDouble(txt_FirstNum.getText().toString());
                    b = Double.parseDouble(txt_SecNum.getText().toString());
                    c = a + b;
                    tv_Result.setText(c.toString());
                }
                else
                {
                    Toast.makeText(Calculator.this, "Please Input A Number", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btn_Division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (txt_SecNum.getText().toString().length() != 0 || txt_FirstNum.getText().toString().length() != 0 ){
                    a = Double.parseDouble(txt_FirstNum.getText().toString());
                    b = Double.parseDouble(txt_SecNum.getText().toString());
                    c = a / b;
                    tv_Result.setText(c.toString());
                }
                else
                {
                    Toast.makeText(Calculator.this, "Please Input A Number", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btn_Multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (txt_SecNum.getText().toString().length() != 0 || txt_FirstNum.getText().toString().length() != 0 ){
                    a = Double.parseDouble(txt_FirstNum.getText().toString());
                    b = Double.parseDouble(txt_SecNum.getText().toString());
                    c = a * b;
                    tv_Result.setText(c.toString());
                }
                else
                {
                    Toast.makeText(Calculator.this, "Please Input A Number", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
