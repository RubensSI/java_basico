import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int options = 1;
		boolean cont = true;

		System.out.println("\nCalculadora de operações básicas\n");

		while(cont) {

			System.out.println("Informe os valor para a operação");
		
			System.out.println(" Valor 01: ");
			Double valor1 = input.nextDouble();

			System.out.println(" Valor 02: ");
			Double valor2 = input.nextDouble();

			System.out.println("Digite 1 para soma");
			System.out.println("Digite 2 para subtração");
			System.out.println("Digite 3 multiplicação");
			System.out.println("Digite 4 divisão");
			System.out.println("Digite -1 para sair");
			options = input.nextInt();

			switch(options) {
				case 1:
					System.out.println("Resultado da soma: " + (valor1 + valor2));
					break;
				case 2:
					System.out.println("Resultado da subtração: " + (valor1 - valor2));
					break;
				case 3:
					System.out.println("Resultado da multiplicação: " + (valor1 * valor2));
					break;
				case 4:
					System.out.println("Resultado da divisão " + (valor1 / valor2));
					break;

			}

		}
	}
}