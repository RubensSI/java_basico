import java.util.Scanner;

public class Exercicio36 {

   public static void main(String[] args) {

      Scanner input = new Scanner(System.in);

      int[] vetA = new int[11];

      for (int i=0; i<11; i++) {
         vetA[i] = 1;
         for (int j=1; j<=i; j++) {

            vetA[i] *= 2;
         }
      }
      for (int i=0; i<=10; i++) {
         System.out.println(vetA[i]);
      }
      
   }

}
