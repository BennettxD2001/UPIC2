package com.example.upic2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ControlProceso extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_control_proceso);
    }
    public void callReporte(View view){
        Intent i = new Intent(getApplicationContext(), ReporteServicio.class);

        startActivity(i);
    }
    public void callCalif(View view){
        Intent i = new Intent(getApplicationContext(), Calificacion.class);

        startActivity(i);
    }
}