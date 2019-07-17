package com.example.alunoinfo.exemplo1jp4k;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class TerceiraTela extends AppCompatActivity {

    private RadioGroup rgGenero;
    private RadioButton rbSelecionado;
    private CheckBox cbOpcao1;
    private CheckBox cbOpcao2;
    private Button btVoltaPrimeiraTela;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_terceira_tela);
        this.rgGenero = (RadioGroup)findViewById(R.id.rg_genero);
        this.cbOpcao1 = (CheckBox)findViewById(R.id.cb_opcao1);
        this.cbOpcao2 = (CheckBox)findViewById(R.id.cb_opcao2);
        this.cbOpcao1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(TerceiraTela.this,"Boolean: " +isChecked, Toast.LENGTH_SHORT).show();

            }
        });
        this.cbOpcao2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(TerceiraTela.this,"Boolean: " +isChecked, Toast.LENGTH_SHORT).show();

            }
        });
        this.rgGenero.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rbSelecionado = (RadioButton) findViewById(checkedId);
               Toast.makeText(TerceiraTela.this,"ID: " +checkedId,Toast.LENGTH_SHORT).show();
            }
        });
        this.btVoltaPrimeiraTela = (Button)findViewById(R.id.bt_volta_primeira_tela);
        this.btVoltaPrimeiraTela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent itPrimeiraTela =  new Intent(TerceiraTela.this, PrimeiraTela.class);
                startActivity(itPrimeiraTela);

            }


        });
    }
}
