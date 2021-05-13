package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import modulo.Aluno;


public class TesteAluno {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scam = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		System.out.println("Digite o nome do Aluno");
		aluno.nome = scam.nextLine();
		System.out.println("Digite as 3 notas do trimentre");
		aluno.nota1 = scam.nextDouble();
		aluno.nota2 = scam.nextDouble();
		aluno.nota3 = scam.nextDouble();
		
		aluno.Media();
		
		scam.close();

	}

}
