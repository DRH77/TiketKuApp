package com.example.android.tiketku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SignInAct extends AppCompatActivity {

    TextView btn_create_new_account;
    Button btn_signin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        btn_create_new_account = findViewById(R.id.btn_create_new_account);

        btn_create_new_account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoregisterone = new Intent(SignInAct.this,RegisterOneAct.class);
                startActivity(gotoregisterone);
            }
        });

        btn_signin =  findViewById(R.id.btn_signin);

        btn_signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotohome = new Intent(SignInAct.this, HomeAct.class);
                startActivity(gotohome);
            }
        });
    }
}
