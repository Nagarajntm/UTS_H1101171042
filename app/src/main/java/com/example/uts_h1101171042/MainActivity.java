package com.example.uts_h1101171042;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void kom1(View view){
        Intent intent = new Intent(this,Komponen_satu.class);
        startActivity(intent);
    }
    public void kom2(View view){
        Intent intent = new Intent(this,Komponen_dua.class);
        startActivity(intent);
    }
    public void kom3(View view){
        Intent intent = new Intent(this,Komponen_tiga.class);
        startActivity(intent);
    }
    public void kom4(View view){
        Intent intent = new Intent(this,Komponen_empat.class);
        startActivity(intent);
    }
    public void kom5(View view){
        Intent intent = new Intent(this,Komponen_lima.class);
        startActivity(intent);
    }
}
