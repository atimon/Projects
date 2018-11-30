import java.util.Scanner;

public class Test {
  public static void main(String[] args){
    Scanner sinput = new Scanner(System.in);

    System.out.println("Choose a number between 1 and 10: ");
    int a = sinput.nextInt();
    System.out.print("Your number is..... "); // then print the result
    System.out.println(a + "!");
  }
}
