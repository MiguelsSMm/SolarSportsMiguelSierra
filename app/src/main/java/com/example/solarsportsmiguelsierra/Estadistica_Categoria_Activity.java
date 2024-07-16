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

public class Estadistica_Categoria_Activity extends AppCompatActivity {
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estadistica_categoria);
        textView = findViewById(R.id.textViewTitulo);
        // Obtener el extra
        String title = getIntent().getStringExtra("TITLE");
        if (title != null) {
            textView.setText(title);

        }

    }
    public void volverPantallaHomeCategorias(View view){
        Intent intent= new Intent(this, HomeCategoriasActivity.class);
        intent.putExtra("TITLE", "Estadisticas x Categorias");
        startActivity(intent);
    }


}