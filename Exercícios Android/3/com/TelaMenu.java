package com.example.alunoinfo.exemplo_bd_interno;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaMenu extends AppCompatActivity {
    private Button editar, cadastrar, listar, excluir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_menu);

        this.cadastrar = (Button) findViewById(R.id.cadastrar);
        this.editar = (Button) findViewById(R.id.editar);
        this.excluir = (Button) findViewById(R.id.excluir);
        this.listar = (Button) findViewById(R.id.listar);

        this.cadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent itTelaCadastro = new Intent(TelaMenu.this, TelaCadastro.class);
                startActivity(itTelaCadastro);
            }
        });
        this.listar.setOnClickListener(new View.OnClickListener(){
          @Override
          Intent itTelaListar = new Intent(TelaListar.this, TelaListar.class);
          startActivity(itTelaListar);
        });

    }
}
