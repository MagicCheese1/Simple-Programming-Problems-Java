import java.util.Scanner;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        int guesses = 0;
        int oldInput = -1;
        Random rand = new Random();
        Scanner in = new Scanner(System.in);
        int theNumber = rand.nextInt(100) + 1;
        System.out.println("Guess a Number between 1 and 100!");
        while(true) {
            int input = in.nextInt();
            if (input != oldInput)
                guesses += 1;
            if (input == theNumber)
                break;
            else {
                if (input > theNumber) {
                    System.out.println("Oh that's too large! Try again!");
                } else {
                    System.out.println("Oh that's too small! Try again!");
                }
            }
        }
        System.out.println("Good job!!! It took you " + guesses + " guesses!");
    }
}