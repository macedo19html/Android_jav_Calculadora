package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText txtNor1;
    private EditText txtNor2;
    private TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNor1 = findViewById(R.id.txtNor1);
        txtNor2 = findViewById(R.id.txtNor2);
        tvResultado = findViewById(R.id.tvResultado);
    }

    public void somar(View view) {
        int valor1 = Integer.parseInt(txtNor1.getText().toString());
        int valor2 = Integer.parseInt(txtNor2.getText().toString());
        tvResultado.setText(String.valueOf(valor1 + valor2));
    }

    public void subtrair(View view) {
        int valor1 = Integer.parseInt(txtNor1.getText().toString());
        int valor2 = Integer.parseInt(txtNor2.getText().toString());
        tvResultado.setText(String.valueOf(valor1 - valor2));
    }

    public void multiplicar(View view) {
        int valor1 = Integer.parseInt(txtNor1.getText().toString());
        int valor2 = Integer.parseInt(txtNor2.getText().toString());
        tvResultado.setText(String.valueOf(valor1 * valor2));
    }

    public void dividir(View view) {
        int valor1 = Integer.parseInt(txtNor1.getText().toString());
        int valor2 = Integer.parseInt(txtNor2.getText().toString());
        tvResultado.setText(String.valueOf(valor1 / valor2));
    }
}