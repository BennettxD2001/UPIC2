package com.example.upic2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Perele extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perele);
    }
    public void callComenele(View view){
        Intent i = new Intent(getApplicationContext(), Comenele.class);

        startActivity(i);
    }
    public void callPedir(View view){
        Intent i = new Intent(getApplicationContext(), Pedir.class);

        startActivity(i);
    }
}