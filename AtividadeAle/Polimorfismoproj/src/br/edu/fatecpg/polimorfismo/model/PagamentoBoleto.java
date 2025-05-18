package br.edu.fatecpg.polimorfismo.model;
import java.util.Random;
public class PagamentoBoleto extends Pagamento {
	
	private Random ram= new Random();

	public PagamentoBoleto(double valor) {
		super(valor);
	}


	@Override
	public String processar() {
		Long boleto = ram.nextLong(100000000000000000l, 999999999999999999l);		
		return "Pagamento em boleto:" +boleto + " no valor de:"
				+ this.getValor();
	}

}
