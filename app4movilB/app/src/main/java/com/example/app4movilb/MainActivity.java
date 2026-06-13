package com.example.app4movilb;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText nombre;
    EditText estatura;
    EditText peso;
    EditText tipoPersona;
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
        estatura = findViewById(R.id.etEstatura);
        peso = findViewById(R.id.etPeso);
        tipoPersona = findViewById(R.id.etTipoPersona);
    }

    public void calcularIMC(View v){
        String nombreObt = nombre.getText().toString();
        double estaturaObt = Double.parseDouble(estatura.getText().toString());
        double pesoObt = Double.parseDouble(peso.getText().toString());
        String tipoPersObt = tipoPersona.getText().toString();
        String imc="";
        if(tipoPersObt=="menor"){
            imc = calcularIMCMenor(estaturaObt,pesoObt);
        }else{
            //imc = calcularIMCAdulto(estaturaObt,pesoObt);
        }

        //paso de datos
        Intent it = new Intent(getApplicationContext(), Resultado.class);
        it.putExtra("llaveNombre",nombreObt);
        it.putExtra("llaveEstatura",estaturaObt);
        it.putExtra("llavePeso",pesoObt);
        it.putExtra("llaveTipoPers",tipoPersObt);
        it.putExtra("resultado",imc);

        startActivity(it);
    }

    public String calcularIMCMenor(double estatura,double peso){
        double imcCalculado = peso/(estatura*estatura);
        String valorRetorno;
        if(imcCalculado<14.0){
            valorRetorno="Bajo Peso";
        }else if(imcCalculado>=14.0 && imcCalculado<=17.9){
            valorRetorno = "Normal";
        }else if(imcCalculado>=18.0 && imcCalculado<=19.9){
            valorRetorno = "Sobrepeso";
        }else if(imcCalculado>=20){
            valorRetorno = "Obesidad";
        }else{
            valorRetorno = "Error en datos";
        }
        return valorRetorno;
    }

    /*public double calcularIMCAdulto(double estatura,double peso){

    }*/
}