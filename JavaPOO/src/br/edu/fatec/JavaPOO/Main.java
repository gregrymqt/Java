package br.edu.fatec.JavaPOO;
import java.util.Scanner;

public class Main {
	
	static class Calculadora {
        private double n1;
        private double n2;
		
	
	  public Calculadora(double n1, double n2) {
          this.n1 = n1;
          this.n2 = n2;	
      }
		
		
		public double Somar() {
		    return this.n1 + this.n2;
		}

		public double Subtrair() {
		    return this.n1 - this.n2;
		}

		public double Multiplicar() {
		    return this.n1 * this.n2;
		}

		public double Dividir() {
		    if (this.n2 == 0) {
		        throw new ArithmeticException("Erro: Divisão por zero não é permitida.");
		    }
		    return this.n1 / this.n2;
		}
		
	}
	
	public static int exibirMenu(Scanner scan) {
        System.out.println("=== CALCULADORA ===");
        System.out.println("Escolha uma operação:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");

        System.out.print("Digite o número da operação desejada: ");
        return scan.nextInt();
    }

    // Método para ler um número do usuário
    public static double lerNumero(Scanner scan, String mensagem) {
        System.out.print(mensagem);
        return scan.nextDouble();
    }

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	       
	    try {
            // Exibir o menu e ler a operação escolhida
            int operacao = exibirMenu(scan);

            // Ler os números
            double n1 = lerNumero(scan, "Digite o primeiro número: ");
            double n2 = lerNumero(scan, "Digite o segundo número: ");

            // Criar a instância da calculadora
            Calculadora calculadora = new Calculadora(n1, n2);

            // Variáveis auxiliares
            double resultado = 0;
            boolean operacaoValida = true;

            // Executar a operação escolhida
            switch (operacao) {
                case 1:
                    resultado = calculadora.Somar();
                    break;
                case 2:
                    resultado = calculadora.Subtrair();
                    break;
                case 3:
                    resultado = calculadora.Multiplicar();
                    break;
                case 4:
                    try {
                        resultado = calculadora.Dividir();
                    } catch (ArithmeticException e) {
                        System.out.println(e.getMessage());
                        operacaoValida = false;
                    }
                    break;
                default:
                    System.out.println("Operação inválida!");
                    operacaoValida = false;
                    break;
            }

            // Exibir o resultado, se a operação for válida
            if (operacaoValida) {
                System.out.println("Resultado: " + resultado);
            }

        } catch (Exception e) {
            System.out.println("Erro: Entrada inválida. Por favor, insira números válidos.");
        } finally {
            scan.close(); // Fechar o scanner
        }
    }

	}

