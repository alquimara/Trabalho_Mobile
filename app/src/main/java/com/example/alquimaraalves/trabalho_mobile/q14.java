package com.example.alquimaraalves.trabalho_mobile;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class q14 extends AppCompatActivity {
    EditText email;
    EditText senha;
    Button add;
    int selected;
    ArrayList<String> lista;
    ArrayAdapter adapter;
    ListView Lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q14);
        email = findViewById(R.id.nome);
        senha = findViewById(R.id.sobrenome);
        selected = -1;
        lista = new ArrayList<String>();
        adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1, lista);
        Lista = (ListView)findViewById(R.id.Lista);
        Lista.setAdapter(adapter);
        Lista.setSelector(android.R.color.holo_orange_dark);
        Lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(q14.this,"" + lista.get(i).toString(), Toast.LENGTH_SHORT).show();
                selected =i;
            }
        });
    }
    public void adicionar(View view){
        String Nome = email.getText().toString();
        String Sobrenome = senha.getText().toString();
        email.setText("");
        senha.setText("");
        String resulto = "Email:"+ " " + Nome +" "+ "Senha:" + " "+  Sobrenome;
        lista.add(resulto);
        adapter.notifyDataSetChanged();
    }
}
