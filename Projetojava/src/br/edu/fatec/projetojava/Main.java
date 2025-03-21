package br.edu.fatec.projetojava;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int op=0;
		int contador=0;
		Scanner scan2 = new Scanner (System.in);
		
		while(contador<1) {
			
			System.out.println("Escolha uma opcao entre 1 a 4");
			System.out.println("1-Somar a Matriz");
			System.out.println("2-Cadastro para Login2");
			System.out.println("3-Transposição de Matriz");
			System.out.println("4 - Sair");
			 
			op = scan2.nextInt();
			
			switch(op) {
			case 1:somamatriz();
			break;
			case 2: VerificarLogin();
				break;
			case 3: invertermatriz();
			break;
			case 4:
	            System.out.println("Saindo...");
	            return; 
	        default:
	            System.out.println("Opção inválida! Tente novamente.");
	            break;
			
			}
		}
		contador++;
	
        
        
	}
    public static void somamatriz() {
    	int[][] matriz = new int[3][3]; 
    	int[][] matriz2 = new int[3][3]; 
    	int soma =0;
    	int soma2 =0;


    	Scanner scan = new Scanner(System.in);

    	 System.out.println(); 
            System.out.println("Preencha a matriz 3x3:");
            for (int i = 0; i < 3; i++) { 
                for (int j = 0; j <3; j++) { 
                	matriz[i][j] = scan.nextInt(); 
                	System.out.println("matriz[" + i + "][" + j + "] = " + matriz[i][j]);
                	
                   
                    soma+=matriz[i][j];
                }
                System.out.println("\n");
                
            }
            
            System.out.println("Preencha a 2 matriz 3x3:");
            
            for (int i = 0; i < 3; i++) { 
                for (int j = 0; j <3; j++) {
                	matriz2[i][j] = scan.nextInt(); 
                    System.out.println("matriz[" + i + "][" + j + "] = " + matriz2[i][j]);
                    
               
                    soma2+=matriz[i][j];
                    
                }
                System.out.println("\n");
            }

            System.out.println("A soma da 1 matriz: "+soma);
            System.out.println("A soma da 2 matriz: "+soma2);
            System.out.println(); 

        
    }
    public static void VerificarLogin() {
    	
    	Scanner scan3 = new Scanner(System.in);
    	String [][] matriz = new String[6][2]; 
    	
    	System.out.println(); 
    	System.out.println("Cadastro para Login");
    	
    	for(int l = 0 ;l < 6; l++) {
    		for(int c = 0 ; c < 2; c++) {
    			if (c == 0) {
    				System.out.println(); 
                    System.out.println("Digite o Email");
                } else {
                	System.out.println(); 
                    System.out.println("Digite a senha");
                }
    			matriz[l][c] = scan3.nextLine();
    		}	
    	}
    	
    	System.out.println(); 
    	System.out.println("Digite o email que você cadastrou:");
        String email = scan3.nextLine();
        while (email.isEmpty()) {
        	System.out.println(); 
            System.out.println("O email não pode estar vazio. Digite novamente:");
            email = scan3.nextLine();
        }
        
        System.out.println(); 
        System.out.println("Digite a senha que você cadastrou:");
        String senha = scan3.nextLine();
        while (senha.isEmpty()) {System.out.println(); 
            System.out.println("A senha não pode estar vazia. Digite novamente:");
            senha = scan3.nextLine();
        }

        boolean login=false;
    		for(int l=0 ; l<6; l++) {    			
    		if(email.equals(matriz[l][0]) && senha.equals(matriz[l][1])) {
    			login= true;
    			break;
    		}}
    		
    		System.out.println(); 
    		if(login) {
    			System.out.println("Login Certo!");
    			 System.out.println(); 
    		}else {
    			System.out.println("Email ou senha errados!");
    			 System.out.println(); 
    		}
    
    	
    }
    public static void invertermatriz() {
    	
    	Scanner scan4= new Scanner(System.in);
    	
     
    	System.out.println("Qual o tamanho da linha que você deseja?");
        int linha = scan4.nextInt();
        System.out.println(); 
        
        System.out.println("Qual o tamanho da coluna que você deseja?");
        int coluna = scan4.nextInt();
        System.out.println(); 
        
    int matriz[][] = new int[linha][coluna];
      
     
      for(int l=0; l<linha ;l++) {
    	  for(int c=0; c<coluna; c++) {
    		   System.out.print("Elemento [" + l + "][" + c + "]: ");
    		  matriz[l][c]= scan4.nextInt();
    		  
    	  }
      }
      
      int matrizinv[][]= new int[coluna][linha];
       
      for(int l=0; l<linha; l++) { 
    	for(int c=0; c<coluna; c++) {   		
    		matrizinv[c][l] = matriz[l][c];
    	}
    }
      System.out.println("Matriz Invertida:");
      for (int l = 0; l < coluna; l++) {
          for (int c = 0; c < linha; c++) {
              System.out.print(matrizinv[l][c] + " ");
          }
          System.out.println(); 
      }
      
    }
}
