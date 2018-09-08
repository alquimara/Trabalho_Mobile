package com.example.alquimaraalves.trabalho_mobile;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class q10 extends AppCompatActivity {
    Button press;
    TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q10);
        press = findViewById(R.id.press);
        texto = findViewById(R.id.texto);
        press.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(press.isClickable()){
                    texto.setText("O botão foi clicado");
                    texto.setTextColor(Color.RED);
                }
                else {
                    texto.setText("");
                }


            }
        });
        press.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                texto.setText("");
                texto.setText("O botão foi pressionado");
                texto.setTextColor(Color.BLUE);

                return false;
            }
        });
    }
}
