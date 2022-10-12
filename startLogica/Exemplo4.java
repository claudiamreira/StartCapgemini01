package startLogica;

import java.util.Scanner;

public class Exemplo4 {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int totalAlunos = 10;
		int idadeAluno;
		String nomeAluno;
		
		while (totalAlunos > 0 ) {
			
			System.out.println("Informe o nome do aluno: ");
			nomeAluno = sc.next();
			System.out.println("Informe a idade do aluno: ");
			idadeAluno = sc.nextInt();
			
			System.out.println("O nome do aluno(a) é: " + nomeAluno + " e sua idade é: " +
			idadeAluno);
			
			totalAlunos--;
		}
	}

}
