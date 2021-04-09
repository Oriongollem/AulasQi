package com.jackson.pokemongolem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class Golem extends AppCompatActivity {
        private VideoView trailer;
        private Button btnVoltar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_golem);

        trailer = findViewById(R.id.trailerGolem);
        btnVoltar = findViewById(R.id.btnVoltar);

        Uri = Uri.parse("android.resource://"+ getPackageName() + "/" + R.raw.golem);
        trailer.setVideoURI(caminho);
        trailer.start();

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirVoltar();
            }
        });
    }

    public void abrirVoltar() {
        Intent janela = new Intent(MainActivity.this,Escolha.class);
        janela.putExtra("dados",dados.getText().toString());
        startActivity(janela);
        mp.stop();
    }
}