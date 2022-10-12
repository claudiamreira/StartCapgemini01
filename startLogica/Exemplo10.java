package startLogica;

import java.util.Scanner;

public class Exemplo10 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		float precoFabrica, impostos = 1.45f, percDistribuidor = 1.28f, custoFabrica, resultado;
		
		System.out.println("Informe o preço de fábrica do veículo:");
		precoFabrica = sc.nextFloat();
		
		
		custoFabrica = precoFabrica * impostos;
		resultado = custoFabrica * percDistribuidor;
		
		System.out.println("O preço de fábrica do veículo é de R$" + precoFabrica);
		System.out.println("O consumidor final pagará R$" + resultado);
	}
}
