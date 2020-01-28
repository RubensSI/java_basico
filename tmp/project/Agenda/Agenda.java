package Agenda;

import java.util.Scanner;

public class Agenda {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String[][][] compromissos = new String[12][31][8];

		boolean sair = false;
		byte opcao;
		while(!sair) {

			System.out.println("Digite 1 para adicionar compromisso");
			System.out.println("Digite 2 para buscar compromisso");
			System.out.println("Digite 0 para sair");

			opcao = scan.nextByte();

			if (opcao == 1) {

				boolean mesValido = false;
				int mes = 0;

				while (!mesValido) {
					System.out.println("Entre com o mes");
					mes = scan.nextInt();
					if (mes >= 0 && mes <= 12) {
						mesValido = true;
					} else {
						System.out.println("mes invalido, digite novamente!");
					}
				}
	

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
					if (hora >= 0 && hora <= 8) {
						horaValida = true;
					} else {
						System.out.println("Hora invalida, digite novamnete!");
					}
				}
				mes--;
				dia--;
				System.out.println("Digite o compromisso: ");
				compromissos[mes][dia][hora] =  scan.next();
				
			} else if (opcao == 2) {

				boolean mesValido = false;
				int mes = 0;

				while (!mesValido) {
					System.out.println("Entre com o mes");
					mes = scan.nextInt();
					if (mes >= 0 && mes <= 12) {
						mesValido = true;
					} else {
						System.out.println("Ano invalido, digite novamente!");
					}
				}
				
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
				mes--;
				dia--;
				System.out.println("O compromisso agendado é: ");
				System.out.println(compromissos[mes][dia][hora]);
				

			} else if (opcao == 0) {
				sair = true;
			} else {
				System.out.println("Opção inválida, digite novamente!");
			}

		}
	}

}