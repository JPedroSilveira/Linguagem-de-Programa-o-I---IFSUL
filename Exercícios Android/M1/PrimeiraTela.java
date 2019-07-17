package com.example.alunoinfo.exemplo1jp4k;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class PrimeiraTela extends Activity {
    private Button PrimeiroBotao;
    private Button btSegundaTela;
    private Button btTerceiraTela;
    private Button btQuartaTela;
    private Button btMata;
    private EditText etNome;
    private AutoCompleteTextView acEstados;
    private Button btEstados;
    private Spinner spEstados;
    private String[] vetorEstados = {"Rio Grande do Sul","Paraná","São Paulo","Rio de Janeiro", "Rio Grande do Norte", "Bahia", "Acre", "Amapá"};
    private Button btSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_primeira_tela);
        this.PrimeiroBotao = (Button) findViewById(R.id.primeiro_botao);
        this.etNome = (EditText) findViewById(R.id.et_nome);
        this.acEstados = (AutoCompleteTextView) findViewById(R.id.ac_estados);
        this.spEstados = (Spinner)findViewById(R.id.sp_estados);
        this.btEstados = (Button) findViewById(R.id.bt_estados);
        this.btSegundaTela = (Button) findViewById(R.id.bt_segunda_tela);
        this.btTerceiraTela = (Button) findViewById(R.id.bt_terceira_tela);
        this.btQuartaTela = (Button) findViewById(R.id.bt_quarta_tela);
        this.btMata = (Button) findViewById(R.id.bt_mata);
        this.btSpinner = (Button) findViewById(R.id.bt_Spinner);


        final ArrayAdapter<String> adapterEstadosAC = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,vetorEstados); //Desclarando e Instanciando
        final ArrayAdapter<String> adapterEstadosSP = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,vetorEstados); //Desclarando e Instanciando

        this.acEstados.setAdapter(adapterEstadosAC);
        this.spEstados.setAdapter(adapterEstadosSP);

        this.spEstados.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(PrimeiraTela.this, "Posição: " + position+ " Estado: " +vetorEstados[position], Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        this.PrimeiroBotao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Log.i("DEBUG","você clicou");//Log começa com letra maiuscula logo é classe, .i é um método por tem os "()" ou parametros e ele é estático pois não é necessario instanciar ele "new".
                Toast.makeText(PrimeiraTela.this, "Olá " + etNome.getText(), Toast.LENGTH_SHORT).show();
            }
        });

        this.btEstados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(PrimeiraTela.this, "Estado:" + acEstados.getText(), Toast.LENGTH_SHORT).show();
            }
        });

        this.btSpinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(PrimeiraTela.this, "Estado:" + spEstados.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
            }
        });

        this.btSegundaTela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent itSegundaTela = new Intent(PrimeiraTela.this, SegundaTela.class);

                Bundle parametros = new Bundle();
                parametros.putString("Nome", etNome.getText().toString());
                parametros.putString("EstadoAC", acEstados.getText().toString());
                parametros.putString("EstadoSP", spEstados.getSelectedItem().toString());
                itSegundaTela.putExtras(parametros);
                startActivity(itSegundaTela);
            }
        });
        this.btTerceiraTela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent itTerceiraTela = new Intent(PrimeiraTela.this, TerceiraTela.class);
                startActivity(itTerceiraTela);
            }
        });

        this.btQuartaTela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent itQuartaTela = new Intent(PrimeiraTela.this, QuartaTela.class);
                startActivity(itQuartaTela);
            }
        });

        this.btMata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }

    protected void onRestart() {
        super.onRestart();
        Toast.makeText(PrimeiraTela.this, "Reiniciou a primeira tela ", Toast.LENGTH_SHORT).show();
    }
    protected void onStart() {
        super.onStart();
        Toast.makeText(PrimeiraTela.this, "Iniciou a primeira tela ", Toast.LENGTH_SHORT).show();
    }
    protected void onResume() {
        super.onStart();
        Toast.makeText(PrimeiraTela.this, "Resumiu a primeira tela ", Toast.LENGTH_SHORT).show();
    }
    protected void onPause() {
        super.onPause();
        Toast.makeText(PrimeiraTela.this, "Pausou a primeira tela ", Toast.LENGTH_SHORT).show();
    }
    protected void onStop() {
        super.onStart();
        Toast.makeText(PrimeiraTela.this, "Primeira tela parada", Toast.LENGTH_SHORT).show();
    }
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(PrimeiraTela.this, "A primeira tela morreu ", Toast.LENGTH_SHORT).show();
    }

}