package com.example.alquimaraalves.trabalho_mobile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class q1 extends AppCompatActivity {
    EditText edit;
    TextView editLog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q1);
        edit = findViewById(R.id.edit);
        editLog = findViewById(R.id.editLog);
        ToggleButton toggle = findViewById(R.id.toggleButton);
        toggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    editLog.setVisibility(View.VISIBLE);
                }
                else{
                    editLog.setVisibility(View.INVISIBLE);

                }

            }
        });

    }
    public void clique(View view){
        String valoreditText = edit.getText().toString();
        Toast msg = Toast.makeText(getBaseContext(), valoreditText,Toast.LENGTH_LONG);
        msg.show();
        edit.setText("");
        String valorlog = editLog.getText().toString();
        valorlog += "-" + valoreditText;
        editLog.setText(valorlog);
        Log.d( "MainActivity", valoreditText);

    }
}
