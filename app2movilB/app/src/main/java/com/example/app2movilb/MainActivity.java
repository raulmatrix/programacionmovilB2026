package com.example.app2movilb;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView numero;
    Button mas;
    Button menos;
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
    }

    public void incrementar(View v){
        //generar la relacion con la parte grafica
        numero = findViewById(R.id.txtNumero);
        //obtencion del valor y conversion a entero
        int valor = Integer.parseInt(numero.getText().toString());
        //incrementa
        valor++;

        numero.setText(""+valor);
        
        //Mensajes - Toast
        Toast.makeText(getApplicationContext(),"El numero es: "+valor,Toast.LENGTH_LONG).show();
        

    }

    public void decremento(View v){

    }

    public void enviarActivity2(View v){
        //paso entre activitys
        //Intent
        Intent it = new Intent(getApplicationContext(),ActivityDatos.class);
        startActivity(it);
    }
}