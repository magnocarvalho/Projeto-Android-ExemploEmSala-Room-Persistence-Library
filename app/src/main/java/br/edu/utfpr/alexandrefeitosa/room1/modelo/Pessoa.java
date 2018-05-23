package br.edu.utfpr.alexandrefeitosa.room1.modelo;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity
public class Pessoa {

    @PrimaryKey(autoGenerate = true)
    private int id;

    @NonNull
    private String nome;

    private int idade;

    public Pessoa(String nome){
        setNome(nome);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString(){
        return getNome();
    }
}