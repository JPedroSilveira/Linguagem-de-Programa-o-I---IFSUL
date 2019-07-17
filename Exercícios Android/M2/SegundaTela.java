package com.example.jpedr.exerciciodefixacao1;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;

public class SegundaTela extends ListActivity {
    private ArrayList<Cadastro> cadastro = new ArrayList();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.cadastro = (ArrayList<Cadastro>) getIntent().getSerializableExtra("Cadastro");
        ArrayAdapter<Cadastro> adapterCadastro = new ArrayAdapter<Cadastro>(this, android.R.layout.simple_list_item_1, this.cadastro);
        super.setListAdapter(adapterCadastro);
    }
    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Intent itTerceiraTela = new Intent(SegundaTela.this, TerceiraTela.class);
        Bundle parametros = new Bundle();
        parametros.putString("Usuario",this.cadastro.get(position).toStringCompleto());
        itTerceiraTela.putExtras(parametros);
        startActivity(itTerceiraTela);
    }

}
