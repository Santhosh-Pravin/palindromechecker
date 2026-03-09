import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("====================================");
        System.out.println(" OOP PALINDROME SERVICE             ");
        System.out.println("====================================");
        System.out.print("Enter a word: ");
        String word = sc.nextLine();

        // Instantiate the object-oriented service
        PalindromeChecker checker = new PalindromeChecker();

        if (checker.checkPalindrome(word)) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is NOT a Palindrome");
        }
        sc.close();
    }
}

// Encapsulated Class
class PalindromeChecker {
    public boolean checkPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
