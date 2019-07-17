package com.example.alunoinfo.exemplo1jp4k;

import android.app.ListActivity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

public class QuartaTela extends ListActivity {

    private String[] vetorTurmas = {"1K","1I","2K","2I","3K","3I","4K","4I"};
    //private Spinner spTurmas;//Cria o Spinner

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.layout_quarta_tela); - Para usar o ListActivity você desliga o layout setado pois o ListActivity já vem com um layout
        ArrayAdapter<String> adapterTurmas = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,vetorTurmas);
        //spTurmas.setAdapter(adapterTurmas); //Adiciona o Array ao Spinner
        super.setListAdapter(adapterTurmas);//Seta a lista do ListActivity

    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Toast.makeText(this,"Position: "+vetorTurmas[position],Toast.LENGTH_SHORT).show();
    }

}
