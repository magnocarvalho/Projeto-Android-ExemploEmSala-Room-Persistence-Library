package br.edu.utfpr.alexandrefeitosa.room1.persistencia;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import br.edu.utfpr.alexandrefeitosa.room1.modelo.Pessoa;

@Database(entities = {Pessoa.class}, version = 1)
public abstract class PessoasDatabase extends RoomDatabase {

    private static PessoasDatabase instance;

    public abstract PessoaDao pessoaDao();

    public static PessoasDatabase getDatabase(final Context context) {

        if (instance == null) {

            synchronized (PessoasDatabase.class) {
                if (instance == null) {
                    instance = Room.databaseBuilder(context,
                                                    PessoasDatabase.class,
                                                    "pessoas.db").allowMainThreadQueries().build();
                }
            }
        }
        return instance;
    }
}
