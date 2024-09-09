package com.poo.projeto.projeto;

import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa{
    private String matricula;
    private List<Nota> notas = new ArrayList<>();

    public Aluno(String nome, String cpf, String matricula){
        super(nome, cpf);
        this.matricula = matricula;
        this.notas = new ArrayList<>();
    }
    public Aluno(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getMatricula(){
        return matricula;
    }
    public void setMatricula(String matricula){
           this.matricula = matricula;
    }

    public List<Nota> getNota() {
        return notas;
    }
    public void setNota(int nota) {
        this.notas = notas;
    }


    public void imprimeFicha(){
        System.out.println(this.nome); 
        //System.out.println(this.telefone); 
        System.out.println(this.cpf); 
        //System.out.println(this.email); 
        //System.out.println(this.dataNascimento); 
        //this.endereco.imprimeEnd();
    }
    public void adicionarNota(Nota nota) {
        this.notas.add(nota);
    }
}
