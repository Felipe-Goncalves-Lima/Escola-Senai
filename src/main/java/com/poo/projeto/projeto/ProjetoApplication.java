package com.poo.projeto.projeto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ProjetoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoApplication.class, args);
		Professor professor = new Professor("Portugues", "João", "12345678901");

		Disciplina portugues = new Disciplina("Portugues", professor);

		Aluno aluno1 = new Aluno("Felipe\n","8,0", "123456");

		Aluno aluno2 = new Aluno("Luis\n", "12345678903", "123457");

		portugues.adicionarAluno(aluno1);
		portugues.adicionarAluno(aluno2);

		Nota nota1 = new Nota(portugues, 8.0);
		Nota nota2 = new Nota(portugues, 7.0);

		aluno1.adicionarNota(nota1);
		aluno2.adicionarNota(nota2);

		System.out.println("Disciplina: "+ portugues.getNome());
		System.out.println("Professor: "+ portugues.getProfessor().getNome());

		List<Aluno> alunos = portugues.getAlunos();
		for (Aluno aluno : alunos) {
			System.out.println("Aluno: "+ aluno.getNome()+ "Matricula: "+ aluno.getMatricula());

			List<Nota> notas = aluno.getNota();
			for (Nota nota : notas) {
				System.out.println("Nota: "+ nota.getDisciplina().getNome() + ": " + nota.getValor());
				
			}
		}
	}

}
