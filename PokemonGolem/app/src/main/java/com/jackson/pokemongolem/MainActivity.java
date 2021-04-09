package com.jackson.pokemongolem;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.text.Editable;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText dados;
    private Button btnEnviar;
    private WebView imagem;
    private MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dados = findViewById(R.id.dados);
        btnEnviar = findViewById(R.id.btnEnviar);
        imagem = findViewById(R.id.imagem);
        mp = MediaPlayer.create(this, R.raw.somestadio);
        mp.start();;

        WebSettings gif = imagem.getSettings();
        gif.setJavaScriptEnabled(true);
        String caminho = "file:android_assets/gif.gif";
        imagem.loadUrl(caminho);
    }
}