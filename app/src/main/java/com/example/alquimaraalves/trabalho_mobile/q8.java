package com.example.alquimaraalves.trabalho_mobile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

public class q8 extends AppCompatActivity {
    Button click;
    TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q8);
        click = findViewById(R.id.click);
        texto = findViewById(R.id.texto);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popupMenu = new PopupMenu(q8.this,texto);
                popupMenu.getMenuInflater().inflate(R.menu.popup,popupMenu.getMenu());


                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {
                        String valor =  menuItem.toString();
                        texto.setText(valor);
                        Toast.makeText(q8.this," " + valor,Toast.LENGTH_SHORT).show();
                        return true;
                    }
                });
                popupMenu.show();


            }
        });
    }
}
