package com.example.alunoinfo.exemplo1jp4k;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by alunoinfo on 14/03/17.
 */

public class SegundaTela extends Activity {
    private Button btVoltaPrimeiraTela;
    private Button btExibe;
    private TextView textView1;
    private TextView textView2;
    private TextView textView3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_segunda_tela);
        this.textView1 = (TextView) findViewById(R.id.text_view_1);
        this.textView2 = (TextView) findViewById(R.id.text_view_2);
        this.textView3 = (TextView) findViewById(R.id.text_view_3);
        this.btVoltaPrimeiraTela = (Button)findViewById(R.id.bt_volta_primeira_tela);
        this.btExibe = (Button)findViewById(R.id.bt_exibe);
        this.btVoltaPrimeiraTela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent itPrimeiraTela =  new Intent(SegundaTela.this, PrimeiraTela.class);
                startActivity(itPrimeiraTela);

            }


        });
        this.btExibe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nome = getIntent().getExtras().getString("Nome");
                String estado1 = getIntent().getExtras().getString("EstadoAC");
                String estado2 = getIntent().getExtras().getString("EstadoSP");
                textView1.setText(nome);
                textView2.setText(estado1);
                textView3.setText(estado2);
            }
        });

    Bundle parametros = getIntent().getExtras();
    }
}
