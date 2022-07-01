import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>() {{
            add(1);
            add(2);
            add(3);
            add(4);
            add(5);
            add(6);
            add(7);
            add(8);
            add(9);
            add(10);
        }};
        System.out.println(computeListSumFor(numbers));
        System.out.println(computeListSumWhile(numbers));
        System.out.println(computeListSumRecursive(numbers));
    }

    static int computeListSumFor(List<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }

    static int computeListSumWhile(List<Integer> list) {
        int sum = 0;
        int i = 0;
        while (i < list.size()) {
            sum += list.get(i);
            i++;
        }
        return sum;
    }

    static int computeListSumRecursive(List<Integer> list) {
        if (list.size() == 1)
            return list.get(0);
        else if (list.size() == 0)
            return 0;


        list.set(0, list.get(0) + list.get(1));
        list.remove(1);
        return computeListSumRecursive(list);
    }

}