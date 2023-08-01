package com.example.ghiddetransport.finisch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

import com.example.ghiddetransport.R;

public class SecondChange extends AppCompatActivity {

    private Button myButton2;
    private Button myButton3;
    private Button myButton4;
    private Button myButton5;

    private Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_change);

        myButton2 = findViewById(R.id.button2);
        myButton3 = findViewById(R.id.button3);
        myButton4 = findViewById(R.id.button4);
        myButton5 = findViewById(R.id.button5);

        handler = new Handler();
    }

    public void goNext(View v) {
        Button clickedButton = (Button) v;
        clickedButton.setBackgroundColor(Color.parseColor("#3F9701"));

        if(clickedButton == myButton2) {
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent = new Intent(SecondChange.this, ThirdChange.class);
                    startActivity(intent);
                    MainActivity.DionyTravel += 1;
                }
            }, 1000); // Задержка в миллисекундах (в данном случае 1 секунда)
        } else if(clickedButton == myButton3) {
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent = new Intent(SecondChange.this, ThirdChange.class);
                    startActivity(intent);
                    MainActivity.MirTrans += 1;
                }
            }, 1000); // Задержка в миллисекундах (в данном случае 1 секунда)
        } else if(clickedButton == myButton4) {
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent = new Intent(SecondChange.this, ThirdChange.class);
                    startActivity(intent);
                    MainActivity.Alverstur += 1;
                }
            }, 1000); // Задержка в миллисекундах (в данном случае 1 секунда)
        } else if(clickedButton == myButton5) {
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent = new Intent(SecondChange.this, ThirdChange.class);
                    startActivity(intent);
                    MainActivity.GalTrans += 1;
                }
            }, 1000); // Задержка в миллисекундах (в данном случае 1 секунда)
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        // Сброс цвета кнопки на исходное значение
        myButton2.setBackgroundColor(Color.TRANSPARENT);
        myButton3.setBackgroundColor(Color.TRANSPARENT);
        myButton4.setBackgroundColor(Color.TRANSPARENT);
        myButton5.setBackgroundColor(Color.TRANSPARENT);
    }
}