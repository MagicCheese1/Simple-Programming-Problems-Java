public class Main {
    public static void main(String[] args) {
        System.out.println("What's Your Name?");
        String input = System.console().readLine();
        System.out.println("Hello " + input + "!");
    }
}