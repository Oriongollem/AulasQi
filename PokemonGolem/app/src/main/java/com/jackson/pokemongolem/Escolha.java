package com.jackson.pokemongolem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Escolha extends AppCompatActivity {
    private ListView lista_de_pokemons;
    private String[] pokemons = {"Golem"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escolha);

        lista_de_pokemons = findViewById(R.id.lista);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(),
                android.R.layout.simple_list_item_1, android.R.id.text1, pokemons);

        lista_de_pokemons.setAdapter(adapter);

        lista_de_pokemons.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        Intent myIntent = new Intent(view.getContext(),Golem.class);
                        startActivityForResult(myIntent,0);
                        break;
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;

                }
            }
        });
    }
}