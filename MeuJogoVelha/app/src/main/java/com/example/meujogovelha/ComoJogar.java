package com.example.meujogovelha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ComoJogar extends AppCompatActivity {

    Button btnJogarI, btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_como_jogar);

        btnJogarI.findViewById(R.id.btnJogarI);
        btnVoltar.findViewById(R.id.btnVoltar);

        btnJogarI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                comoJogar();
            }
        });

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                voltar();
            }
        });

    }

    private void comoJogar(){
        Intent janelajogo = new Intent(this, ComoJogar.class);
        startActivity(janelajogo);
    }

    private void voltar(){
        Intent janelavoltar = new Intent(this, MainActivity.class);
        startActivity(janelavoltar);
    }
}