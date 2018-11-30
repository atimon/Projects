import java.util.Scanner;

public class MyClass {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // var
    int age = 17;
    char initial1 = 'A';
    char initial2 = 'T';
    char initial3 = 'C';
    double height = 1.8;
    boolean married = false;
    // ask
    System.out.println("Type 1 for age, 2 for initial, 3 for height or 4 for situation: ");
    int require = sc.nextInt();
    // answer
    if (require == 1) {
      System.out.print("Andrés' is: "); // then print the result
      System.out.println(
        age +
        " years old");
    }
    if (require == 2) {
      System.out.print("Andrés initial is: "); // then print the result
      System.out.println(initial1);
    }
    if (require == 3) {
      System.out.print("Andrés' height is: "); // then print the result
      System.out.println(
        height +
        " meters");
    }
    else if (require == 4) {
      System.out.print("Is Andrés married? "); // then print the result
      System.out.println(married);
    }
  }
}
