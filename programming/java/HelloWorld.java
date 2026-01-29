import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Press Enter to exit...");
        new Scanner(System.in).nextLine();  // waits for Enter
    }
}
