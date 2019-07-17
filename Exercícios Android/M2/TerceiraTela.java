package com.example.jpedr.exerciciodefixacao1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class TerceiraTela extends AppCompatActivity {
    private String dados;
    private TextView tvDados;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terceira_tela);
        this.tvDados = (TextView) findViewById(R.id.tv_dados);
        this.tvDados.setText(getIntent().getExtras().getString("Usuario"));
    }
}
