package com.example.alquimaraalves.trabalho_mobile;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.EnumMap;

public class q4 extends AppCompatActivity {
    AutoCompleteTextView nome;
    AutoCompleteTextView email;
    Button botao;
    ImageView imagem1;
    ImageView imagem2;
    public static String[] Nome = new String[]{"Alquimara","Brian","Carlos","Daniel", "Elvis", "Márcio"};
    public  static String[] Email = new  String[]{"exemplo@gmail.com","alquimara.a.braz@gmail.com","joa@gmial.com","maria@gmail.com"};

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q4);
          nome = findViewById(R.id.autoNome);
          email = findViewById(R.id.autoEmail);
          botao = findViewById(R.id.ok);
          imagem1 = findViewById(R.id.image1);
          imagem2=findViewById(R.id.image2);
          nome.setThreshold(1);
          email.setThreshold(1);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item, Nome);
        nome.setAdapter(adapter);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item, Email);
        email.setAdapter(adapter1);
        imagem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nome.showDropDown();
            }

        });
        imagem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                email.showDropDown();
            }
        });
    }
    public void ok(View view){
        String valorNome = nome.getText().toString();
        String valorEmail = email.getText().toString();
        nome.setText("");
        email.setText("");
        Toast.makeText(this,"Nome:" + " " + valorNome + "\n" + "Email:" + " " + valorEmail
                ,Toast.LENGTH_LONG).show();
    }



}
