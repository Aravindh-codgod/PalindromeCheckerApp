import java.util.Stack;

public class PalindromeApp {
    public static void main(String[] args) {
        System.out.println("Palindrome Checker App - Version 1.0");

        String test3 = "noon";
        System.out.println("UC5: Stack-based check for \"" + test3 + "\"");
        System.out.println(isPalindromeStack(test3) ? "Palindrome" : "Not Palindrome");
    }

    public static boolean isPalindromeStack(String str) {
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            stack.push(c);
        }
        String reversed = "";
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }
        return str.equals(reversed);
    }
}






