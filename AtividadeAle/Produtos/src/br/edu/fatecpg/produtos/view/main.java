package br.edu.fatecpg.produtos.view;
import br.edu.fatecpg.produtos.model.*;

public class main {

	 public static void main(String[] args) {
		 
	        Produtos produto1 = new Produtos("Caderno");
	        Produtos produto2 = new Produtos("Caneta", 2.50);
	        Produtos produto3 = new Produtos("Borracha", 1.20, 15);

	        System.out.println("Informações dos Produtos:");
	        System.out.println("-----------------------------");
	        produto1.imprimirInformacoes();
	        produto2.imprimirInformacoes();
	        produto3.imprimirInformacoes();
	    }

}
