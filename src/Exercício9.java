public class Exercício9 {
    public static void main(String[]args){
      String str = "Exercicio em JAVA usado JDK no VScode.";
      System.out.println("Original String = "+ str);
              
        int index1 = str.charAt(2);
        int index2 = str.charAt(13);
        
        System.out.println("The character at positon 2 is"+(char)index1);
        System.out.println("The character at positon 13 is"+(char)index2);
    }   
}