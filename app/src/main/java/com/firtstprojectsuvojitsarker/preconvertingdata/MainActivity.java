package com.firtstprojectsuvojitsarker.preconvertingdata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button onlyButton;
    EditText etBuy , etSell;
    TextView tvdisplay ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        onlyButton = findViewById(R.id.onlyButton);
        etBuy = findViewById(R.id.etBuy);
        etSell = findViewById(R.id.etSell);
        tvdisplay = findViewById(R.id.tvdisplay);

        onlyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                float buyPrice , sellPrice , profit , profitInPercentage;

                buyPrice = Float.parseFloat(etBuy.getText().toString());
                sellPrice = Float.parseFloat(etSell.getText().toString());
                profit = sellPrice - buyPrice;
                profitInPercentage = profit/buyPrice*100;

                tvdisplay.setText("Profit is" +profit+"৳"+"\nProfit in Percentage is "+profitInPercentage+"%৳");



            }
        });


    }
}