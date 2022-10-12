package startLogica;

import java.util.Scanner;

public class Exemplo2 {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int idade[] = new int[5];
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Informe a sua idade:");
			idade[i] = sc.nextInt();
		}
		
		for(int i = 0; i < 5; i++) {
			if(idade[i] < 18) {
				System.out.println("A idade informada é: " + idade[i] + " Classificação: menor de idade");
			} else {
				System.out.println("A idade informada é: " + idade[i] + " Classificação: maior de idade");
			}
		}
	}

}
