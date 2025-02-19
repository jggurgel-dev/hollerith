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

        // Referências aos botões
        Button cadastroFuncionarioButton = findViewById(R.id.cadastroFuncionarioButton);
        Button calculoSalarioButton = findViewById(R.id.calculoSalarioButton);
        Button calculosRealizadosButton = findViewById(R.id.calculosRealizadosButton);

        // Ações dos botões
        cadastroFuncionarioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, CadastroFuncionarioActivity.class));
            }
        });

        calculoSalarioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Implementar ação para cálculo de salário
            }
        });

        calculosRealizadosButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Implementar ação para exibir cálculos realizados
            }
        });
    }
}