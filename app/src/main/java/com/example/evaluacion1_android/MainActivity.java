package com.example.evaluacion1_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        setTheme(R.style.Theme_Evaluacion1_Android);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //metodo que nos permite entrar a la app
     public void Entrar(View view){
         Intent Entrar = new Intent(this,SegundoActvity.class);
         startActivity(Entrar);
     }


}