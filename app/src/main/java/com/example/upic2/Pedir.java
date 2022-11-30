package com.example.upic2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Pedir extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedir);
    }
    public void callMenupr(View view){
        Intent i = new Intent(getApplicationContext(), Menupr.class);

        startActivity(i);
    }
    public void callCosto(View view){
        Intent i = new Intent(getApplicationContext(), Costo.class);

        startActivity(i);
    }
}