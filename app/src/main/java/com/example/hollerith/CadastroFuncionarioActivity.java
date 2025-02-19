package com.example.hollerith;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class CadastroFuncionarioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_funcionario);

        // Referências aos componentes
        Button salvarButton = findViewById(R.id.salvarButton);
        LinearLayout comprovanteLayout = findViewById(R.id.comprovanteLayout);
        TextView comprovanteNome = findViewById(R.id.comprovanteNome);
        TextView comprovanteMatricula = findViewById(R.id.comprovanteMatricula);
        TextView comprovanteCargo = findViewById(R.id.comprovanteCargo);
        TextView comprovanteSetor = findViewById(R.id.comprovanteSetor);
        TextView comprovanteCargaHoraria = findViewById(R.id.comprovanteCargaHoraria);
        TextView comprovanteSalarioBase = findViewById(R.id.comprovanteSalarioBase);

        salvarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Recuperar os valores dos campos
                String nome = ((TextView) findViewById(R.id.nomeEditText)).getText().toString();
                String matricula = ((TextView) findViewById(R.id.matriculaEditText)).getText().toString();
                String cargo = ((TextView) findViewById(R.id.cargoEditText)).getText().toString();
                String setor = ((TextView) findViewById(R.id.setorEditText)).getText().toString();
                String cargaHoraria = ((TextView) findViewById(R.id.cargaHorariaEditText)).getText().toString();
                String salarioBase = ((TextView) findViewById(R.id.salarioBaseEditText)).getText().toString();

                // Preencher os dados no comprovante
                comprovanteNome.setText("Nome: " + nome);
                comprovanteMatricula.setText("Matrícula: " + matricula);
                comprovanteCargo.setText("Cargo: " + cargo);
                comprovanteSetor.setText("Setor: " + setor);
                comprovanteCargaHoraria.setText("Carga Horária: " + cargaHoraria);
                comprovanteSalarioBase.setText("Salário Base: R$ " + salarioBase);

                // Tornar a seção de comprovante visível
                comprovanteLayout.setVisibility(View.VISIBLE);
            }
        });
    }
}


/*package com.example.hollerith;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.example.hollerith.database.AppDatabase;
import com.example.hollerith.dao.FuncionarioDao;
import com.example.hollerith.model.Funcionario;

public class CadastroFuncionarioActivity extends AppCompatActivity {

    private AppDatabase db;
    private FuncionarioDao funcionarioDao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_funcionario);

        db = AppDatabase.getInstance(this);
        funcionarioDao = db.funcionarioDao();

        findViewById(R.id.salvarButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                salvarFuncionario();
            }
        });
    }

    private void salvarFuncionario() {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome(findViewById(R.id.nomeEditText).toString());
        funcionario.setMatricula(findViewById(R.id.matriculaEditText).toString());
        funcionario.setCargo(findViewById(R.id.cargoEditText).toString());
        funcionario.setSetor(findViewById(R.id.setorEditText).toString());
        funcionario.setCargaHoraria(Integer.parseInt(findViewById(R.id.cargaHorariaEditText).toString()));
        funcionario.setSalarioBase(Double.parseDouble(findViewById(R.id.salarioBaseEditText).toString()));

        new Thread(() -> funcionarioDao.insert(funcionario)).start();
    }
}*/