import javax.swing.JOptionPane;

public class Exercício10 {
    public static void main(String[]args){
      String NumA = JOptionPane.showInputDialog("Digite o primeiro numero inteiro: ");
      String NumB = JOptionPane.showInputDialog("Digite o primeiro numero inteiro: ");

      int Num1 = Integer.parseInt(NumA);
      int Num2 = Integer.parseInt(NumB);
      int Total = Num1 + Num2;

      JOptionPane.showMessageDialog(null, "Total: " + Total, "Soma de dois inteiros", JOptionPane.PLAIN_MESSAGE);
    }   
}