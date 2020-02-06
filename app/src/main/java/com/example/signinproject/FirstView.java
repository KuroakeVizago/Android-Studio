package com.example.signinproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FirstView extends AppCompatActivity {

    TextView btn_Sign_In;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_view);
try {
    getSupportActionBar().hide();

    btn_Sign_In = findViewById(R.id.btn_sign_in);
    btn_Sign_In.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v    ) {
            Intent intent = new Intent(FirstView.this, Login.class);
            startActivity(intent);
        }
    });
}catch (Exception e){
    Intent intent = new Intent(FirstView.this, Login.class);
    startActivity(intent);
}

    }
}
