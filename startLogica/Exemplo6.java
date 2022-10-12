package startLogica;

import java.util.Scanner;

public class Exemplo6 {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Informe um número: ");
		numero = sc.nextInt();
		
		if(numero > 80) {
			System.out.println("O número informado é maior que 80");
		} else if (numero < 25) {
			System.out.println("O número informado é menor que 25");
		} else if (numero == 40) {
			System.out.println("O número informado é igual a 40");
		} else {
			System.out.println("O número informado não é valido!");
		}
	}

}
