public class PalindromeApp {
    public static void main(String[] args) {
        System.out.println("Palindrome Checker App - Version 1.0");

        String hardcoded = "madam";
        System.out.println("UC2: Hardcoded check for \"" + hardcoded + "\"");
        if (isPalindromeHardcoded(hardcoded)) {
            System.out.println("Result: \"" + hardcoded + "\" is a palindrome.");
        } else {
            System.out.println("Result: \"" + hardcoded + "\" is NOT a palindrome.");
        }
    }

    public static boolean isPalindromeHardcoded(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}


