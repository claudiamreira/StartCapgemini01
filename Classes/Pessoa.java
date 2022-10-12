package Classes;

public class Pessoa {
	
	private float peso, altura, imc;

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getImc() {
		return imc;
	}

	public void setImc(float imc) {
		this.imc = imc;
	} 

	public float calcularIMC() {
		imc = peso / (altura * altura);
		return imc;
	}
}
