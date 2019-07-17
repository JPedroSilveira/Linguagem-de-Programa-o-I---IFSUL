package com.example.jpedr.exerciciodefixacao1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Button;
import android.widget.Toast;


import java.util.ArrayList;

public class TelaCadastro extends AppCompatActivity {
    private EditText TextNome;
    private RadioGroup rgGenero;
    private RadioButton rbSelecionado;
    private Button btCadastrar;
    private Button btAvancar;
    private CheckBox cbFilme;
    private CheckBox cbMusica;
    private ArrayList<Cadastro> cadastro = new ArrayList();
    private boolean cbFilmeSelecionado;
    private boolean cbMusicaSelecionado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cadastro);
        this.TextNome = (EditText) findViewById(R.id.text_nome);
        this.rgGenero = (RadioGroup) findViewById(R.id.rg_genero);
        this.cbFilme = (CheckBox) findViewById(R.id.cb_filme);
        this.cbMusica = (CheckBox) findViewById(R.id.cb_musica);
        this.btCadastrar = (Button) findViewById(R.id.bt_cadastrar);
        this.btAvancar = (Button) findViewById(R.id.bt_avancar);
        this.rgGenero.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rbSelecionado = (RadioButton) findViewById(checkedId);
            }
        });



        this.cbFilme.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                cbFilmeSelecionado = isChecked;
            }
        });
        this.cbMusica.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                cbMusicaSelecionado = isChecked;
            }
        });

        this.btCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nome = TextNome.getText().toString()+"";
              Cadastro cadastrar = new Cadastro(nome,rbSelecionado.getText().toString(),cbFilmeSelecionado,cbMusicaSelecionado);
                Toast.makeText(TelaCadastro.this, TextNome.getText().toString() +" cadastrado!" ,Toast.LENGTH_SHORT).show();
                cadastro.add(cadastrar);

            }
        });


        this.btAvancar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent itSegundaTela = new Intent(TelaCadastro.this, SegundaTela.class);

                Bundle parametros = new Bundle();
                parametros.putSerializable("Cadastro",cadastro);
                itSegundaTela.putExtras(parametros);
                startActivity(itSegundaTela);
            }
        });

    }

}
