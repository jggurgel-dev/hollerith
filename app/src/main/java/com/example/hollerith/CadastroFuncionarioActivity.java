package com.example.hollerith;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class CadastroFuncionarioActivity extends AppCompatActivity {

    private EditText nomeEditText, matriculaEditText, cargaHorariaEditText, salarioBaseEditText;
    private Button salvarButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_funcionario);

        // Referências aos componentes
        nomeEditText = findViewById(R.id.nomeEditText);
        matriculaEditText = findViewById(R.id.matriculaEditText);
        cargaHorariaEditText = findViewById(R.id.cargaHorariaEditText);
        salarioBaseEditText = findViewById(R.id.salarioBaseEditText);
        salvarButton = findViewById(R.id.salvarButton);

        // Configurar o botão Salvar
        salvarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                salvarCadastro();
            }
        });
    }

    private void salvarCadastro() {
        // Recuperar os valores dos campos
        String nome = nomeEditText.getText().toString().trim();
        String matricula = matriculaEditText.getText().toString().trim();
        String cargaHorariaStr = cargaHorariaEditText.getText().toString().trim();
        String salarioBaseStr = salarioBaseEditText.getText().toString().trim();

        // Validar campos obrigatórios
        if (nome.isEmpty()) {
            Toast.makeText(this, "O campo Nome é obrigatório.", Toast.LENGTH_SHORT).show();
            return;
        }
        if (matricula.isEmpty()) {
            Toast.makeText(this, "O campo Matrícula é obrigatório.", Toast.LENGTH_SHORT).show();
            return;
        }
        if (cargaHorariaStr.isEmpty()) {
            Toast.makeText(this, "O campo Carga Horária é obrigatório.", Toast.LENGTH_SHORT).show();
            return;
        }
        if (salarioBaseStr.isEmpty()) {
            Toast.makeText(this, "O campo Salário Base é obrigatório.", Toast.LENGTH_SHORT).show();
            return;
        }

        // Converter valores numéricos
        int cargaHoraria;
        double salarioBase;
        try {
            cargaHoraria = Integer.parseInt(cargaHorariaStr);
            salarioBase = Double.parseDouble(salarioBaseStr);
        } catch (NumberFormatException e) {
            Toast.makeText(this, "Valores inválidos para Carga Horária ou Salário Base.", Toast.LENGTH_SHORT).show();
            return;
        }

        // Verificar se a matrícula já existe no banco de dados
        boolean isDuplicated = verificarMatriculaDuplicada(matricula);
        if (isDuplicated) {
            Toast.makeText(this, "Já existe um cadastro com esta Matrícula.", Toast.LENGTH_SHORT).show();
            return;
        }

        // Salvar o cadastro (implemente sua lógica de salvamento aqui)
        Toast.makeText(this, "Cadastro salvo com sucesso!", Toast.LENGTH_SHORT).show();

        // Limpar os campos após salvar
        limparCampos();
    }

    private boolean verificarMatriculaDuplicada(String matricula) {
        // Aqui você deve consultar o banco de dados para verificar se a matrícula já existe
        // Exemplo usando Room Database:
        /*
        AppDatabase db = AppDatabase.getInstance(this);
        Funcionario funcionario = db.funcionarioDao().getFuncionarioByMatricula(matricula);
        return funcionario != null;
        */

        // Simulação de verificação (substitua pela consulta real ao banco de dados)
        return false; // Retorne true se a matrícula for encontrada, false caso contrário
    }

    private void limparCampos() {
        nomeEditText.setText("");
        matriculaEditText.setText("");
        cargaHorariaEditText.setText("");
        salarioBaseEditText.setText("");
    }
}