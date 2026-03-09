import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("====================================");
        System.out.println("     QUEUE + STACK PALINDROME       ");
        System.out.println("====================================");
        System.out.print("Enter a word: ");
        String word = sc.nextLine();

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Enqueue to Queue and Push to Stack
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            queue.add(c);
            stack.push(c);
        }

        boolean isPalindrome = true;
        // Compare Dequeue vs Pop
        while (!queue.isEmpty()) {
            if (queue.remove() != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is NOT a Palindrome");
        }
        sc.close();
    }
}
