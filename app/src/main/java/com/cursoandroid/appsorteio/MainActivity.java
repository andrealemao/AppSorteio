package com.cursoandroid.appsorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void jogar(View view){
        TextView resultado = findViewById(R.id.resultado);
        int numero = new Random().nextInt(11);

        resultado.setText("Número: " + numero);
    }
}
