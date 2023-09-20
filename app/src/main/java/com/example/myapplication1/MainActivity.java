package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText editTextNumber4;
    private EditText editTextNumber2;
    private EditText editTextNumber3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextNumber4 = findViewById(R.id.editTextNumber4);
        editTextNumber2 = findViewById(R.id.editTextNumber2);
        editTextNumber3 = findViewById(R.id.editTextNumber3);
    }
    public void somar (View view){
    int x, y, soma;
    x = Integer.parseInt(editTextNumber4.getText().toString());
    y = Integer.parseInt(editTextNumber2.getText().toString());
    soma = x + y;
    editTextNumber3.setText(Integer.toString(soma));
    }

}