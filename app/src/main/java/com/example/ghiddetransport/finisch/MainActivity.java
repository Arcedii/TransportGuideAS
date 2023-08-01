package com.example.ghiddetransport.finisch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import com.example.ghiddetransport.R;

public class MainActivity extends AppCompatActivity {

    private LinearLayout languageLayout;
    private ImageButton SwitchLayoutLanguageButton;
    private boolean isLayoutVisible = false;

    public static int DionyTravel = 0;
    public static int Alverstur = 0;
    public static int GalTrans = 0;
    public static int MirTrans = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        languageLayout = findViewById(R.id.language_Layout);
        SwitchLayoutLanguageButton = findViewById(R.id.switch_language_but);

        SwitchLayoutLanguageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isLayoutVisible) {
                    hideLayout();
                } else {
                    showLayout();
                }
            }
        });
    }


        private void showLayout() {
            // Установите лайаут видимым и примените анимацию появления
            languageLayout.setVisibility(View.VISIBLE);
            languageLayout.animate().alpha(1.0f).setDuration(500).start();
            isLayoutVisible = true;
        }

    private void hideLayout() {
        // Установите лайаут невидимым и примените анимацию исчезновения
        languageLayout.animate().alpha(0.0f).setDuration(500).withEndAction(new Runnable() {
            @Override
            public void run() {
                languageLayout.setVisibility(View.GONE);
            }
        }).start();
        isLayoutVisible = false;
    }

   public void Start(View v) {
       Intent intent = new Intent(this, FirstChange.class);
       startActivity(intent);
   }
}