package com.example.homefit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements AdapterView.OnClickListener {

    private Button btnRegistro;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnRegistro = (Button) findViewById(R.id.buttonRegistrarse);
        btnLogin = (Button) findViewById(R.id.buttonLogin);

        btnRegistro.setOnClickListener(this);
        btnLogin.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        Intent intent;
        if (v.getId() == R.id.buttonRegistrarse) {
            intent = new Intent(this, RegistroActivity.class);
        } else {
            intent = new Intent(this, LoginActivity.class);
        }
        startActivity(intent);
    }
}