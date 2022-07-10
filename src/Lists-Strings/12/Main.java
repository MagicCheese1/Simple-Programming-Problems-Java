import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<Integer>() {{
            add(1);
            add(2);
            add(3);
            add(4);
            add(5);
            add(6);
        }};
        System.out.println(rotateList(list1, 2));
    }

    static <T> List<T> rotateList(List<T> list, int n){
        int i = 0;
        while(i < n) {
            i++;
            list.add(list.size(), list.get(0));
            list.remove(0);
        }
        return list;
    }
}