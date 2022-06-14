import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What's Your Name?");
        String input = in.next();
        if (input.equals("Alice") || input.equals("Bob"))
            System.out.println("Hello " + input + "!");
        else
            System.out.println("Hello");
    }
}