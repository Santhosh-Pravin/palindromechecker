import java.util.Scanner;

public class PalindromeCheckerApp {
    static class Node {
        char data;
        Node next;
        Node(char data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("====================================");
        System.out.println("   LINKED LIST PALINDROME CHECKER   ");
        System.out.println("====================================");
        System.out.print("Enter a word: ");
        String word = sc.nextLine();

        if (word.isEmpty()) {
            System.out.println("Empty string is a Palindrome");
            return;
        }

        // 1. Convert string into linked list
        Node head = new Node(word.charAt(0));
        Node current = head;
        for (int i = 1; i < word.length(); i++) {
            current.next = new Node(word.charAt(i));
            current = current.next;
        }

        // 2. Find middle using fast and slow pointers
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // 3. Reverse second half
        Node prev = null;
        Node curr = slow;
        while (curr != null) {
            Node nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }

        // 4. Compare both halves
        boolean isPalindrome = true;
        Node firstHalf = head;
        Node secondHalf = prev;
        
        while (secondHalf != null) {
            if (firstHalf.data != secondHalf.data) {
                isPalindrome = false;
                break;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        if (isPalindrome) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is NOT a Palindrome");
        }
        sc.close();
    }
}
