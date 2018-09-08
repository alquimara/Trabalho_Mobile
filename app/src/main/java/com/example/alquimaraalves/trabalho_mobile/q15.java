package com.example.alquimaraalves.trabalho_mobile;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.ArrayList;

public class q15 extends AppCompatActivity {
    EditText nome;
    Button add;
    int selected;
    ArrayList<String> lista;
    ArrayAdapter adapter;
    ListView Lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q15);
        nome = findViewById(R.id.nome);

        selected = -1;
        lista = new ArrayList<String>();
        adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1, lista);
        Lista = (ListView)findViewById(R.id.Lista);
        Lista.setAdapter(adapter);
        Lista.setSelector(android.R.color.holo_orange_dark);
        Lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(q15.this,"" + lista.get(i).toString(), Toast.LENGTH_SHORT).show();
                selected =i;
            }
        });
    }
    public void adicionar(View view){
        String Nome = nome.getText().toString();
        nome.setText("");
        String resulto = "Nome:"+ " " + Nome;
        lista.add(resulto);
        adapter.notifyDataSetChanged();
    }
}
