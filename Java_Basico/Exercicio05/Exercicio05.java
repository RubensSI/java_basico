import java.util.Scanner;

public class Exercicio05 {

   public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);
   
      int[] vetA = new int[6];
      int[] vetB = new int[vetA.length];
      int[] vetC = new int[vetA.length*2];
      

      System.out.println();
      System.out.println("Preencha o vetor A!");
      for(int cont=0; cont<vetA.length; cont++) {
         System.out.println("Digite o numero na posicao " + (cont+1) + "º: ");
         vetA[cont] = scan.nextInt();                  
      }

      System.out.println();
      System.out.println("Preencha o vetor B!");
      for(int cont=0; cont<vetA.length;cont++) {
         System.out.println("Digite o numero na posicao: " + (cont+1) + "ª: ");
         vetB[cont] = scan.nextInt();
         vetC[cont] = vetA[cont];
         vetC[vetA.length + cont]  = vetB[cont];

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

      System.out.println();
      System.out.print("Vetor: ");
      for(int cont = 0; cont<vetA.length*2; cont++) {
	 System.out.print(" " + vetC[cont]);
      }
   }
}
