package com.example.app6movilb;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView datosProductos;
    ArrayList <Producto> listaProductos;
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
        datosProductos = findViewById(R.id.lv_prueba);
        //String [] productos = {"Leche", "Queso", "Carne de pollo", "Gaseosa", "Galletas"};

        //carga de datos con objetos
        listaProductos = new ArrayList<Producto>();
        listaProductos.add(new Producto("Leche","Lacteos",9.5));
        listaProductos.add(new Producto("Queso Mozarella", "Lacteos", 20));
        listaProductos.add(new Producto("Carne pollo", "Carnes", 24));
        listaProductos.add(new Producto("Carne Pavo", "Carnes", 15));
        listaProductos.add(new Producto("Tomate", "Verduras", 2));


        //Adaptador

        ArrayAdapter adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1,listaProductos);

        //cargar el adapter al listview
        datosProductos.setAdapter(adapter);

    }




}