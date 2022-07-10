import java.util.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        List<BigInteger> fibonacciNumbers = new ArrayList<BigInteger>();
        fibonacciNumbers.add(BigInteger.valueOf(1));
        fibonacciNumbers.add(BigInteger.valueOf(1));
        for (int i = 2; i < 100; i++) {
            fibonacciNumbers.add(
                    fibonacciNumbers.get(fibonacciNumbers.size() - 1).add(fibonacciNumbers.get(fibonacciNumbers.size() - 2)));
        }
        System.out.println(fibonacciNumbers);
    }
}