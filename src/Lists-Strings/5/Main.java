import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<Double> prices = new ArrayList<Double>() {{
            add(32.99);
            add(22.99);
            add(1.99);
            add(1.86);
            add(99.99);
            add(1.59);
        }};
        System.out.println("current Total: " + getTotal(prices)+ "$");
        prices.add(45.99);
        System.out.println("Added 45.99$! New Total: " + getTotal(prices)+ "$");
    }

    public static double getTotal(List<Double> list) {
        double total = 0;
        for (Double i : list) {
            total += i;
        }
        return total;
    }
}