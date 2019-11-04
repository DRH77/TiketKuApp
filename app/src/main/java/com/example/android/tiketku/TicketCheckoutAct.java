package com.example.android.tiketku;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class TicketCheckoutAct extends AppCompatActivity {

    Button btn_pay_now, btnMines, btnPlus;
    TextView textJumlahTiket, textTotalHarga, textMyBalance;
    Integer valueJumlahTiket = 1;
    Integer myBalance = 200;
    Integer valueTotalHarga = 0;
    Integer valueHargaTiket = 75;
    ImageView notice_money;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ticket_checkout);

        btnMines = findViewById(R.id.btnMines);
        btnPlus = findViewById(R.id.btnPlus);
        textJumlahTiket = findViewById(R.id.textJumlahTiket);
        textTotalHarga = findViewById(R.id.textTotalHarga);
        textMyBalance = findViewById(R.id.textMyBalance);
        btn_pay_now = findViewById(R.id.btn_pay_now);
        notice_money = findViewById(R.id.notice_money);

        // setting value baru untuk beberapa komponen
        textJumlahTiket.setText(valueJumlahTiket.toString());
        textMyBalance.setText("$US" + myBalance + "");
        valueTotalHarga = valueHargaTiket * valueJumlahTiket;
        textTotalHarga.setText("$US" + valueTotalHarga);

        // secara default, kita hide button mines
        btnMines.animate().alpha(0).setDuration(300).start();
        btnMines.setEnabled(false);
        notice_money.setVisibility(View.GONE);

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valueJumlahTiket+=1;
                textJumlahTiket.setText(valueJumlahTiket.toString());
                if(valueJumlahTiket > 1){
                    btnMines.animate().alpha(1).setDuration(300).start();
                    btnMines.setEnabled(true);
                }
                valueTotalHarga = valueHargaTiket * valueJumlahTiket;
                textTotalHarga.setText("$US" + valueTotalHarga);
                if (valueTotalHarga > myBalance){
                    btn_pay_now.animate().translationY(250)
                            .alpha(0).setDuration(350).start();
                    btn_pay_now.setEnabled(false);
                    textMyBalance.setTextColor(Color.parseColor("#D1206B"));
                    notice_money.setVisibility(View.VISIBLE);
                }
            }
        });

        btnMines.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valueJumlahTiket-=1;
                textJumlahTiket.setText(valueJumlahTiket.toString());
                if(valueJumlahTiket < 2){
                    btnMines.animate().alpha(0).setDuration(300).start();
                    btnMines.setEnabled(false);
                }
                valueTotalHarga = valueHargaTiket * valueJumlahTiket;
                textTotalHarga.setText("$US" + valueTotalHarga);
                if (valueTotalHarga < myBalance){
                    btn_pay_now.animate().translationY(0)
                            .alpha(1).setDuration(350).start();
                    btn_pay_now.setEnabled(true);
                    textMyBalance.setTextColor(Color.parseColor("#203DD1"));
                    notice_money.setVisibility(View.GONE);
                }
            }
        });

        btn_pay_now.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotosuccessticket = new Intent(TicketCheckoutAct.this,SuccessBuyTicketAct.class);
                startActivity(gotosuccessticket);
            }
        });
     }
}
