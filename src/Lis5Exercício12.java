public class Lis5Exercício12 {
  public static void main(String args[]){
     for(int counter = 0; counter<= 10; counter++) {
      System.out.printf("%d!=%d\n",counter, factorial(counter));
     }
    }
     public static long factorial(long number){
      if(number<= 1) return 1;
      else return number *factorial(number-1);
     }
     }
