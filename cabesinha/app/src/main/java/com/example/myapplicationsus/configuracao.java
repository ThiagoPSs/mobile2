package com.example.myapplicationsus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class configuracao extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuracao);
    }



    public void jogo(View v)
    {
        Intent itit = new Intent(this,Joogo.Class);
        *startActivity();
    }
}