package com.example.hollerith.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.example.hollerith.model.Funcionario;

import java.util.List;

@Dao
public interface FuncionarioDao {
    @Insert
    void insert(Funcionario funcionario);

    @Query("SELECT * FROM funcionarios WHERE id = :id")
    Funcionario getFuncionarioById(int id);

    @Query("SELECT * FROM funcionarios")
    List<Funcionario> getAllFuncionarios();
}