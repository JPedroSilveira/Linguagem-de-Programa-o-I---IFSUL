package com.example.alunoinfo.exemplo_bd_interno;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import dao.ContatoDAO;
import pojo.Contato;

/**
 * Created by alunoinfo on 02/05/17.
 */

public class TelaCadastro extends Activity {

    private EditText nome, email, telefone;
    private Button salvar;

    private Contato contato;
    private ContatoDAO contatoDAO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.layout_cadastar);

        inicializaComponentes();

        this.salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Pegar valores do editText e jogar no objeto contato
                contato.setNome(nome.getText().toString());
                contato.setEmail(email.getText().toString());
                contato.setTelefone(telefone.getText().toString());

                //Chamar o método salvar do objeto contatoDAO passando o objeto contato
                boolean isSalvo = contatoDAO.salvar(contato);

                if(isSalvo){
                  Toast.makeText(TelaCadastro.this, "Contato salvo com sucesso", Toast.LENGTH_SHORT).show();
                  limpaCampos();
                }else{
                  Toast.makeText(TelaCadastro.this, "Impossivel cadastrar contato", Toast.LENGTH_SHORT).show();
                  limpaCampos();
                }
            }
        });
    }

    private void limpaCampos(){
      this.nome.setText("");
      this.email.setText("");
      this.telefone.setText("");
    }

    private void inicializaComponentes(){
        this.nome = (EditText) findViewById(R.id.nome);
        this.email = (EditText) findViewById(R.id.email);
        this.telefone = (EditText) findViewById(R.id.telefone);
        this.salvar = (Button) findViewById(R.id.salvar);

        this.contato = new Contato();
        this.contatoDAO = new ContatoDAO(this);

    }
}
