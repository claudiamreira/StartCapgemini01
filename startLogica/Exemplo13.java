package startLogica;

import java.util.Scanner;

public class Exemplo13 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Informe a sua idade: ");
		idade = sc.nextInt();
		
		if((idade < 5) || (idade > 25)) {
			System.out.println("Idade fora da faixa etária!");
		} else if ((idade >= 5) && (idade <= 7)) {
			System.out.println("Infantil A");
		} else if ((idade >= 8) && (idade <= 10)) {
			System.out.println("Infantil B");
		} else if((idade >= 11) && (idade <= 13)) {
			System.out.println("Juvenil A");
		} else if ((idade >= 14) && (idade <= 17)) {
			System.out.println("Juvenil B");
		} else {
			System.out.println("Sênior");
		}
	}
}
