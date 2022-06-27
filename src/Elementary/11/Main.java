import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        double result = 0;
        for(double i = 1.0; i <= Math.pow(10, 6); i = i + 1.0) {
            result = result + Math.pow(-1.0,i+1.0)/(2.0*i-1.0);
        }
        System.out.println(result * 4.0);
    }
}