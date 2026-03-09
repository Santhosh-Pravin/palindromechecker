import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("     WELCOME TO PALINDROME APP      ");
        System.out.println("====================================");

        System.out.print("Enter a word: ");
        String word = sc.nextLine();

        String original = word.toLowerCase();
        String reversed = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        System.out.println("Input word      : " + word);
        System.out.println("Converted word  : " + original);
        System.out.println("Reversed word   : " + reversed);

        if (original.equals(reversed)) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is NOT a Palindrome");
        }

        sc.close();
    }
}
