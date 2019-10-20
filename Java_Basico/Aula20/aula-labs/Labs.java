public class Labs {

   public static void main(String[] args) {

      double[][] notasAlunos = new double[3][4];

      notasAlunos[0][0] = 8; 
      notasAlunos[0][1] = 9;
      notasAlunos[0][2] = 9.8;
      notasAlunos[0][3] = 10;

      notasAlunos[1][0] = 6;
      notasAlunos[1][1] = 7;
      notasAlunos[1][2] = 9;
      notasAlunos[1][3] = 5.3;

      notasAlunos[2][0] = 7;
      notasAlunos[2][1] = 6.4;
      notasAlunos[2][2] = 7.8;
      notasAlunos[2][3] = 9;

      for(int i=0; i<notasAlunos.length; i++) {

         System.out.println();
         System.out.println("Notas Aluno " + (i+1));

         for(int j=0; j<notasAlunos[i].length; j++) {

            System.out.print(" - " + notasAlunos[i][j]);
         }
         System.out.println();
      }
   
   }

}
