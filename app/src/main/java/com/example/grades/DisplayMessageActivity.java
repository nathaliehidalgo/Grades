package com.example.grades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_message);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String nombre = intent.getStringExtra(MainActivity.EXTRA_NOMBRE);
        double nota1 = intent.getDoubleExtra(MainActivity.EXTRA_NOTA1, 0);
        double nota2 = intent.getDoubleExtra(MainActivity.EXTRA_NOTA2, 0);
        double nota3 = intent.getDoubleExtra(MainActivity.EXTRA_NOTA3, 0);
        double nota4 = intent.getDoubleExtra(MainActivity.EXTRA_NOTA4, 0);

        double promedio = (nota1 + nota2 + nota3 + nota4)/4;

        // Capture the layout's TextView and set the string as its text
        TextView nombreTV = findViewById(R.id.nombre_textview);
        nombreTV.setText(String.format("Nombre: %s", nombre));

        TextView nota1TV = findViewById(R.id.nota1_textview);
        nota1TV.setText(String.format("Nota 1: %s", nota1));

        TextView nota2TV = findViewById(R.id.nota2_textview);
        nota2TV.setText(String.format("Nota 2: %s", nota2));

        TextView nota3TV = findViewById(R.id.nota3_textview);
        nota3TV.setText(String.format("Nota 3: %s", nota3));

        TextView nota4TV = findViewById(R.id.nota4_textview);
        nota4TV.setText(String.format("Nota 4: %s", nota4));

        String result = "Tu promedio fue: " + promedio;
        if(promedio <= 5){
            result += ". Reprobado.";
        } else if(promedio > 5 && promedio < 7){
            result += ". Regular.";
        } else if(promedio > 7 && promedio <= 10) {
            result += ". Excelente.";
        }

        TextView promedioTV = findViewById(R.id.promedio_textview);
        promedioTV.setText(result);

        if(promedio >= 8 && promedio <= 10) {
            TextView felicidades = findViewById(R.id.felicidades_textview);
            felicidades.setVisibility(View.VISIBLE);
        }
    }




}