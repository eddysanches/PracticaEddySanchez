package com.example.practicaeddysanchez;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Anterior(View view) {
        Intent anterior = new Intent(this, Main2Activity.class);
        startActivity(anterior);
    }
    public void Guardar(View view) {
        Intent anterior = new Intent(this, Main3Activity.class);
        startActivity(anterior);
    }
    public void Buscar(View view) {
        Intent anterior = new Intent(this, Main4Activity.class);
        startActivity(anterior);
    }
    public void parametro(View view) {
        Intent anterior = new Intent(this, Main5Activity.class);
        startActivity(anterior);
    }

}