package com.example.appmovil5b;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class HeroeRecibido extends AppCompatActivity {

    TextView nombre;
    TextView tipo;
    TextView poder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_heroe_recibido);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        nombre = findViewById(R.id.txtNombre);
        tipo = findViewById(R.id.txtTIpo);
        poder = findViewById(R.id.txtPoder);

        Heroe heroe = (Heroe) getIntent().getSerializableExtra("heroeEnviado");

        nombre.setText(heroe.getNombre());
        tipo.setText(heroe.getTipo());
        poder.setText(""+heroe.getNivelPoder());

    }
}