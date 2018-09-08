package com.example.alquimaraalves.trabalho_mobile;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;


public class q7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q7);

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
                main.setBackgroundColor(Color.RED);
                return true;

            case R.id.amarelo:
                if(item.isCheckable()){
                    item.setChecked(false);
                }
                else
                    item.setChecked(true);
                main.setBackgroundColor(Color.YELLOW);
                return true;


            case R.id.azul:
                if(item.isCheckable()){
                    item.setChecked(false);
                }
                else
                    item.setChecked(true);
                main.setBackgroundColor(Color.BLUE);
                return true;

            default: return super.onOptionsItemSelected(item);

    }
}}
    /*public boolean select(MenuItem item){
        @SuppressLint("WrongViewCast") RelativeLayout main = (RelativeLayout) findViewById(R.id.fundo);
        switch (item.getItemId()){
            case R.id.vermelho:
            if(item.isCheckable()){
                item.setChecked(false);
            }
            else
                item.setChecked(true);
                main.setBackgroundColor(Color.RED);
                return true;

            case R.id.amarelo:
                if(item.isCheckable()){
                    item.setChecked(false);
                }
                else
                    item.setChecked(true);
                main.setBackgroundColor(Color.YELLOW);
                return true;


            case R.id.azul:
                if(item.isCheckable()){
                    item.setChecked(false);
                }
                else
                    item.setChecked(true);
                main.setBackgroundColor(Color.BLUE);
                return true;


            default: return super.onContextItemSelected(item);
        }




    }*/


