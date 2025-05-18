package br.edu.fatecpg.conversao.view;
import br.edu.fatecpg.conversao.model.*;
public class Main {

		        
		        
		       
		        public static void main(String[] args) {
		            Conversor conversor = new Conversor();

		            System.out.println("25°C em Fahrenheit: " + conversor.converter(25.0));

		    
		            System.out.println("10 km em milhas: " + conversor.converter(10));

		        
		            System.out.println("Texto em maiúsculas: " + conversor.converter("Convertido!!"));
		        }
		    


		  
		

	}


