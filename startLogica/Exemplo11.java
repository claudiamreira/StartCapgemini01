package startLogica;

import java.util.Scanner;

public class Exemplo11 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String nome;
		float salario, reajuste;
		float salMinimo = 0;
		
		System.out.println("Digite seu nome: ");
		nome = sc.next();
		
		System.out.println("Digite o seu salário: ");
		salario = sc.nextFloat();
		
		if(salMinimo < 3636) {
			reajuste = salario * 1.50f;
		} else if (salMinimo >= 3636 || salMinimo <= 12120) {
			reajuste = salario * 1.20f;
		} else if (salMinimo > 12120 || salMinimo <= 24240) {
			reajuste = salario * 1.15f;
		} else {
			reajuste = salario * 1.10f;
		}
		
		salMinimo = 1.212f;
		
		System.out.println("Reajuste com base no salário minímo de R$" + salMinimo);
		System.out.println("O funcionário(a): " + nome);
		System.out.println("recebe o salário de R$" + salario);
		System.out.println("e passará a receber o valor de R$" + reajuste);
	}
}
