package com.example.internshipapplication;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;
import android.widget.Toolbar;

import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;

import java.util.Objects;

public class MainActivity extends BaseActivity {

    private AppCompatEditText input;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input = findViewById(R.id.input);
        AppCompatButton btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                String message = Objects.requireNonNull(input.getText()).toString();

                if (TextUtils.isEmpty(input.getText().toString())) {
                    Toast.makeText(getApplicationContext(), R.string.toast_empty_field, Toast.LENGTH_LONG).show();
                } else {
                    intent.putExtra(Constants.EXTRA_MESSAGE, message);
                    startActivityForResult(intent, Constants.SECOND_ACTIVITY_REQUEST_CODE);
                }
            }
        });

        initToolbar(getString(R.string.app_name));

    }

    @Override
    protected void onActivityResult (int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == Constants.SECOND_ACTIVITY_REQUEST_CODE) {
            if (resultCode == RESULT_OK) {
                Objects.requireNonNull(input.getText()).clear();
                Toast.makeText(getApplicationContext(), R.string.toast_result_success, Toast.LENGTH_LONG).show();
            } else if (resultCode == RESULT_CANCELED) {
                Objects.requireNonNull(input.getText()).clear();
            }
        }
    }

}