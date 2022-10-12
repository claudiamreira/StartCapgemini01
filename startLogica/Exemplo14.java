package startLogica;

import java.util.Scanner;

public class Exemplo14 {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int hora, materia;
		float total;
		
		System.out.println("Informe a matéria: 1- Geo(12,00) / 2- Port(17,00) / 3-"
				+ "Mat(25,00)");
		materia = sc.nextInt();
		
		System.out.println("Informe quantas horas foram ministradas no mês: ");
		hora = sc.nextInt();
		
		switch(materia) {
			case 1:
				total = 12 * hora;
				System.out.println("Professor nível 1 ganhará R$" + total + " mensal"
						+ " calculado por hr/aula");
				break;
			case 2:
				total = 17 * hora;
				System.out.println("Professor nível 2 ganhará R$" + total + " mensal"
						+ " calculado por hr/ala");
				break;
			case 3:
				total = 25 * hora;
				System.out.println("Professor nível 3 ganhará R$" + total + " mensal"
						+ "calculado por hr/aula");
				break;
			default:
				System.out.println("Opção inválida!");
		}
		
	}

}
