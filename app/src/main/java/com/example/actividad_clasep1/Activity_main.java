package com.example.actividad_clasep1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Activity_main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_inicio);
    }


    public void redirrecionar(View view){

        Intent objMover = new Intent(this,Activity_terciary.class);
        startActivity(objMover);

    }


    public void moverActivity(View view){

        Intent objMover = new Intent(this,Activity_secondary.class);
        startActivity(objMover);

    }


}