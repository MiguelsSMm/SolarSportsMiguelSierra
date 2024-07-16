package com.example.solarsportsmiguelsierra;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class HomeCategoriasActivity extends AppCompatActivity {
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_categorias);
        textView = findViewById(R.id.textViewTitulo);
        View clickableLayoutGimnasios = findViewById(R.id.clickableLayoutGimnasios);
        View clickableLayoutCanchas = findViewById(R.id.clickableLayoutCanchas);

        // Obtener el extra
        String title = getIntent().getStringExtra("TITLE");
        if (title != null) {
            textView.setText(title);

        }
        clickableLayoutCanchas.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (title != null) {
                    Intent intent = new Intent(HomeCategoriasActivity.this, Estadistica_Categoria_Activity.class);
                    intent.putExtra("TITLE", "Categoria Cancha");
                    startActivity(intent);
                } else {
                    Intent intent = new Intent(HomeCategoriasActivity.this, RegistroCategoriaActivity.class);
                    startActivity(intent);
                }
            }
        });


        clickableLayoutGimnasios.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (title != null) {
                    Intent intent = new Intent(HomeCategoriasActivity.this, Estadistica_Categoria_Activity.class);
                    intent.putExtra("TITLE", "Categoria Gimnasio");
                    startActivity(intent);
                } else {
                    Intent intent = new Intent(HomeCategoriasActivity.this, RegistroCategoriaActivity.class);
                    intent.putExtra("TITLE", "Registro en Gimnasio");
                    startActivity(intent);
                }
            }
        });


    }


    public void irPantallaRegistroCategoria(View view) {
        Intent intent = new Intent(this, RegistroCategoriaActivity.class);
        startActivity(intent);
    }

    public void volverPantallaHome(View view) {
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }

}