public class Lis5Exercício14 {
  void convertAndCount(int num)
  {
    int count = 0;
    String binary = Integer.toBinaryString(num);
    for (int i = 0; i < binary.length(); i++)
    if (binary.charAt(i) == '1')
    count++;
    System.out.println("O binary equivalente do numero " + num + " e: " + binary);

    System.out.println("Uso do contador: " + count);
  }
  public static void main (String[] args){
    Lis5Exercício14 obj = new Lis5Exercício14();
    obj.convertAndCount(18);
  }
     }
