package startLogica;

import java.util.Scanner;

public class Exemplo1 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nome[] = new String[5];
		String pesquisa = null;
		int sucesso;
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Informe o nome para cadastrar: ");
			nome[i] = sc.next();
		}
		
		System.out.println("Informe um nome para pesquisar: ");
		pesquisa = sc.next();
		
		sucesso = 0;
		
		for(int i = 0; i < 5; i++) {
			if(nome[i] == pesquisa) {
			sucesso = 1;
			}
		}
		
		if(sucesso == 1) {
			System.out.println("Cliente encontrado!");
		} else {
			System.out.println("Cliente não encontrado!");
		}
	}
}

