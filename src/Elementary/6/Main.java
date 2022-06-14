import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Give me a number!!!");
        int n = in.nextInt();
        System.out.println("Do you want to Add or Multiply?(+/*)");
        String sign = in.next();
        int sum = 1;
        if(sign.equals("*")) {
            for (int i = 1; i <= n; i++) {
                sum = sum * i;
            }
        } else if(sign.equals("+")) {
            for (int i = 2; i <= n; i++) {
                sum += i;
            }
        } else {
            System.out.println("False sign");
            return;
        }
        System.out.println((sign.equals("*") ? "product: " : "sum: ") + sum);
    }
}