public class Palindrome {

    // Method to check if a number is palindrome
    public boolean isPalindrome(int n) {
        int original = n;
        int reversed = 0;

        // Reverse the number
        while (n > 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }

        // Check if original and reversed are the same
        return original == reversed;
    }

    // Main method to test the code
    public static void main(String[] args) {
        Palindrome p = new Palindrome();

        int n1 = 121;
        int n2 = 123;
        int n3 = 1221;
        int n4 = 100;

        System.out.println("n = " + n1 + " → " + p.isPalindrome(n1)); // true
        System.out.println("n = " + n2 + " → " + p.isPalindrome(n2)); // false
        System.out.println("n = " + n3 + " → " + p.isPalindrome(n3)); // true
        System.out.println("n = " + n4 + " → " + p.isPalindrome(n4)); // false
    }
}
