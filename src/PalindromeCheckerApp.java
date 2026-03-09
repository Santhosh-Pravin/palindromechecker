import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("====================================");
        System.out.println("   RECURSIVE PALINDROME CHECKER     ");
        System.out.println("====================================");
        System.out.print("Enter a word: ");
        String word = sc.nextLine();

        if (isPalindrome(word, 0, word.length() - 1)) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is NOT a Palindrome");
        }
        sc.close();
    }

    private static boolean isPalindrome(String str, int start, int end) {
        // Base condition
        if (start >= end) {
            return true;
        }
        
        // Recursive calls compare characters
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        
        // Continue inward
        return isPalindrome(str, start + 1, end - 1);
    }
}
