package com.example.hollerith.database;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import com.example.hollerith.dao.FuncionarioDao;
import com.example.hollerith.model.Funcionario;

@Database(entities = {Funcionario.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    private static AppDatabase instance;

    public abstract FuncionarioDao funcionarioDao();

    public static synchronized AppDatabase getInstance(Context context) {
        if (instance == null) {
            instance = Room.databaseBuilder(context.getApplicationContext(),
                            AppDatabase.class, "hollerith_database")
                    .fallbackToDestructiveMigration()
                    .build();
        }
        return instance;
    }
}