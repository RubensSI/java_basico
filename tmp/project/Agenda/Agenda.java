package Agenda;

import java.util.Scanner;

public class Agenda {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String[][] compromissos = new String[31][24];

		boolean sair = false;
		byte opcao;
		while(!sair) {

			System.out.println("Digite 1 para adicionar compromisso");
			System.out.println("Digite 2 para buscar compromisso");
			System.out.println("Digite 0 para sair");

			opcao = scan.nextByte();

			if (opcao == 1) {

				boolean diaValido = false;
				int dia = 0;

				while (!diaValido) {
					System.out.println("Entre com o dia do mes");
					dia = scan.nextInt();
					if (dia > 0 && dia <= 31) {
						diaValido = true;
					} else {
						System.out.println("Dia ivalido, digite novamente! ");
					}
				}

				boolean horaValida = false;
				int hora = 0;

				while (!horaValida) {
					System.out.println("Entre com hora do compromisso");
					hora = scan.nextInt();
					if (hora >= 0 && hora <= 24) {
						horaValida = true;
					} else {
						System.out.println("Hora invalida, digite novamnete!");
					}
				}
				dia--;
				System.out.println("Digite o compromisso: ");
				compromissos[dia][hora] =  scan.next();
				
			} else if (opcao == 2) {
				
				boolean diaValido = false;
				int dia = 0;

				while (!diaValido) {
					System.out.println("Entre com o dia do mes");
					dia = scan.nextInt();
					if (dia > 0 && dia <= 31) {
						diaValido = true;
					} else {
						System.out.println("Dia ivalido, digite novamente! ");
					}
				}

				boolean horaValida = false;
				int hora = 0;

				while (!horaValida) {
					System.out.println("Entre com hora do compromisso");
					hora = scan.nextInt();
					if (hora >= 0 && hora <= 24) {
						horaValida = true;
					} else {
						System.out.println("Hora invalida, digite novamnete!");
					}
				}
				dia--;
				System.out.println("O compromisso agendado é: ");
				System.out.println(compromissos[dia][hora]);
				

			} else if (opcao == 0) {
				sair = true;
			} else {
				System.out.println("Opção inválida, digite novamente!");
			}

		}
	}

}