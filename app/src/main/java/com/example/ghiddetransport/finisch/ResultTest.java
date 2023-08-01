package com.example.ghiddetransport.finisch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.ghiddetransport.Alverstur;
import com.example.ghiddetransport.DionyTravel;
import com.example.ghiddetransport.GalTrans;
import com.example.ghiddetransport.MirTrans;
import com.example.ghiddetransport.R;

public class ResultTest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_test);

    }

    public void goNext(View v) {

        if(MainActivity.DionyTravel > MainActivity.Alverstur & MainActivity.DionyTravel > MainActivity.GalTrans & MainActivity.DionyTravel > MainActivity.MirTrans) {
            Intent intent = new Intent(ResultTest.this, DionyTravel.class);
            startActivity(intent);
        } else if(MainActivity.Alverstur > MainActivity.DionyTravel & MainActivity.Alverstur > MainActivity.GalTrans & MainActivity.Alverstur > MainActivity.MirTrans) {
            Intent intent = new Intent(ResultTest.this, Alverstur.class);
            startActivity(intent);
        } else if(MainActivity.MirTrans > MainActivity.DionyTravel & MainActivity.MirTrans > MainActivity.GalTrans & MainActivity.MirTrans > MainActivity.Alverstur) {
            Intent intent = new Intent(ResultTest.this, MirTrans.class);
            startActivity(intent);
        } else if(MainActivity.GalTrans > MainActivity.DionyTravel & MainActivity.GalTrans > MainActivity.Alverstur & MainActivity.GalTrans > MainActivity.MirTrans) {
            Intent intent = new Intent(ResultTest.this, GalTrans.class);
            startActivity(intent);
        }


    }
}