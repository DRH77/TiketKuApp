package com.example.android.tiketku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class RegisterTwoAct extends AppCompatActivity {

    LinearLayout btn_back;
    Button btn_continue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_two);

        btn_back = findViewById(R.id.btn_back);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backtoregisterone = new Intent(RegisterTwoAct.this, RegisterOneAct.class);
                startActivity(backtoregisterone);
            }
        });

        btn_continue = findViewById(R.id.btn_continue);
        btn_continue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoregistersuccess = new Intent(RegisterTwoAct.this, SucessRegisterAct.class);
                startActivity(gotoregistersuccess);
            }
        });
    }
}
