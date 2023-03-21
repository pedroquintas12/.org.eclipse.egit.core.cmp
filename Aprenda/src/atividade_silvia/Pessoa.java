package atividade_silvia;

import java.util.Scanner;

public class Pessoa {

	public static void main(String[] args) {
		
		int	escolha;
		String nome;
		String Sobrenome;
		
		Aluno aluno = new Aluno(); 
		Professor professor = new Professor();
		Scanner entrada = new Scanner(System.in); 
		
		
		System.out.println("Qual seu nome?");
		nome = entrada.next();
		
		System.out.println("Qual seu sobrenome?");
		Sobrenome= entrada.next();
		
		
		System.out.println("Se você for aluno digite [1]" + "\n" + 
				"Se você for Professor digite [2]");
		 escolha = entrada.nextInt();
		
		
		if(escolha ==1) {
			System.out.println("nome do aluno: " + nome +" "+ Sobrenome +"\n" 
					+"Matricula do aluno: "+ aluno.matricula + "\n" +
					"Turno do aluno: " + aluno.Turno + "\n" +
					"Turma do aluno: " + aluno.turma +"\n"
					+"Cpf do aluno: " + aluno.cpf);
			
			
		}else if(escolha==2) {
			
			System.out.println("Nome do professor: " + nome + " " + Sobrenome + "\n"
					+ "Matricula do professor: " + professor.Matricula + "\n"
					+ "Turno do Professor: " + professor.Turno +"\n"
					+ "Cpf do professor: " + professor.cpf);
		}
		else {
		System.out.println("tente novamente");
		}
		
		
	}

	
	
	
	
	
	
}
