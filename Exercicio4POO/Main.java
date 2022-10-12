package Exercicio4POO;

public class Main {
	
	public static void main(String[] args) {
		
		Invoice inv = new Invoice(1, 10, "MousePad", 50.0f);
		
		System.out.println("Produto: " + inv.getDescricao());
		System.out.println("Valor total = R$" + inv.getInvoiceAmount());
	}

}
