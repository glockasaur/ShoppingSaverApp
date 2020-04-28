package com.zybooks.shoppingsaverapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class TippingCalc extends AppCompatActivity {

    public void calcTip()
    {
        DecimalFormat precision = new DecimalFormat( "0.00" );
        String theTotal;

        EditText enterTotal = (EditText) findViewById(R.id.finalTotal);
        double total = Double.parseDouble(enterTotal.getText().toString());

        EditText enterTipPct = (EditText) findViewById(R.id.tipPercentage);
        TextView showmeTip = (TextView) findViewById(R.id.showTip);


        double tipPct = Double.parseDouble(enterTipPct.getText().toString());
        double tipAmt = total * (tipPct / 100);

        theTotal = precision.format(tipAmt);;

        showmeTip.setText("Your tip comes up to $"+theTotal);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tipping_calc);

        Button pushforTip = (Button) findViewById(R.id.tipButton);
        pushforTip.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        calcTip();
                    }
                }
        );
    }
}
