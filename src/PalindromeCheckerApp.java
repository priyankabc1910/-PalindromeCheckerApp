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
            queue.add(c);     // Enqueue
            stackQS.push(c);  // Push
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
        System.out.println("\nProgram execution completed.");
    }
}