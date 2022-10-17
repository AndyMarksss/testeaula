import java.util.Scanner;

public class Lis5Exercício11 {
    public static void main(String[]args){
      int total, score;
      float percentage;

      try (Scanner inputNumScanner = new Scanner(System.in)) {

        System.out.println("Digite o valor total máximo: ");
        total = inputNumScanner.nextInt();

        System.out.println("Digite o valor obtido: ");
        score = inputNumScanner.nextInt();
      }
      percentage = (score * 100 / total);
      System.out.println("A porcentagem é = " + percentage + " %");
    }   
}