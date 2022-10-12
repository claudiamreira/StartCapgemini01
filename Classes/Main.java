package Classes;

import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Pessoa pessoa = new Pessoa();
		
		System.out.println("Digite o seu peso: ");
		pessoa.setPeso(sc.nextFloat());
		
		System.out.println("Digite a sua altura: ");
		pessoa.setAltura(sc.nextFloat());
		
		System.out.println("IMC = " + pessoa.calcularIMC());
	}
}
