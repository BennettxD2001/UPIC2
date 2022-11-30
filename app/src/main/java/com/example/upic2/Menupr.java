package com.example.upic2;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.upic2.databinding.ActivityMenuprBinding;

public class Menupr extends AppCompatActivity {

    private ActivityMenuprBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMenuprBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_menupr);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(binding.navView, navController);
    }
    public void callPermec(View view){
        Intent i = new Intent(getApplicationContext(), Permec.class);

        startActivity(i);
    }
    public void callPerele(View view){
        Intent i = new Intent(getApplicationContext(), Perele.class);

        startActivity(i);
    }
    public void callPervul(View view){
        Intent i = new Intent(getApplicationContext(), Pervul.class);

        startActivity(i);
    }

}