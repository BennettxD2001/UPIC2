package com.example.upic2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Llegada extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_llegada);
    }
    public void callAceptacion(View view){
        Intent i = new Intent(getApplicationContext(), Aceptacion.class);

        startActivity(i);
    }
    public void callControl(View view){
        Intent i = new Intent(getApplicationContext(), ControlProceso.class);

        startActivity(i);
    }
}