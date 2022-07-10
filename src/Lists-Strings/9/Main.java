import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<Integer>(){{
            add(1);
            add(2);
            add(3);
        }};
        List<Integer> list2 = new ArrayList<Integer>(){{
            add(4);
            add(5);
            add(6);
        }};
        System.out.println(concatLists(list1, list2));
     }

    static <T> List<T> concatLists(List<T> list1, List<T> list2) {
        list1.addAll(list2);
        return list1;
    }
}