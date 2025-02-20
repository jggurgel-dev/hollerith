package com.example.hollerith;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button cadastroFuncionarioButton = findViewById(R.id.cadastroFuncionarioButton);
        Button cadastrosRealizadosButton = findViewById(R.id.cadastrosRealizadosButton);
        Button calculoSalarioButton = findViewById(R.id.calculoSalarioButton);
        Button calculosRealizadosButton = findViewById(R.id.calculosRealizadosButton);

        cadastroFuncionarioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, CadastroFuncionarioActivity.class));
            }
        });

        cadastrosRealizadosButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, CadastrosRealizadosActivity.class));
            }
        });

        calculoSalarioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        calculosRealizadosButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}