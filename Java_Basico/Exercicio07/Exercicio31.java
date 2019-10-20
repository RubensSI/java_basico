import java.util.Scanner;

public class Exercicio31 {

   public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);
      
      int[] vetorA = new int[10];
      int[] vetorB = new int[vetorA.length+1]; 
      int indexB = 0;      

      System.out.println();
      System.out.println("Preencha o vetor: ");
      for(int cont=0; cont<vetorA.length; cont++) {
         System.out.println("Informe um numero: ");
         vetorA[cont] = scan.nextInt();
      }

      for(int i=0; i<vetorA.length; i++) {
         if(vetorA[i] % 2 == 0) {
	    vetorB[indexB] = vetorA[i];
            indexB++;
         }
      }

      for(int i=0; i<vetorA.length; i++) {
         if(vetorA[i] % 2 != 0) {
	    vetorB[indexB] = vetorA[i];
            indexB++;
         }
      }

   
      System.out.println();
      System.out.print("Vetor A: ");
      for(int i=0; i<vetorA.length; i++) {
	 System.out.print(" " + vetorA[i]);
      }

      System.out.println();
      System.out.print("Vetor B: ");
      for(int i=0; i<vetorA.length; i++) {
	 System.out.print(" " + vetorB[i]);
      }
   }
}
