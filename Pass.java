import java.io.Console;
public class Pass {

    public void passwordExample() {
        Console console = System.console();
        if (console == null) {
            System.out.println("Couldn't get Console instance");
            System.exit(0);
        }

        char passwordArray[] = console.readPassword("Enter your secret password: ");
        console.printf("What a shitty password: %s%n", new String(passwordArray));

    }

    public static void main(String[] args) {
        new Pass().passwordExample();
    }
}
