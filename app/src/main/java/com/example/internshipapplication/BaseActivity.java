package com.example.internshipapplication;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public abstract class BaseActivity extends AppCompatActivity {

    private Toolbar toolbar;

    private Toolbar.OnMenuItemClickListener onMenuItemClickListener = new Toolbar.OnMenuItemClickListener() {
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
    };

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
        toolbar.setOnMenuItemClickListener(onMenuItemClickListener);
    }

    public void initToolbar (String title) {
        toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle(title);
        toolbar.inflateMenu(R.menu.main_menu);
        toolbar.setOnMenuItemClickListener(onMenuItemClickListener);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }
}
