package com.example.upic2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ReporteServicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reporte_servicio);
    }
    public void callControl(View view){
        Intent i = new Intent(getApplicationContext(), ControlProceso.class);

        startActivity(i);
    }
    public void callConfirm(View view){
        Intent i = new Intent(getApplicationContext(), Confirm.class);

        startActivity(i);
    }
}