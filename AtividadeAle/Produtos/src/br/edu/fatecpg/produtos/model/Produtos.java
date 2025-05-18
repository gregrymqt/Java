package br.edu.fatecpg.produtos.model;

public class Produtos {
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    public Produtos(String nome) {
        this.nome = nome;
        this.preco = 0.0;
        this.quantidadeEstoque = 0;
    }

    public Produtos(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = 0;
    }

    public Produtos(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void imprimirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$" + preco);
        System.out.println("Quantidade em estoque: " + quantidadeEstoque);
        System.out.println("-----------------------------");
    }
}