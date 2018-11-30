import java.util.Scanner;

public class Test2 {
public static void main(String[] args){
  Scanner sinput = new Scanner(System.in);
  System.out.println("Choose a number: ");
  int a = sinput.nextInt();
  boolean b = true;
    if (a > 10) {
      b = true;
    }
    else if (a <= 10) {
      b = false;
    }
       System.out.println("Is it greater than 10? ");
         if (b == true) {
           System.out.println("You tell the truth");
         }
         else if (b == false) {
           System.out.println("YOU LIE!");
         }
  }
}
