package com.example.solarsportsmiguelsierra;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class RegistroCategoriaActivity extends AppCompatActivity {
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_categoria);
        textView = findViewById(R.id.textViewTitulo);

        List<String> opcionesSede = new ArrayList<>();
        opcionesSede.add("Seleccione...");
        opcionesSede.add("Bulevar Niza");
        opcionesSede.add("Cedritos");
        opcionesSede.add("Rosales");

        List<String> opcionesMes = new ArrayList<>();
        opcionesMes.add("Seleccione...");
        opcionesMes.add("Enero");
        opcionesMes.add("Febrero");
        opcionesMes.add("Marzo");
        opcionesMes.add("Abril");
        opcionesMes.add("Mayo");
        opcionesMes.add("Junio");
        opcionesMes.add("Julio");
        opcionesMes.add("Agosto");
        opcionesMes.add("Septiembre");
        opcionesMes.add("Octubre");
        opcionesMes.add("Noviembre");
        opcionesMes.add("Diciembre");

        setupSpinner(R.id.spinnerSede, opcionesSede);
        setupSpinner(R.id.spinnerMes, opcionesMes);
        // Obtener el extra
        String title = getIntent().getStringExtra("TITLE");
        if (title != null) {
            textView.setText(title);
        }

    }

    private void setupSpinner(int spinnerId, List<String> opciones) {
        Spinner spinner = findViewById(spinnerId);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, opciones);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Toast.makeText(RegistroCategoriaActivity.this, "Por favor, seleccione una opción.", Toast.LENGTH_SHORT).show();
                } else {
                    String seleccion = parent.getItemAtPosition(position).toString();
                    Toast.makeText(RegistroCategoriaActivity.this, "Seleccionaste: " + seleccion, Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // No se seleccionó ninguna opción
            }
        });
    }


    public void volverPantallaHomeCategorias(View view){
        Intent intent= new Intent(this, HomeCategoriasActivity.class);
        startActivity(intent);
    }
    private void actualizarTextView(String nuevoTitulo) {
        textView.setText(nuevoTitulo);
    }
}