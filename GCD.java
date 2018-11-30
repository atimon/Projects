import java.util.Scanner;

public class GCD {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first number: ");
    int a = sc.nextInt(); // input a
    System.out.println("Enter second number: ");
    int b = sc.nextInt(); // input b

    while (a != b) { // while a and b not equal
      // replace larger by the difference...
      if (a > b)
        a = a-b;
      else
        b = b-a;
    }
    System.out.print("The GCD is: "); // then print the result
    System.out.println(a);
  }
}
