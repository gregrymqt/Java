package br.edu.fatecpg.polimorfismo.model;

public abstract class Pagamento {

	private double valor;
	
	public Pagamento(double valor) {
		this.valor=valor;
	}

	
	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public  void processar() {
		
		System.out.println("Processando pagamento genérico");
	}
}
