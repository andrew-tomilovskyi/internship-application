package com.example.internshipapplication;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import android.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;

public abstract class BaseActivity extends AppCompatActivity {

    private Toolbar toolbar;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    public void initToolbarWithNavigation (String title) {
        toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle(title);
        toolbar.setNavigationIcon(R.drawable.baseline_arrow_back_24);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        toolbar.inflateMenu(R.menu.main_menu);
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch(item.getItemId()) {
                    case R.id.search:
                        Toast.makeText(getApplicationContext(), R.string.toast_search, Toast.LENGTH_LONG).show();
                        return true;

                    case R.id.settings:
                        Toast.makeText(getApplicationContext(), R.string.toast_settings, Toast.LENGTH_LONG).show();
                        return true;

                    case R.id.help:
                        Toast.makeText(getApplicationContext(), R.string.toast_help, Toast.LENGTH_LONG).show();
                        return true;
                }
                return false;
            }
        });
    }

    public void initToolbar (String title) {
        toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle(title);
        toolbar.inflateMenu(R.menu.main_menu);
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch(item.getItemId()) {
                    case R.id.search:
                        Toast.makeText(getApplicationContext(), "What are you looking for?", Toast.LENGTH_LONG).show();
                        return true;

                    case R.id.settings:
                        Toast.makeText(getApplicationContext(), "There is nothing to configure. Sorry.", Toast.LENGTH_LONG).show();
                        return true;

                    case R.id.help:
                        Toast.makeText(getApplicationContext(), "Self-help is the best help.", Toast.LENGTH_LONG).show();
                        return true;
                }
                return false;
            }
        });
    }

}
