package br.edu.fatecpg.pagamento.view;
import br.edu.fatecpg.pagamento.model.*;

public class Main {

	public static void main(String[] args) {
		Pagamento pagamentoGenerico = new Pagamento();
        Pagamento pagamentoCartao = new PagamentoCartao();
        Pagamento pagamentoBoleto = new PagamentoBoleto();
        
        
        System.out.println("Processando diferentes tipos de pagamento:");
        System.out.println("----------------------------------------");
        
    
        pagamentoGenerico.processarPagamento();
        pagamentoCartao.processarPagamento();
        pagamentoBoleto.processarPagamento();
        
 

	}

}
