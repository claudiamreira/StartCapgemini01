package startLogica;

import java.util.Scanner;

public class Exemplo3 {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int numero = 0; 
		
		System.out.println("Informe um número entre 100 e 200");
		numero = sc.nextInt();
		
		if(numero >= 100 && numero <= 200) {
			System.out.println("O número está no invervalo!");
		} else {
			System.out.println("O número não está no intervalo!");
		}
	}

}
