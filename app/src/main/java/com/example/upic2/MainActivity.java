package com.example.upic2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        setTheme(R.style.Theme_UPIC2);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void callRegistro(View view){
        Intent i = new Intent(getApplicationContext(), Registro.class);

        startActivity(i);
    }
    public void callMenupr(View view){
        Intent i = new Intent(getApplicationContext(), Menupr.class);

        startActivity(i);
    }
}