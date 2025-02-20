package com.example.hollerith;

import com.example.hollerith.model.Funcionario;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class CadastroAdapter extends RecyclerView.Adapter<CadastroAdapter.CadastroViewHolder> {

    private List<Funcionario> funcionarios;

    public CadastroAdapter(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    @NonNull
    @Override
    public CadastroViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cadastro, parent, false);
        return new CadastroViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CadastroViewHolder holder, int position) {
        Funcionario funcionario = funcionarios.get(position);
        holder.informacoesCadastro.setText("Matrícula: " + funcionario.getMatricula() + " - Nome: " + funcionario.getNome());

        holder.editarButton.setOnClickListener(v -> {
            // Implemente a lógica para editar o cadastro
        });

        holder.excluirButton.setOnClickListener(v -> {
            // Implemente a lógica para excluir o cadastro
        });
    }

    @Override
    public int getItemCount() {
        return funcionarios.size();
    }

    static class CadastroViewHolder extends RecyclerView.ViewHolder {
        TextView informacoesCadastro;
        Button editarButton, excluirButton;

        public CadastroViewHolder(@NonNull View itemView) {
            super(itemView);
            informacoesCadastro = itemView.findViewById(R.id.informacoesCadastro);
            editarButton = itemView.findViewById(R.id.editarButton);
            excluirButton = itemView.findViewById(R.id.excluirButton);
        }
    }
}