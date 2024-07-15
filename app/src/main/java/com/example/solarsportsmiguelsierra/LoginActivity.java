package com.example.solarsportsmiguelsierra;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);

    }
    public void volverPantallaPrincipal(View view){
        Intent intent= new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void irPantallaHome(View view){
        Intent intent= new Intent(this, HomeActivity.class);
        startActivity(intent);
    }
}