import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<Integer> squares = new ArrayList<Integer>();
        for (int i = 1; i <= 20; i++) {
            squares.add(i * i);
        }
        on_all(squares, (square) -> {
            System.out.println(square.toString());
        });
    }

    static void on_all(List list, IMyFunc func) {
        for (Object object : list) {
            func.Func(object);
        }
    }
}

interface IMyFunc {
    void Func(Object object);
}