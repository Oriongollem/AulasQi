package com.example.mygame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView btnPlayJogoVelha, btnPlayQuebra, btnPlayChapolin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPlayJogoVelha.findViewById(R.id.btnPlayJogoVelha);
        btnPlayQuebra.findViewById(R.id.btnPlayQuebra);
        btnPlayChapolin.findViewById(R.id.btnPlayChapolin);

        btnPlayJogoVelha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirJogoVelha();
            }
        });

        btnPlayQuebra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirJogoQuebra();
            }
        });

        btnPlayChapolin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirJogoChapolin();
            }
        });
    }

    private void abrirJogoVelha(){
        Intent janelaJogoVelha = new Intent(this, JogoVelha.class);
        startActivity(janelaJogoVelha);
    }

    private void abrirJogoQuebra(){
        Intent janelaJogoQuebra = new Intent(this, QuebraCabeca.class);
        startActivity(janelaJogoQuebra);
    }

    private void abrirJogoChapolin(){
        Intent janelaJogoChapolin = new Intent(this, GameChapolin.class);
        startActivity(janelaJogoChapolin);
    }

    public void onClick(View view) {
    }
}