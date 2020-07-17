package com.example.internshipapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.internshipapplication.MESSAGE";
    public static final int SECOND_ACTIVITY_REQUEST_CODE = 42;

    AppCompatEditText input;
    AppCompatButton btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input = (AppCompatEditText) findViewById(R.id.input);
        btn = (AppCompatButton) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                String message = Objects.requireNonNull(input.getText()).toString();

                if (TextUtils.isEmpty(input.getText().toString())) {
                    Toast.makeText(getApplicationContext(), R.string.toast_empty_field, Toast.LENGTH_LONG).show();
                } else {
                    intent.putExtra(EXTRA_MESSAGE, message);
                    startActivityForResult(intent, SECOND_ACTIVITY_REQUEST_CODE);
                }
            }
        });
    }

    @Override
    protected void onActivityResult (int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == SECOND_ACTIVITY_REQUEST_CODE) {
            if (resultCode == RESULT_OK) {
                Toast.makeText(getApplicationContext(), R.string.toast_result_success, Toast.LENGTH_LONG).show();
            } else if (resultCode == RESULT_CANCELED) {
                Objects.requireNonNull(input.getText()).clear();
            }
        }
    }

}