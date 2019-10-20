import java.util.Scanner;

public class Exercicio37 {

	public static void main(String[] args) {

		int[] vetA = {0, 1, 2, 3, 4, 5};
		int[] vetB = new int[vetA.length];

		for(int i=0; i<vetA.length; i++) {

			vetA[i] = 1;
			vetB[i] = 1;

			for(int j=1; j<vetA[i]; j++) {
				System.out.print(j);
				vetB[i] *= j;
			}
		} 

		System.out.println("Vetor B!");
		for(int i=0; i<vetB.length; i++) {

			System.out.println(vetB[i]);
		}
	}
}