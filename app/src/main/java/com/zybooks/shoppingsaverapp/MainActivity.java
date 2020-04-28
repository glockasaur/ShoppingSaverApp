package com.zybooks.shoppingsaverapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                openBasicCalc();
            }
        });

        button = findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openTippingCalc();
            }
        });

        button = findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCouponingCalc();
            }
        });

        button = findViewById(R.id.button4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDiscountCalc();
            }
        });

        button = findViewById(R.id.button5);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openTodoList();
            }
        });
    }


    private void openBasicCalc() {
        Intent intent1 = new Intent(this, BasicCalc.class);
        startActivity(intent1);
    }

    private void openTippingCalc() {
        Intent intent2 = new Intent(this, TippingCalc.class);
        startActivity(intent2);
    }

    private void openCouponingCalc() {
        Intent intent3 = new Intent(this, CouponingCalc.class);
        startActivity(intent3);
    }

    private void openDiscountCalc() {
        Intent intent4 = new Intent(this, DiscountCalc.class);
        startActivity(intent4);
    }

    private void openTodoList() {
        Intent intent5 = new Intent(this, TodoList.class);
        startActivity(intent5);
    }

}
