package com.example.upic2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Comenvul extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comenvul);
    }
    public void callPedir(View view){
        Intent i = new Intent(getApplicationContext(), Pedir.class);

        startActivity(i);
    }
}