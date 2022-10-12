package startLogica;

import java.util.Scanner;

public class Exemplo9 {
	
	@SuppressWarnings({ "resource"})
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int anoFabricacao, totalCarros = 0, totalCarrosSemiNovos = 0;
		float valorVeiculo;
		float desconto, total;
		char continuar = 'S';
		
		while(continuar == 'S' || continuar == 's') {
			
			System.out.println("Digite o ano de fabricação do Veiculo: ");
			anoFabricacao = sc.nextInt();
			
			System.out.println("Digite o valor do Veiculo: ");
			valorVeiculo = sc.nextFloat();
			
			if(anoFabricacao <= 2000) { //12%
				desconto = valorVeiculo * 0.12f;
			} else { //7%
				desconto = valorVeiculo * 0.07f;
				totalCarrosSemiNovos++;
			}
			
			totalCarros++;
			
			total = valorVeiculo - desconto;
			
			System.out.println("O valor do desconto foi de R$" + desconto);
			System.out.println("O valor que deve ser pago é de R$" + total);
			
			System.out.println("Deseja continuar cadastrando? S- Sim / N- Não");
			continuar = sc.next().charAt(0);
		}
		
		System.out.println("Total de carros semi novos: " + totalCarrosSemiNovos);
		System.out.println("Total de carros: " + totalCarros);
	}

}

