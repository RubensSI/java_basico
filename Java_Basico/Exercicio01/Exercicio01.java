import java.util.Scanner;

public class Exercicio01 {
 
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int valor_entrada = 0;

		System.out.println("Informe um valor: ");
		valor_entrada = scan.nextInt();

		System.out.println();
		System.out.println("O valor informado foi: " + valor_entrada);
	}
}