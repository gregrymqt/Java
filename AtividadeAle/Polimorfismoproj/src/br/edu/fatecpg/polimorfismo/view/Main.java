package br.edu.fatecpg.polimorfismo.view;
import br.edu.fatecpg.polimorfismo.model.*;
public class Main {

	public static void main(String[] args) {
		PagamentoBoleto boleto = new PagamentoBoleto(500);
		String processo = boleto.processar();
		System.out.println(processo);
		
		PagamentoCartao cr= new PagamentoCartao(200,"Ale","3303",2);
		
		String r = cr.processar();
		System.out.println(r);
		
		r = cr.processar();	
		System.out.println(r);
		
		
		
				
		
		}

}
