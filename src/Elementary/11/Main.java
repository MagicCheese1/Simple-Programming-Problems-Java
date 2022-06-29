import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        double result = 0;
        for(double i = 1; i <= Math.pow(10, 6); i++) {
            result += Math.pow(-1,i+1)/(2*i-1);
        }
        System.out.println(result * 4);
    }
}