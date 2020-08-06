package com.example.internshipapplication;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends BaseActivity {

    boolean inLandscapeMode;
    private FragmentChooser fragmentChooser;
    private FragmentViewer fragmentViewer;

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
            fragmentViewer.showCar(new CarModel("Lada 2106", 80, 150, "Deep Purple", 1976, R.drawable.lada_sedan));
        } else {
            Intent carIntent = new Intent(MainActivity.this, SecondActivity.class);
            carIntent.putExtra(Constants.EXTRA_CAR, new CarModel("Lada 2106", 80, 150, "Deep Purple", 1976, R.drawable.lada_sedan));
            startActivity(carIntent);
        }
    }

    public void openHondaInfo() {
        if (inLandscapeMode) {
            fragmentViewer.showCar(new CarModel("Honda Accord", 281, 230, "Space Grey", 2020, R.drawable.honda_accord));
        } else {
            Intent carIntent = new Intent(MainActivity.this, SecondActivity.class);
            carIntent.putExtra(Constants.EXTRA_CAR, new CarModel("Honda Accord", 281, 230, "Space Grey", 2020, R.drawable.honda_accord));
            startActivity(carIntent);
        }
    }

    public void openAudiInfo() {
        if (inLandscapeMode) {
            fragmentViewer.showCar(new CarModel("Audi A7", 340, 250, "Royal Blue", 2020, R.drawable.audi_a7));
        } else {
            Intent carIntent = new Intent(MainActivity.this, SecondActivity.class);
            carIntent.putExtra(Constants.EXTRA_CAR, new CarModel("Audi A7", 340, 250, "Royal Blue", 2020, R.drawable.audi_a7));
            startActivity(carIntent);
        }
    }

    public void openPorscheInfo() {
        if (inLandscapeMode) {
            fragmentViewer.showCar(new CarModel("Porsche Taycan", 625, 260, "Ice Blue", 2019, R.drawable.porsche_taycan));
        } else {
            Intent carIntent = new Intent(MainActivity.this, SecondActivity.class);
            carIntent.putExtra(Constants.EXTRA_CAR, new CarModel("Porsche Taycan", 625, 260, "Ice Blue", 2019, R.drawable.porsche_taycan));
            startActivity(carIntent);
        }
    }

    public void openTeslaInfo() {
        if (inLandscapeMode) {
            fragmentViewer.showCar(new CarModel("Tesla Model S", 762, 250, "Red", 2017, R.drawable.tesla));
        } else {
            Intent carIntent = new Intent(MainActivity.this, SecondActivity.class);
            carIntent.putExtra(Constants.EXTRA_CAR, new CarModel("Tesla Model S", 762, 250, "Red", 2017, R.drawable.tesla));
            startActivity(carIntent);
        }
    }

}