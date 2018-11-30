import java.util.Scanner;

public class Age {
    public static void main(String[] args){
        Scanner sinput = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sinput.nextInt();
        int doubleAge = age * 2;
        System.out.println(
        "How old? That's half way to " +
        doubleAge + "!" + " Damn! How u not dead yet?");
    } 
}