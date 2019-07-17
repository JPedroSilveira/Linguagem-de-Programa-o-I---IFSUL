package com.example.camila.exerciciofixacao;

import java.io.Serializable;

/**
 * Created by Camila on 02/05/2017.
 */

public class Cadastro implements Serializable {
    private String nome;
    private String genero;
    private boolean filme;
    private boolean musica;


    public Cadastro (String nome, String genero, boolean filme, boolean musica){
        this.nome = nome;
        this.genero = genero;
        this.filme = filme;
        this.musica = musica;
    }

    public String getNome(){
        return this.nome;
    }
    public String getGenero(){
        return this.genero;
    }
    public boolean isFilme(){
        return this.filme;
    }
    public boolean isMusica(){
        return this.musica;
    }



}
