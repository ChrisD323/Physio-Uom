package com.example.new_ergasia;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import com.example.new_ergasia.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    //NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
    //XRISTOS
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //remove ActionBar
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.PSFLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
               startActivity(intent);

            }
        });
        //ANTWNHS

        // Get reference to the TextView in your MainActivity layout file
        TextView textView = findViewById(R.id.client_login);

        // Set a click listener on the TextView
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the User_Activity_R9 activity using intent3 object
                Intent intent3 = new Intent(MainActivity.this, User_Activity_R9.class);
                startActivity(intent3);
            }
        });


    }

}