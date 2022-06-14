public class Main {
    public static void main(String[] args) {
        int n = 0;
        while (true) {
            n++;
            boolean prime = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) System.out.println(n);
        }
    }
}