package com.example.alquimaraalves.trabalho_mobile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class q2 extends AppCompatActivity {
    EditText nome;
    EditText email;
    EditText senha;
    Button botao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q2);
       nome = findViewById(R.id.nome);
       email = findViewById(R.id.email);
       senha = findViewById(R.id.senha);
       botao = findViewById(R.id.botao);
    }
    public void submit(View view){
        String valornome = nome.getText().toString();
        String valoremail = email.getText().toString();
        String valorsenha = senha.getText().toString();
        Toast.makeText(this,"Nome:" + " " + valornome + "\n" + "Email:" + " " + valoremail + "\n" + "Senha:" + " " + valorsenha
                ,Toast.LENGTH_LONG).show();



    }
    public  void cancelar(View view){
        nome.setText("");
        email.setText("");
        senha.setText("");
    }
}
