package com.example.upic2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Registro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
    }
    public void callInicio(View view){
        Intent i = new Intent(getApplicationContext(), MainActivity.class);

        startActivity(i);
    }
    public void callAuto(View view){
        Intent i = new Intent(getApplicationContext(), Registrocar.class);

        startActivity(i);
    }
}