package com.example.testapp;

import android.content.Intent;
import android.os.Bundle;



import androidx.appcompat.app.AppCompatActivity;

import android.view.View;


import androidx.navigation.ui.AppBarConfiguration;


import com.example.testapp.databinding.ActivityTakeTestBinding;

public class TakeTest extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityTakeTestBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_test);
        Intent intent = getIntent();

    }

}
