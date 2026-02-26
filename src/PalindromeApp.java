public class PalindromeApp {
    public static void main(String[] args) {
        System.out.println("Palindrome Checker App - Version 1.0");

        String test2 = "level";
        System.out.println("UC4: Char array two-pointer check for \"" + test2 + "\"");
        System.out.println(isPalindromeCharArray(test2) ? "Palindrome" : "Not Palindrome");
    }

    public static boolean isPalindromeCharArray(String str) {
        char[] arr = str.toCharArray();
        int left = 0, right = arr.length - 1;
        while (left < right) {
            if (arr[left] != arr[right]) return false;
            left++;
            right--;
        }
        return true;
    }
}





