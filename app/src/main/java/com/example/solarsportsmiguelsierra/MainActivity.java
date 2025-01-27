package com.example.solarsportsmiguelsierra;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

    }

    public void irPantallaLogin(View view){
        Intent intent= new Intent(this, LoginActivity.class);
        startActivity(intent);
    }

    public void irPantallaRegistrar(View view){
        Intent intent= new Intent(this, RegisterActivity.class);
        startActivity(intent);
    }
}