public class Lis5Exercício13 {
  public static void swapValuesUsingThirdVariable(int m, int n) {
    int temp = m;
    m = n;
    n = temp;
    
    System.out.println("Valor de m é " + m + " e o valor n é " + n);
  }
  public static void main(String[] args) {
    int m = 9, n = 5;
    swapValuesUsingThirdVariable(m, n);    
  }
     }
