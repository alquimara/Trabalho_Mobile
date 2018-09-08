package com.example.alquimaraalves.trabalho_mobile;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class q5 extends AppCompatActivity {
    Spinner spinner;
    TextView texto;


    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q5);
        spinner = findViewById(R.id.opcao);
        texto = findViewById(R.id.texto);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(this,R.array.versao,android.R.layout.simple_spinner_item);
        spinner.setAdapter(adapter);
       AdapterView.OnItemSelectedListener escolha = new AdapterView.OnItemSelectedListener() {
           @Override
           public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
               String item = spinner.getSelectedItem().toString();
               Toast.makeText(getBaseContext(), "O item selecionado é: " + item, Toast.LENGTH_SHORT).show();
               String valor = texto.getText().toString();
               valor += " - " + item;
               texto.setText(valor);
           }

           @Override
           public void onNothingSelected(AdapterView<?> adapterView) {

           }
       };
       spinner.setOnItemSelectedListener(escolha);

    }
}
