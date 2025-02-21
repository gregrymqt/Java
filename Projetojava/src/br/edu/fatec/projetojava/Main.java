package br.edu.fatec.projetojava;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	int[][] matriz = new int[2][2]; 
	Scanner scan = new Scanner(System.in);

        System.out.println("Preencha a matriz 2x2:");
        for (int i = 0; i < 2; i++) { 
            for (int j = 0; j < matriz[i].length; j++) { 
                matriz[i][j] = scan.nextInt(); 
                System.out.println("matriz[" + i + "][" + j + "] = " + matriz[i][j]);
            }
        }

       
        int[] array = new int[10]; 

        System.out.println("\nPreenchendo o array de tamanho 10:");
        for (int i = 0; i < 10; i++) { 
            array[i] = scan.nextInt();
            System.out.println("array[" + i + "] = " + array[i]);
        }
	}

}
