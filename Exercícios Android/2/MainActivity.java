package com.example.alunoinfo.exemplo3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RadioGroup rGenero;
    private RadioButton rbSelecionado;
    private CheckBox cb1;
    private Button btProxima;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.rGenero = (RadioGroup) findViewById(R.id.rGenero);
        this.cb1 = (CheckBox) findViewById(R.id.cb1);
        this.btProxima = (Button) findViewById(R.id.btProximo);

        this.rGenero.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rbSelecionado = (RadioButton) findViewById(checkedId);

                Toast.makeText(MainActivity.this, "RB: " + rbSelecionado.getText(), Toast.LENGTH_LONG).show();

            }
        });
        this.cb1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(MainActivity.this, "CB: " + isChecked, Toast.LENGTH_LONG).show();

            }
        });
    }
}
