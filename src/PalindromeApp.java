public class PalindromeApp {
    public static void main(String[] args) {
        System.out.println("Palindrome Checker App - Version 1.0");

        String hardcoded = "madam";
        System.out.println("UC2: Hardcoded check for \"" + hardcoded + "\"");
        System.out.println(isPalindromeHardcoded(hardcoded) ? "Palindrome" : "Not Palindrome");

        String test1 = "racecar";
        System.out.println("UC3: Reverse string check for \"" + test1 + "\"");
        System.out.println(isPalindromeByReverse(test1) ? "Palindrome" : "Not Palindrome");
    }

    public static boolean isPalindromeHardcoded(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }

    public static boolean isPalindromeByReverse(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return str.equals(reversed);
    }
}



