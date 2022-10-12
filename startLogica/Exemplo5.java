package startLogica;

import java.util.Scanner;

public class Exemplo5 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char desejaContinuar = 'S';
		
		while(desejaContinuar == 'S' || desejaContinuar == 's') {
			
			int numero;
			
			System.out.println("Informe um número");
			numero = sc.nextInt();
			
			if(numero == 0 ) {
				System.out.println("O número é Zero!");
			} else if (numero > 0) {
				System.out.println("O número é maior que Zero!");
			} else {
				System.out.println("O número é menor que Zero!");
			}
			
			
			System.out.println("Deseja continuar? S - Sim / N - Não");
			desejaContinuar = sc.next().charAt(0);
		}
		 
	}
}
