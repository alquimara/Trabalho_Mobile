package com.example.alquimaraalves.trabalho_mobile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.RadioAccessSpecifier;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class q6 extends AppCompatActivity {
    RadioButton masculino;
    RadioButton feminino;
    Button ok;
    TextView texto;
    RadioGroup grupo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q6);
        masculino = findViewById(R.id.masculino);
        feminino = findViewById(R.id.feminino);
        ok = findViewById(R.id.ok);
        texto = findViewById(R.id.texto);
        grupo = findViewById(R.id.grupo);
       ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int radioId = grupo.getCheckedRadioButtonId();
                feminino = findViewById(radioId);
                texto.setText(feminino.getText());

            }
           public void onClick1(View view) {
               int radioId = grupo.getCheckedRadioButtonId();
               masculino = findViewById(radioId);
               texto.setText(masculino.getText());


           }
        });
        feminino.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(feminino.isChecked()){
                    Toast.makeText(getApplicationContext(), "A opção escolhida é Feminino ", Toast.LENGTH_SHORT).show();
                }
            }
        });
        masculino.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (masculino.isChecked()){
                    Toast.makeText(getApplicationContext(), "A opção escolhida é Masculino ", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
    }
