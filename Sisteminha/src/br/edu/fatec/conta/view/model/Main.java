package br.edu.fatec.conta.view.model;
import java.util.Scanner;

 class Conta {
	
	private double saldo;
	private String titular;

	public Conta(double saldo,String titular) {
		this.saldo=saldo;
		this.titular=titular;
		}
	
	public void setSaldo(double saldo) {
		this.saldo=saldo;
	}
	public double getSaldo() {
		return this.saldo;
	}
	public void setTitular(String titular) {
		this.titular=titular;
	}
	public String getTitular() {
		return this.titular;
	}
	
	public void depositar(Scanner scan) {
		System.out.println("Digite um valor: ");
		double valor= scan.nextDouble();
	     
		if(valor>0) {
		this.saldo+=valor;
		}else {
			System.out.println("Digite um valor positivo, Por favor!!");
			
		}
	}
	
	public void sacar(Scanner scan) {
	    System.out.println("Digite um valor: ");
	    double valor = scan.nextDouble();

	    if (valor <= 0) {
	        System.out.println("Digite um valor positivo, por favor!!");
	    } else if (valor > this.saldo) {
	        System.out.println("Saldo insuficiente! Operação cancelada.");
	    } else {
	        this.saldo -= valor;
	        System.out.println("Saque realizado com sucesso!");
	    }
	}

 public static int menu(Scanner scan) { 
	 System.out.println("1-Sacar");
	 System.out.println("2-Depositar ");
	 return  scan.nextInt();
 }
 }
public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o nome do titular:");
        String titular = scan.nextLine();
        System.out.println("Informe o saldo inicial:");
        double saldo = scan.nextDouble();
        
		Conta pessoa = new Conta (saldo, titular);
		
		int op = Conta.menu(scan);
		
		
		switch(op) {
		case 1:
		 pessoa.sacar(scan);
		break;
		case 2:
			 pessoa.depositar(scan);
		break;
		default:
			System.out.println("Opção invalida");
			break;
		}
	System.out.println("Operacão finalizada "+ pessoa.getSaldo());
	}
	}