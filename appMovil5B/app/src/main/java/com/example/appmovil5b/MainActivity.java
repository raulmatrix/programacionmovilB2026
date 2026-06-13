package com.example.appmovil5b;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText nombre;
    Spinner tipo;
    EditText nivel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        nombre = findViewById(R.id.etNombre);
        tipo = findViewById(R.id.spTipo);
        nivel = findViewById(R.id.etNivelPoder);
    }

    public void enviar(View v){
        String nombreObt = nombre.getText().toString();
        String tipoObt = tipo.getSelectedItem().toString();
        int nivelObt = Integer.parseInt(nivel.getText().toString());

        //instanciar el objeto
        Heroe heroe = new Heroe(nombreObt,tipoObt,nivelObt);
        Intent it = new Intent(getApplicationContext(), HeroeRecibido.class);
        it.putExtra("heroeEnviado", heroe);
        startActivity(it);
    }
}