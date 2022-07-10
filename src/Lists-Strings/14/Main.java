import java.util.*;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        int number = 2342;
        System.out.println(getDigits(number));
    }

    static List<Integer> getDigits(int number) {
        List<Integer> digits = new ArrayList<Integer>();
        while (number > 0) {
            digits.add(number % 10);
            number = number / 10;
        }
        Collections.reverse(digits);
        return digits;
    }
}