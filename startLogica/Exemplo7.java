package startLogica;

import java.util.Scanner;

public class Exemplo7 {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String produto;
		float custo, venda, totalCusto = 0, totalVenda = 0;
		int i = 0;
		
		for(; i < 3; i++) {
			System.out.println("Digite o nome do produto: ");
			produto = sc.next();
			
			System.out.println("Digite o preço de custo do produto: ");
			custo = sc.nextFloat();
			
			System.out.println("Digite o preço de venda do produto: ");
			venda = sc.nextFloat();
			
			totalCusto = totalCusto + custo;
			totalVenda = totalVenda + venda;
			
			if(custo == venda) {
				System.out.println("Não houve lucro nesta venda!");
			} else if(custo > venda) {
				System.out.println("Prejuízo!");
			} else {
				System.out.println("Lucro!!!");
			}
			
			System.out.println(produto + ", preço de custo = " + custo + ", preço "
					+ "de venda = " + venda);
		}
		
			System.out.println("A média do preço de custo é de: " + (totalCusto / i));
			System.out.println("A média do preço de venda é de: " + (totalVenda / i));
	}

}
