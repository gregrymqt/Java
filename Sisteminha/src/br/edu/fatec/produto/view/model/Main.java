package br.edu.fatec.produto.view.model;

import java.util.Scanner;

class Produto {
    private String nome;
    private double preco;
    private double quantidadeEstoque;
 
  
    public Produto(String nome, double preco, double quantidadeEstoque) {
        this.setNome(nome); 
        this.setPreco(preco); 
        this.setQuantidadeEstoque(quantidadeEstoque); 
    }
 
  
    public void setNome(String nome) {
        this.nome = nome;
    }
 
    public String getNome() {
        return this.nome;
    }
 
    public void setPreco(double preco) {
        if (preco < 0) {
            System.out.println("Valor negativo para preço. Definindo preço como 0.");
            System.out.println("");
            
            this.preco =0; 
        } else {
            this.preco = preco;
        }
    }
 
    public double getPreco() {
        return this.preco;
    }
 
    public void setQuantidadeEstoque(double quantidadeEstoque) {
        if (quantidadeEstoque < 0) {
            System.out.println("Quantidade de estoque negativa. Definindo quantidade como 0.");
            System.out.println("");
            this.quantidadeEstoque = 0; 
        } else {
            this.quantidadeEstoque = quantidadeEstoque;
        }
    }
 
    public double getQuantidadeEstoque() {
        return this.quantidadeEstoque; 
    }
}
 
public class Main {
     public static double p_final(Scanner scan, String mensagem) {
        System.out.print(mensagem);
        return scan.nextDouble();
    }
 
      public static String ler_P(Scanner scan, String mensagem) {
        System.out.print(mensagem);
        return scan.nextLine();
    }
 
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
 
        String nome = ler_P(scan, "Digite o nome do produto: ");
        System.out.println();
        double preco = p_final(scan, "Digite o valor do produto: ");
        System.out.println();
        double quantidadeEstoque = p_final(scan, "Digite a quantidade em estoque: ");
 
        System.out.println();
        System.out.println();
        Produto produto = new Produto(nome, preco, quantidadeEstoque);
 
       
        System.out.println("Nome do produto: " + produto.getNome());
        System.out.println();
        System.out.println("Preço: " + produto.getPreco());
        System.out.println();
        System.out.println("Quantidade em estoque: " + produto.getQuantidadeEstoque());
    }
}