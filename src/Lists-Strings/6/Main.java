public class Main {
    public static void main(String[] args) {
        System.out.println("kayak is a palindrome: " + isPalindrome("kayak"));
        System.out.println("pizza is a palindrome: " + isPalindrome("pizza"));
    }

    public static boolean isPalindrome(String string) {
        return string.equals(getReversedString(string));
    }

    public static String getReversedString(String string) {
        String reversedString = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            reversedString += string.charAt(i);
        }
        return reversedString;
    }
}