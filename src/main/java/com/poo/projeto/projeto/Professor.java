package com.poo.projeto.projeto;

public class Professor extends Pessoa {
    private String materia;


public Professor(String materia, String nome , String cpf){
        this.materia = materia;
        this.nome = nome;
        this.cpf = cpf;
    }
            public String getMateria() {
                return materia;
            }
            public void setMateria(String materia) {
                this.materia = materia;
            }
            

}
