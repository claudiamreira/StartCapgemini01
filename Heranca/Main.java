package Heranca;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		
		Vendedor v = new Vendedor();
		v.setNome("Claudia");
		v.setCpf("123456789");
		v.setSalario(10000.0f);
		v.setDataNasc(new Date());
		v.setComissaoPorItem(100.0f);
		v.setTotalItensVendidos(12);
		
		System.out.println("O salário do(a) funcionário(a) " + v.getNome() + " é: " 
		+ v.calcularSalario());
		
		
		
		
	}
}
