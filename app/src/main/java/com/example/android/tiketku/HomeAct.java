package com.example.android.tiketku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.github.florent37.shapeofview.shapes.CircleView;

public class HomeAct extends AppCompatActivity {

    LinearLayout btn_ticket_pisa;
    CircleView btn_to_profile;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btn_ticket_pisa = findViewById(R.id.btn_ticket_pisa);
        btn_to_profile = findViewById(R.id.btn_to_profile);


        btn_ticket_pisa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gototicketinfopisa = new Intent(HomeAct.this,TicketDetailAct.class);
                startActivity(gototicketinfopisa);
            }
        });


        btn_to_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoprofile = new Intent(HomeAct.this,MyProfileAct.class);
                startActivity(gotoprofile);
            }
        });
    }
}
