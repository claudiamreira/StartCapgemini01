package startLogica;

import java.util.Scanner;

public class Exemplo8 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b, aux;
		
		System.out.println("Informe um número inteiro para A: ");
		a = sc.nextInt();
		
		System.out.println("Informe um número inteiro para B: ");
		b = sc.nextInt();
		
		aux = a;
		a = b;
		b = aux;
		
		System.out.println("A: " + a);
		System.out.println("B: " + aux);
		
	}
}
