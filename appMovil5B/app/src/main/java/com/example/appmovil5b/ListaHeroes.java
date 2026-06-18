package com.example.appmovil5b;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class ListaHeroes extends AppCompatActivity {

    TextView lista;
    ArrayList<Heroe> listaHeroes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_lista_heroes);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        lista = findViewById(R.id.txtListaHeroes);

        //recuperar lista
        //listaHeroes =  new ArrayList<>();
        listaHeroes = (ArrayList<Heroe>)getIntent().getSerializableExtra("llaveListaHeroes");

        //recorrido
        if(!listaHeroes.isEmpty()){
            String mostrar="";
            for(int i=0; i<listaHeroes.size();i++){
                Heroe heroe = listaHeroes.get(i);
                mostrar += "HEROE"+(i+1)+"\n";
                mostrar += "Nombre: "+heroe.getNombre()+"\n";
                mostrar += "Tipo: "+heroe.getTipo()+"\n";
                mostrar += "Nivel: "+heroe.getNivelPoder()+"\n";
                mostrar += "--------------------"+"\n";
            }

            lista.setText(mostrar);

        }else{

            Toast.makeText(getApplicationContext(),"Lista heroes vacia",Toast.LENGTH_LONG).show();
        }

    }
}