package com.example.alquimaraalves.trabalho_mobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
    }
    public void q1(View view){
        Intent intent = new Intent(this,q1.class);
        startActivity(intent);
    }
    public void q2(View view){
        Intent intent = new Intent(this,q2.class);
        startActivity(intent);
    }
    public void q3(View view){
        Intent intent = new Intent(this,q3.class);
        startActivity(intent);
    }
    public void q4(View view){
        Intent intent = new Intent(this,q4.class);
        startActivity(intent);
    }
    public void q5(View view){
        Intent intent = new Intent(this,q5.class);
        startActivity(intent);
    }
    public void q6(View view){
        Intent intent = new Intent(this,q6.class);
        startActivity(intent);
    }
    public void q7(View view){
        Intent intent = new Intent(this,q7.class);
        startActivity(intent);
    }
    public void q8(View view){
        Intent intent = new Intent(this,q8.class);
        startActivity(intent);
    }
    public void q10(View view){
        Intent intent = new Intent(this,q10.class);
        startActivity(intent);
    }

    public void q111(View view){
        Intent intent = new Intent(this,q111.class);
        startActivity(intent);
    }
    public void q12(View view){
        Intent intent = new Intent(this,q12.class);
        startActivity(intent);
    }
    public void q14(View view){
        Intent intent = new Intent(this,q14.class);
        startActivity(intent);
    }
    public void q15(View view){
        Intent intent = new Intent(this,q15.class);
        startActivity(intent);
    }


}
