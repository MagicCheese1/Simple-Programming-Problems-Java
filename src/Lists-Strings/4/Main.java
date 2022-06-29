import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<String> words = List.of("Tacos", "I", "are", "love", "disgusting", "pizza");
        System.out.println(getAllOddPositionElements(words));
    }

    public static <T> List<T> getAllOddPositionElements(List<T> list) {
        List<T> oddPositionElements = new ArrayList<T>();
        for (int i = 1; i < list.size(); i += 2) {
            oddPositionElements.add(list.get(i));
        }
        return oddPositionElements;
    }
}