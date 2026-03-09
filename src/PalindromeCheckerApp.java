import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("     WELCOME TO PALINDROME APP      ");
        System.out.println("====================================");

        System.out.print("Enter a word or sentence: ");
        String word = sc.nextLine();

        String processed = word.toLowerCase().replace(" ", "");
        String reversed = "";

        for (int i = processed.length() - 1; i >= 0; i--) {
            reversed = reversed + processed.charAt(i);
        }

        System.out.println("Original input  : " + word);
        System.out.println("Processed input : " + processed);
        System.out.println("Reversed input  : " + reversed);

        if (processed.equals(reversed)) {
            System.out.println("\"" + word + "\" is a Palindrome");
        } else {
            System.out.println("\"" + word + "\" is NOT a Palindrome");
        }

        sc.close();
    }
}
