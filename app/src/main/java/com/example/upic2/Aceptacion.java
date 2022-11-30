package com.example.upic2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Aceptacion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aceptacion);
    }
    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message,
                Toast.LENGTH_SHORT);
        toast.show();
    }
    public void callLlegada(View view){
        Intent i = new Intent(getApplicationContext(), Llegada.class);

        startActivity(i);
    }
    public void callMenupr(View view){
        Intent i = new Intent(getApplicationContext(), Menupr.class);


        startActivity(i);
    }
}