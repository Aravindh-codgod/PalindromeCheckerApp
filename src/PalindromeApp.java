import java.util.*;

public class PalindromeApp {
    public static void main(String[] args) {
        System.out.println("Palindrome Checker App - Version 1.0");

        String test4 = "radar";
        System.out.println("UC6: Queue + Stack check for \"" + test4 + "\"");
        System.out.println(isPalindromeQueueStack(test4) ? "Palindrome" : "Not Palindrome");
    }

    public static boolean isPalindromeQueueStack(String str) {
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            queue.add(c);
            stack.push(c);
        }
        while (!queue.isEmpty()) {
            if (queue.remove() != stack.pop()) return false;
        }
        return true;
    }
}





