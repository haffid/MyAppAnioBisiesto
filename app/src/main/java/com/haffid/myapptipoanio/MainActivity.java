package com.haffid.myapptipoanio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText campoA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        campoA = findViewById(R.id.txtA);
    }

    private void datos(){
        String year = campoA.getText().toString();
        if (!year.isEmpty()) {
            Intent intent = new Intent(this, MAAnio.class);
            intent.putExtra("an", year);
            startActivity(intent);
        }else{
            Toast.makeText(this, "El campo esta vacio", Toast.LENGTH_SHORT).show();
        }
    }

    public void pulsar(View view) {
        this.datos();
    }
}