import java.util.Scanner;

public class Exercicio32 {

   public static void main(String[] args) {
   
      Scanner scan = new Scanner(System.in);

      int[] vetA = new int[5];

      for(int i=0;i<vetA.length; i++) {
	 System.out.println("Digite um valor na posicao: " + (i+1));
	 vetA[i] = scan.nextInt();
      }

      System.out.println();
      System.out.println("========================");
      for(int i=0; i<vetA.length; i++) {
         System.out.println();
         System.out.println("      Tabuada de " + vetA[i]);
         for(int j=0; j<10; j++) {
	    System.out.println("      " + j + " * " + vetA[i] + " = " + j * vetA[i]);
         }

      }
      
      System.out.println("========================");
      System.out.println();
   }
 
}
