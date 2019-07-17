package com.example.jpedr.exerciciodefixacao1;

import java.io.Serializable;

public class Cadastro implements Serializable {
    private String nome;
    private String genero;
    private boolean gostaFilmes;
    private boolean gostaMusicas;
    private String falaUm;
    private String falaDois;
    public Cadastro(String nome, String genero, boolean gostaFilmes, boolean gostaMusicas) {
        this.nome = nome;
        this.genero = genero;
        this.gostaFilmes = gostaFilmes;
        this.gostaMusicas = gostaMusicas;
    }
    public String getNome(){
        return this.nome;
    }
    public String getGenero(){
        return this.genero;
    }
    public boolean getGostaFilmes(){
        return this.gostaFilmes;
    }
    public boolean getGostaMusicas(){
        return this.gostaMusicas;
    }
    @Override
    public String toString() {
        return this.nome;
    }
    public String toStringCompleto() {
        if(this.gostaMusicas){this.falaUm="Sim";}else{this.falaUm="Não";};
        if(this.gostaFilmes){this.falaDois="Sim";}else{this.falaDois="Não";};
        return "Nome: "+this.nome+" | Gênero: "+this.genero+" | Gosta de Músicas: "+this.falaUm+" | Gosta de Filmes: "+this.falaDois;
    }
}
