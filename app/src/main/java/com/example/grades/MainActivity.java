package com.example.grades;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.EditText;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity{
        public static final String EXTRA_NOMBRE = "com.example.myfirstapp.NOMBRE";
        public static final String EXTRA_NOTA1 = "com.example.myfirstapp.NOTA1";
        public static final String EXTRA_NOTA2 = "com.example.myfirstapp.NOTA2";
        public static final String EXTRA_NOTA3 = "com.example.myfirstapp.NOTA3";
        public static final String EXTRA_NOTA4 = "com.example.myfirstapp.NOTA4";

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        }

        /** Called when the user taps the Send button */
        public void sendMessage(View view) {
            Intent intent = new Intent(this, DisplayMessageActivity.class);
            EditText editText = (EditText) findViewById(R.id.editTextTextPersonName);
            EditText nota1Text = (EditText) findViewById(R.id.nota1_edit_text);
            EditText nota2Text = (EditText) findViewById(R.id.nota2_edit_text);
            EditText nota3Text = (EditText) findViewById(R.id.nota3_edit_text);
            EditText nota4Text = (EditText) findViewById(R.id.nota4_edit_text);

            String message = editText.getText().toString();
            double nota1 = Double.parseDouble(nota1Text.getText().toString());
            double nota2 = Double.parseDouble(nota2Text.getText().toString());
            double nota3 = Double.parseDouble(nota3Text.getText().toString());
            double nota4 = Double.parseDouble(nota4Text.getText().toString());

            intent.putExtra(EXTRA_NOMBRE, message);
            intent.putExtra(EXTRA_NOTA1, nota1);
            intent.putExtra(EXTRA_NOTA2, nota2);
            intent.putExtra(EXTRA_NOTA3, nota3);
            intent.putExtra(EXTRA_NOTA4, nota4);

            startActivity(intent);
        }
}

