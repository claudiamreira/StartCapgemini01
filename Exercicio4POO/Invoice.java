package Exercicio4POO;

public class Invoice {
	
	private int codigoItem, quantidade;
	private String descricao;
	private float precoUnitario;
	
	public Invoice(int codigoItem, int quantidade, String descricao, float precoUnitario) {
		this.setCodigoItem(codigoItem);
		this.setDescricao(descricao);
		this.setQuantidade(quantidade);
		this.setPrecoUnitario(precoUnitario);
	}
	
	public double getInvoiceAmount() {
		return quantidade * precoUnitario;
	}

	public int getCodigoItem() {
		return codigoItem;
	}

	public void setCodigoItem(int codigoItem) {
		this.codigoItem = codigoItem;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		if(quantidade < 0) {
			this.quantidade = 0;
		} else {
			this.quantidade = quantidade;
		}
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public float getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(float precoUnitario) {
		if(precoUnitario < 0) {
			this.precoUnitario = 0;
		} else {
			this.precoUnitario = precoUnitario;
		}
		
	}
	

}
