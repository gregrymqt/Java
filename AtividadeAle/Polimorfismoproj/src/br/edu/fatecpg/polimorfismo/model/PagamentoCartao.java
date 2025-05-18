package br.edu.fatecpg.polimorfismo.model;

public class PagamentoCartao extends Pagamento {
	

	String nome ;
	String nCartao;
	int vezes;
	
	public PagamentoCartao(double valor) {
		super(valor);
	}
	public PagamentoCartao(double valor,String nome , String nCartao, int vezes) {
		super(valor);
		this.nome= nome;
		this.nCartao=nCartao;
		this.vezes= vezes;
	}

	public void processar() 
	{
		return "Pagamento realizado";
	}

	
}
