import java.util.Scanner;

public class Exercício8 {
    public static void main(String args[]) {

        try (Scanner leitor = new Scanner(System.in)) {
            System.out.println("Digite o primeiro nome do Time: ");
            String time1 = leitor.nextLine();

            System.out.println("Digite o segundo nome do Time: ");
            String time2 = leitor.nextLine();

            System.out.println("Quantos gols o " + time1 + " fez?");
            int golsTime1 = leitor.nextInt();

            System.out.println("Quantos gols o " + time2 + " fez?");
            int golsTime2 = leitor.nextInt();

            if (golsTime1 > golsTime2) {
                System.out.println(time1 + " é o vencedor");
            } else if (golsTime1 < golsTime2) {
                System.out.println(time2 + " é o vencedor");
            } else {
                System.out.println("Houve um empate entre " + time1 + " e " + time2 + "!");
            }
        }
    }
}