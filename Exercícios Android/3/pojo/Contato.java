package pojo;

import java.io.Serializable;

/**
 * Created by alunoinfo on 02/05/17.
 */

public class Contato implements Serializable{
    private int id;
    private String nome;
    private String email;
    private String telefone;

    public Contato(){}
    public Contato(int id, String nome, String email, String telefone){
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public void setId(int id){this.id= id;}
    public int getId(){ return  this.id;}

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }

    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return this.email;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    public  String getTelefone(){
        return this.telefone;
    }

    @Override
    public String toString(){
      return getNome() + " : " + getEmail() + " : " + getTelefone();
    }
}
