import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<Integer>() {{
            add(1);
            add(2);
            add(3);
            add(4);
        }};
        List<Integer> list2 = new ArrayList<Integer>() {{
            add(5);
            add(6);
            add(7);
            add(8);
            add(9);
        }};
        System.out.println(alternateLists(list1, list2));
    }

    static <T> List<T> alternateLists(List<T> list1, List<T> list2) {
        int j = 1;
        for (int i = 0; i < list2.size(); i++) {
            if (j > list1.size())
                list1.add(list2.get(i));
            else
                list1.add(j, list2.get(i));
            j += 2;
        }
        return list1;
    }
}