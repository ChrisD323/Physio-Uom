package com.example.new_ergasia;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.example.new_ergasia.databinding.ActivitySecondBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class ThirdActivity_R1 extends AppCompatActivity {

    private BottomNavigationView bottomNav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_r1);

        //remove ActionBar
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();



        bottomNav = findViewById(R.id.BottomNav);
        bottomNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.home:
                        Intent intent = new Intent(ThirdActivity_R1.this, MainActivity.class);
                        startActivity(intent);
                        finish();
                        return true;
                    case R.id.help:
                        ExampleDialog exampleDialog = new ExampleDialog();
                        exampleDialog.show(getSupportFragmentManager(),"example dialog");
                        return true;
                    case R.id.back:
                        onBackPressed();
                        return true;
                    default:
                        return false;
                }
            }


        });

    }




}

