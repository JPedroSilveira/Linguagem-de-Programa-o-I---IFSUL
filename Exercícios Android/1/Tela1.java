package com.example.camila.exerciciofixacao;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Tela1 extends AppCompatActivity {

    private TextView nome;
    private EditText editText;

    private RadioGroup radioGroup;
    private RadioButton masculino;
    private RadioButton feminino;

    private TextView interesses;
    private CheckBox musica;
    private boolean musicaSelecionado;
    private CheckBox filme;
    private boolean filmeSelecionado;

    private Button cadastrar;
    private Button enviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela1);

        this.nome = (TextView) findViewById(R.id.nome);
        this.editText = (EditText) findViewById(R.id.editText);

        this.radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        this.masculino = (RadioButton) findViewById(R.id.masculino);
        this.feminino = (RadioButton) findViewById(R.id.feminino);

        this.interesses = (TextView) findViewById(R.id.interesses);
        this.musica = (CheckBox) findViewById(R.id.musica);
        this.filme = (CheckBox) findViewById(R.id.filme);

        this.cadastrar = (Button) findViewById(R.id.cadastrar);
        this.enviar = (Button) findViewById(R.id.enviar);


        this.radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {

            }
        });

        this.musica.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                musicaSelecionado = isChecked;
            }
        });
        this.filme.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                filmeSelecionado = isChecked;
            }
        });

        this.cadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nome = editText.getText().toString() + "";
                //Cadastro cadastrar = new Cadastro (nome, );
            }
        });
    }
}
