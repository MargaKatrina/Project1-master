package com.example.project1;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    TextView txtEmail;
    EditText txtName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtEmail = findViewById(R.id.etEmail);
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d("message", "onStart() has excecuted...");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("message", "onResume() has excecuted...");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("message", "onPause() has excecuted...");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("message", "onStop() has excecuted...");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("message", "onDestroy() has excecuted...");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("message", "onRestart() has excecuted...");
    }

    public void showLogIn(View v) {
        Intent i = new Intent(this, LogIn.class);
        startActivity(i);
    }



}