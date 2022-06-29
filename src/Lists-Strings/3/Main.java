import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> foods = List.of("pizza", "tacos", "burrito", "hamburger", "fries", "salad");
        System.out.println("Pizza is on the menu: " + listContains(foods, "pizza"));
        System.out.println("Lasagne is on the menu: " + listContains(foods, "lasagne"));
        System.out.println("Fries are on the menu: " + listContains2(foods, "fries"));
        System.out.println("Nachos are on the menu: " + listContains2(foods, "nachos"));
    }

    public static <T> boolean listContains(List<T> list, T element) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(element))
                return true;
        }
        return false;
    }

    public static <T> boolean listContains2(List<T> list, T element) {
        return list.contains(element);
    }

}