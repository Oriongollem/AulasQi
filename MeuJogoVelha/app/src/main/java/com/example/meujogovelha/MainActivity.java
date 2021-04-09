package com.example.meujogovelha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btncomo, btnjogar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btncomo = findViewById(R.id.btncomo);
        btnjogar = findViewById(R.id.btnjogar);

        btncomo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirComo();
            }
        });

        btnjogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirGame();
            }
        });
    }

        private void abrirComo() {
            Intent janela = new Intent(this, ComoJogar.class);
            startActivity(janela);
        }

        private void abrirGame() {
            Intent janelagame = new Intent(this, Jogo.class);
            startActivity(janelagame);
        }

}