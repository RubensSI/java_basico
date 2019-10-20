import java.util.Scanner;

public class Exerc36 {

	public static void main(String[] args) {

		double[] vetA = new double[11];

		for (int i=0; i<11; i++)
		{
			vetA[i] = Math.pow(2, i);
		}

		System.out.println("Vetor A");
		for (int i=0; i<11; i++)
		{
			System.out.println( vetA[i] + " ");
		}
	}
}