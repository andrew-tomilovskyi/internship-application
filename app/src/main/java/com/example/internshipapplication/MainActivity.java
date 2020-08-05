package com.example.internshipapplication;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;

public class MainActivity extends BaseActivity {

    boolean inLandscapeMode;
    private FragmentChooser fragmentChooser;
    private FragmentViewer fragmentViewer;
    private AppCompatTextView textView;
    private AppCompatImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initToolbar(getString(R.string.app_name));

        inLandscapeMode = findViewById(R.id.fragment_two) != null;

        fragmentChooser = (FragmentChooser) getSupportFragmentManager().findFragmentById(R.id.fragment_one);
        if (inLandscapeMode) {
            fragmentViewer = (FragmentViewer) getSupportFragmentManager().findFragmentById(R.id.fragment_two);
        }

    }

    public void openLadaInfo() {
        if (inLandscapeMode) {
            imageView = findViewById(R.id.car_photo);
            imageView.setImageResource(R.drawable.lada_sedan);
            textView = findViewById(R.id.car_info);
            textView.setText("Car: Lada 2106");

        } else {
            Intent carIntent = new Intent(MainActivity.this, SecondActivity.class);
            carIntent.putExtra(Constants.EXTRA_CAR, new CarModel("Lada 2106", 80, 150, "Deep Purple", 1976, R.drawable.lada_sedan));
            startActivity(carIntent);
        }
    }

    public void openHondaInfo() {
        Intent carIntent = new Intent(MainActivity.this, SecondActivity.class);
        carIntent.putExtra(Constants.EXTRA_CAR, new CarModel("Honda Accord", 281, 230, "Space Grey", 2020, R.drawable.honda_accord));
        startActivity(carIntent);
    }

    public void openAudiInfo() {
        Intent carIntent = new Intent(MainActivity.this, SecondActivity.class);
        carIntent.putExtra(Constants.EXTRA_CAR, new CarModel("Audi A7", 340, 250, "Royal Blue", 2020, R.drawable.audi_a7));
        startActivity(carIntent);
    }

    public void openPorscheInfo() {
        Intent carIntent = new Intent(MainActivity.this, SecondActivity.class);
        carIntent.putExtra(Constants.EXTRA_CAR, new CarModel("Porsche Taycan", 625, 260, "Ice Blue", 2019, R.drawable.porsche_taycan));
        startActivity(carIntent);
    }

    public void openTeslaInfo() {
        Intent carIntent = new Intent(MainActivity.this, SecondActivity.class);
        carIntent.putExtra(Constants.EXTRA_CAR, new CarModel("Tesla Model S", 762, 250, "Red", 2017, R.drawable.tesla));
        startActivity(carIntent);
    }

}