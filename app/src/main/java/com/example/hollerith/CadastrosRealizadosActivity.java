package com.example.hollerith;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hollerith.model.Funcionario;

import java.util.List;

public class CadastrosRealizadosActivity extends AppCompatActivity {

    private RecyclerView cadastrosRecyclerView;
    private CadastroAdapter cadastroAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastros_realizados);

        // Referências aos componentes
        cadastrosRecyclerView = findViewById(R.id.cadastrosRecyclerView);

        // Configurar o RecyclerView
        cadastrosRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        cadastroAdapter = new CadastroAdapter(carregarCadastros());
        cadastrosRecyclerView.setAdapter(cadastroAdapter);
    }

    private List<Funcionario> carregarCadastros() {
        // Aqui você deve recuperar os cadastros do banco de dados
        // Exemplo usando Room:
        /*
        AppDatabase db = AppDatabase.getInstance(this);
        return db.funcionarioDao().getAllFuncionarios();
        */

        // Retorne uma lista simulada para teste
        return null; // Substitua pela consulta real ao banco de dados
    }
}