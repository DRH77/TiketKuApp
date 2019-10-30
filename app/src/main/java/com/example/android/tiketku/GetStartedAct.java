package com.example.android.tiketku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class GetStartedAct extends AppCompatActivity {

    Button btn_sign_in,btn_newaccount;
    Animation ttb, btt;
    TextView intro_app;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_started);

        // load animation
        ttb = AnimationUtils.loadAnimation(this, R.anim.ttb);
        btt = AnimationUtils.loadAnimation(this, R.anim.btt);

        // load element
        btn_sign_in = findViewById(R.id.btn_signin);
        btn_newaccount = findViewById(R.id.btn_newaccount);
        intro_app = findViewById(R.id.intro_app);

        // run animation
        intro_app.startAnimation(ttb);
        btn_sign_in.startAnimation(btt);
        btn_newaccount.startAnimation(btt);

        btn_sign_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotosign = new Intent(GetStartedAct.this, SignInAct.class);
                startActivity(gotosign);
            }
        });

        btn_newaccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoregistertwo = new Intent(GetStartedAct.this, RegisterOneAct.class);
                startActivity(gotoregistertwo);
            }
        });

    }

}
