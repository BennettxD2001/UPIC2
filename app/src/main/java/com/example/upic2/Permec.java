package com.example.upic2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Permec extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_permec);
    }
    public void callComenmec(View view){
        Intent i = new Intent(getApplicationContext(), Comenmec.class);

        startActivity(i);
    }
    public void callPedir(View view){
        Intent i = new Intent(getApplicationContext(), Pedir.class);

        startActivity(i);
    }
}