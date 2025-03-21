package br.edu.fatec.carro.view.model;

import java.util.Scanner;

class Carro {
    private double capacidadeTanque;
    private double vl_g;

    public Carro(double capacidadeTanque, double vl_g) {
        this.capacidadeTanque = capacidadeTanque;
        this.vl_g = vl_g;
    }

    public void setCapacidadeTanque(double capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public double getCapacidadeTanque() {
        return this.capacidadeTanque;
    }

    public void setVl_g(double vl_g) {
        this.vl_g = vl_g;
    }

    public double getVl_g() {
        return this.vl_g;
    }
}

public class Main
{
    
    public static double lt(Scanner scan, String mensagem) {
        System.out.print(mensagem);
        return scan.nextDouble();
    }
    
	public static void main(String[] args) {
	    
	    Scanner scan = new Scanner (System.in);
	    
	    double capacidadeTanque = lt(scan,"Digite o tamanho do tanque: ");
        double vl_g = lt(scan, "Digite o valor da gasolina por litro: " );

Carro tanque = new Carro(capacidadeTanque, vl_g);

double resultado = tanque.getCapacidadeTanque() * tanque.getVl_g();

System.out.println("O valor final é: " + resultado);
	  
	}
}