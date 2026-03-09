import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n====================================");
            System.out.println("        PALINDROME CHECKER APP      ");
            System.out.println("====================================");
            System.out.println("1. Check Palindrome");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter a word or sentence: ");
                    String input = sc.nextLine();

                    String processed = input.toLowerCase().replace(" ", "");
                    String reversed = "";

                    for (int i = processed.length() - 1; i >= 0; i--) {
                        reversed = reversed + processed.charAt(i);
                    }

                    System.out.println("Original input  : " + input);
                    System.out.println("Processed input : " + processed);
                    System.out.println("Reversed input  : " + reversed);

                    if (processed.equals(reversed)) {
                        System.out.println("\"" + input + "\" is a Palindrome");
                    } else {
                        System.out.println("\"" + input + "\" is NOT a Palindrome");
                    }
                    break;

                case 2:
                    System.out.println("Exiting application...");
                    break;

                default:
                    System.out.println("Invalid choice! Please enter 1 or 2.");
            }

        } while (choice != 2);

        sc.close();
    }
}
