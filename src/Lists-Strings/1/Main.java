import java.util.List;

public class Main {
    static List<Integer> integerList = List.of(45, 345, 22, 1, 5454, 5311, 3, 0, 1, 3465, 1);

    public static void main(String[] args) {
        System.out.println(getLargest(integerList));
    }

    static int getLargest(List<Integer> list) {
        int largest = list.get(0);
        for (int i : list) {
            if (i > largest) {
                largest = i;
            }
        }
        return largest;
    }
}