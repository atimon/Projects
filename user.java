import java.util.Scanner;

public class user {
public static void main(String[] args){
    System.out.println("Enter your username: ");
    Scanner scanner = new Scanner(System.in);
    String username = scanner.nextLine();
    System.out.println("Your username is " + username.toLowerCase() + ".");
    System.out.println("The character in the third position in: " + username.charAt(2));
  }
}
