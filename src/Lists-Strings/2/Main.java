import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        List<String> words = List.of("work", "to", "live");
        System.out.println(words);

        List<String> reversedWords = getReversedList(words);
        System.out.println(reversedWords);
    }

    public static <T> List<T> getReversedList(List<T> list) {
        List<T> reversedList = new ArrayList<T>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reversedList.add(list.get(i));
        }
        return reversedList;
    }
}