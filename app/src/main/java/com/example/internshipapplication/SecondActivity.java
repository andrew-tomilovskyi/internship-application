package com.example.internshipapplication;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;

public class SecondActivity extends BaseActivity {

    private FragmentViewer fragmentViewer;
    private CarModel carModel;
    private AppCompatTextView textView;
    private AppCompatImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        initToolbarWithNavigation(getString(R.string.app_name));

        fragmentViewer = (FragmentViewer) getSupportFragmentManager().findFragmentById(R.id.fragment_two);

        carModel = getIntent().getParcelableExtra(Constants.EXTRA_CAR);

        textView = findViewById(R.id.car_info);
        textView.setText(carModel.toString());

        imageView = findViewById(R.id.car_photo);
        imageView.setImageResource(carModel.carPhoto);

    }
}