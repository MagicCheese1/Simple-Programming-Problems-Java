import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<Integer>() {{
            add(5);
            add(2);
            add(6);
            add(7);
            add(10);
        }};
        List<Integer> list2 = new ArrayList<Integer>() {{
            add(4);
            add(8);
            add(3);
            add(1);
            add(20);
        }};
        System.out.println(MergeAndSort(list1, list2));

    }
    public static List<Integer> MergeAndSort(List<Integer> list1, List<Integer> list2) {
        list1.addAll(list2);
        Collections.sort(list1);
        return list1;
    }
}
//TODO: find quicker solution?
