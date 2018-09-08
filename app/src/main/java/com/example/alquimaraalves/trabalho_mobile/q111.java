package com.example.alquimaraalves.trabalho_mobile;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.LinearLayout;


public class q111 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q111);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
            MenuInflater inflater = getMenuInflater();
            inflater.inflate(R.menu.menu_main, menu);
            return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
       LinearLayout main = findViewById(R.id.fundo);
        switch (item.getItemId()){
            case R.id.vermelho:
                if(item.isCheckable()){
                    item.setChecked(false);
                }
                else
                    item.setChecked(true);
                main.setBackgroundResource(R.drawable.imag1);

                return true;

            case R.id.amarelo:
                if(item.isCheckable()){
                    item.setChecked(false);
                }
                else
                    item.setChecked(true);
                main.setBackgroundResource(R.drawable.imag2);
                return true;


            case R.id.azul:
                if(item.isCheckable()){
                    item.setChecked(false);
                }
                else
                    item.setChecked(true);
                main.setBackgroundResource(R.drawable.imag3);
                return true;

            default: return super.onOptionsItemSelected(item);

    }
}}
 


