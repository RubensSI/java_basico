import java.util.Scanner;

public class Exercicio30 {

   public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);

      int[] vetA = new int[20];
      int[] vetB = new int[vetA.length];
      int[] vetC = new int[vetA.length];

      System.out.println("Preencha o vetor A!");
      for(int cont=0; cont<vetA.length; cont++) {
	System.out.println("Digite o valor na posicao: " + (cont + 1) + "º");
        vetA[cont] = scan.nextInt();
      }

      int poxB = 0;
      int poxC = 0;

      for(int cont=0; cont<vetA.length; cont++) {
         if((vetA[cont]%2) == 0) {
  	    vetB[poxB] = vetA[cont];
            poxB++; 
         }
         else {
	    vetC[poxC] = vetA[cont];
	    poxC++;
         } 
      }

      System.out.println();
      System.out.println("vetor A!");
      for(int cont=0; cont<vetA.length; cont++) {
	 System.out.print(" " + vetA[cont]);
      }

      System.out.println();
      System.out.println("Vetor B!");
      for(int cont=0; cont<poxB;cont++) {
         System.out.print(" " + vetB[cont]);
      }

      System.out.println();
      System.out.println("Vetor C!");
      for(int cont=0; cont<poxC; cont++) {
         System.out.print(" " + vetC[cont]);
      }
   }
}
