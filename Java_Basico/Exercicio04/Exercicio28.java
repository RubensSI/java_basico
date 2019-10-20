import java.util.Scanner;
/*
* 1) Criar um vetor A com 10 emementos inteiros
* 2) Criar um vetor B de mesmo tipo e tamanho
* 3) O vetor B deverá conter os mesmoa elementos
*    que o vetor A, mais de forma invertida 
*/
public class Exercicio28 {

 /*
 *
 *@author rubens
 *
 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] vetA = new int[6];
		int[] vetB = new int[vetA.length];

		System.out.println();

		for(int cont = 0; cont<vetA.length; cont++) {
			System.out.println("Informe os valor na posicao: " + (cont+1) + "º");
			vetA[cont] = scan.nextInt();
			vetB[vetA.length - cont - 1] = vetA[cont];
		}	

		System.out.println();
		System.out.print("Vetor A: ");
		for(int cont = 0; cont<vetA.length; cont++) {
			System.out.print(" " + vetA[cont]);
		}

		System.out.println();
		System.out.print("Vetor B: ");
		for(int cont = 0; cont<vetA.length; cont++) {
			System.out.print(" " + vetB[cont]);
		}

	}
}
