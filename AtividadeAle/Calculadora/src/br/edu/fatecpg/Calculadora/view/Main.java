package br.edu.fatecpg.Calculadora.view;
import br.edu.fatecpg.Calculadora.model.Calculadora;

public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        
        
        System.out.println("Soma de 5 + 3 = " + calc.somar(5, 3));
        
        System.out.println("Soma de 2 + 4 + 6 = " + calc.somar(2, 4, 6));
        
        System.out.println("Soma de 3.5 + 2.7 = " + calc.somar(3.5, 2.7));
        
        System.out.println("Soma de 10 + 20 = " + calc.somar(10, 20));
        System.out.println("Soma de 1 + 2 + 3 = " + calc.somar(1, 2, 3));
        System.out.println("Soma de 1.25 + 3.75 = " + calc.somar(1.25, 3.75));
    }
}