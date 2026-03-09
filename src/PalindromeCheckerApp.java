import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("====================================");
        System.out.println(" STRATEGY PATTERN PALINDROME APP    ");
        System.out.println("====================================");
        System.out.print("Enter a word: ");
        String word = sc.nextLine();

        System.out.println("\nSelect Palindrome Strategy:");
        System.out.println("1. Stack Strategy");
        System.out.println("2. Deque Strategy");
        System.out.print("Choice: ");
        int choice = sc.nextInt();

        // Strategy Pattern application based on Polymorphism runtime choice
        PalindromeStrategy strategy;
        if (choice == 2) {
            strategy = new DequeStrategy();
        } else {
            strategy = new StackStrategy();
        }

        if (strategy.isPalindrome(word)) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is NOT a Palindrome");
        }
        sc.close();
    }
}

// Common Interface
interface PalindromeStrategy {
    boolean isPalindrome(String str);
}

// Strategy 1
class StackStrategy implements PalindromeStrategy {
    public boolean isPalindrome(String str) {
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            stack.push(c);
        }
        for (char c : str.toCharArray()) {
            if (stack.pop() != c) {
                return false;
            }
        }
        return true;
    }
}

// Strategy 2
class DequeStrategy implements PalindromeStrategy {
    public boolean isPalindrome(String str) {
        Deque<Character> deque = new ArrayDeque<>();
        for (char c : str.toCharArray()) {
            deque.addLast(c);
        }
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }
        return true;
    }
}
