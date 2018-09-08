package com.example.alquimaraalves.trabalho_mobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class q12 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q12);
    }
    public void ver(View view){
        Intent intent = new Intent(this,q121.class);
        startActivity(intent);
    }

}
