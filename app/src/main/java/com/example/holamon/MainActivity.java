package com.example.holamon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.*;
import android.view.*;

public class MainActivity extends AppCompatActivity {

    boolean estado_boton;
    Button boton;
    TextView texto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        estado_boton = false;
        boton = findViewById(R.id.button);
        texto = findViewById(R.id.textView);


    }
public void pulsar_boton (View Vista){

        if (estado_boton == false){
            texto.setText("Hola Món!");
            estado_boton = true;

        }else{
            texto.setText("Hello World!");
            estado_boton = false;
        }

}


}