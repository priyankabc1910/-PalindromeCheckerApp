```java
public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // ------------------ UC1 ------------------
        System.out.println("Welcome to Palindrome Checker App!");
        System.out.println("Application Name : Palindrome Checker");
        System.out.println("Version : 1.0");
        System.out.println("--------------------------------------");

        // ------------------ UC2 ------------------
        String word = "madam";
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        if (word.equals(reversed)) {
            System.out.println("The word \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a Palindrome.");
        }

        // ------------------ UC3 ------------------
        System.out.println("\nUC3: Palindrome Check Using String Reverse");
        System.out.println("------------------------------------------");

        String input = "level";
        String reverse = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reverse = reverse + input.charAt(i);
        }

        if (input.equals(reverse)) {
            System.out.println("The word \"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("The word \"" + input + "\" is NOT a Palindrome.");
        }

        // ------------------ UC4 ------------------
        System.out.println("\nUC4: Character Array Based Palindrome Check");
        System.out.println("------------------------------------------------");

        String text = "radar";

        char[] characters = text.toCharArray();

        int start = 0;
        int end = characters.length - 1;

        boolean isPalindrome = true;

        while (start < end) {
            if (characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println("The word \"" + text + "\" is a Palindrome.");
        } else {
            System.out.println("The word \"" + text + "\" is NOT a Palindrome.");
        }

        // ------------------ UC5 ------------------
        System.out.println("\nUC5: Stack-Based Palindrome Checker");
        System.out.println("------------------------------------");

        String stackInput = "noon";

        java.util.Stack<Character> stack = new java.util.Stack<>();

        for (char c : stackInput.toCharArray()) {
            stack.push(c);
        }

        boolean isStackPalindrome = true;

        for (char c : stackInput.toCharArray()) {
            if (c != stack.pop()) {
                isStackPalindrome = false;
                break;
            }
        }

        if (isStackPalindrome) {
            System.out.println("The word \"" + stackInput + "\" is a Palindrome.");
        } else {
            System.out.println("The word \"" + stackInput + "\" is NOT a Palindrome.");
        }

        // ------------------ UC6 ------------------
        System.out.println("\nUC6: Queue + Stack Based Palindrome Check");
        System.out.println("------------------------------------------------");

        String qsInput = "civic";

        java.util.Queue<Character> queue = new java.util.LinkedList<>();
        java.util.Stack<Character> stackQS = new java.util.Stack<>();

        for (char c : qsInput.toCharArray()) {
            queue.add(c);
            stackQS.push(c);
        }

        boolean isQSPalindrome = true;

        while (!queue.isEmpty()) {
            if (!queue.remove().equals(stackQS.pop())) {
                isQSPalindrome = false;
                break;
            }
        }

        System.out.println("Input : " + qsInput);
        System.out.println("Is Palindrome? : " + isQSPalindrome);

        // ------------------ UC7 ------------------
        System.out.println("\nUC7: Deque-Based Optimized Palindrome Checker");
        System.out.println("------------------------------------------------");

        String dequeInput = "refer";

        java.util.Deque<Character> deque = new java.util.ArrayDeque<>();

        for (char c : dequeInput.toCharArray()) {
            deque.addLast(c);
        }

        boolean isDequePalindrome = true;

        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                isDequePalindrome = false;
                break;
            }
        }

        System.out.println("Input : " + dequeInput);
        System.out.println("Is Palindrome? : " + isDequePalindrome);

        // ------------------ UC8 ------------------
        System.out.println("\nUC8: Linked List Based Palindrome Checker");
        System.out.println("------------------------------------------------");

        String llInput = "madam";

        java.util.LinkedList<Character> list = new java.util.LinkedList<>();

        for (char c : llInput.toCharArray()) {
            list.add(c);
        }

        boolean isLLPalindrome = true;

        while (list.size() > 1) {
            if (!list.removeFirst().equals(list.removeLast())) {
                isLLPalindrome = false;
                break;
            }
        }

        System.out.println("Input : " + llInput);
        System.out.println("Is Palindrome? : " + isLLPalindrome);

        // ------------------ UC9 ------------------
        System.out.println("\nUC9: Recursive Palindrome Checker");
        System.out.println("------------------------------------------------");

        String recInput = "racecar";

        boolean isRecPalindrome = isPalindromeRecursive(recInput, 0, recInput.length() - 1);

        System.out.println("Input : " + recInput);
        System.out.println("Is Palindrome? : " + isRecPalindrome);

        System.out.println("\nProgram execution completed.");
    }

    // Recursive Method for UC9
    public static boolean isPalindromeRecursive(String str, int start, int end) {

        if (start >= end) {
            return true;
        }

        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        return isPalindromeRecursive(str, start + 1, end - 1);
    }
}
```
