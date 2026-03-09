import java.util.Stack;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        System.out.println("====================================");
        System.out.println("  ALGORITHM PERFORMANCE BENCHMARK   ");
        System.out.println("====================================");
        
        // Generate a large palindrome string
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 50000; i++) sb.append("a");
        String testString = sb.toString();

        long startTime = System.nanoTime();
        boolean res1 = checkWithTwoPointers(testString);
        long endTime = System.nanoTime();
        long twoPointersTime = endTime - startTime;

        startTime = System.nanoTime();
        boolean res2 = checkWithStack(testString);
        endTime = System.nanoTime();
        long stackTime = endTime - startTime;

        System.out.println("\nPerformance Comparison (String Length: " + testString.length() + ")");
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Two Pointers Execution Time: " + twoPointersTime + " ns (Result: " + res1 + ")");
        System.out.println("Stack Execution Time:        " + stackTime + " ns (Result: " + res2 + ")");
    }

    public static boolean checkWithTwoPointers(String str) {
        int left = 0, right = str.length() - 1;
        while(left < right) {
            if(str.charAt(left) != str.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

    public static boolean checkWithStack(String str) {
        Stack<Character> stack = new Stack<>();
        for(char c : str.toCharArray()) {
            stack.push(c);
        }
        for(char c : str.toCharArray()) {
            if(stack.pop() != c) return false;
        }
        return true;
    }
}
