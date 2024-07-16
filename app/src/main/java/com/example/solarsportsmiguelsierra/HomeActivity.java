package com.example.solarsportsmiguelsierra;

import static androidx.core.content.ContextCompat.startActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        View clickableLayoutEstadisticas = findViewById(R.id.clickableLayoutEstadisticas);


        clickableLayoutEstadisticas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, HomeCategoriasActivity.class);
                intent.putExtra("TITLE", "Estadisticas x Categorias");
                startActivity(intent);
            }
        });
    }

    public void irPantallaCategorias(View view){
        Intent intent = new Intent(this,HomeCategoriasActivity.class);
        startActivity(intent);
    }

    public void irPantallaBeneficios(View view){
        Intent intent = new Intent(this,BeneficiosActivity.class);
        startActivity(intent);
    }
    public void irPantallaPrincipal(View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

}