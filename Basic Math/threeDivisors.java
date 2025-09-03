public class threeDivisors {

    public boolean isThree(int n) {
        int sqrt = (int) Math.sqrt(n);

        // Check if n is a perfect square
        if (sqrt * sqrt != n) {
            return false;
        }

        // Check if sqrt is prime
        return isPrime(sqrt);
    }

    // Helper method to check if a number is prime
    private boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // Main method to test the code
    public static void main(String[] args) {
        Solution sol = new Solution();

        int n1 = 2;
        int n2 = 4;
        int n3 = 9;
        int n4 = 16;

        System.out.println("n = " + n1 + " → " + sol.isThree(n1)); // false
        System.out.println("n = " + n2 + " → " + sol.isThree(n2)); // true
        System.out.println("n = " + n3 + " → " + sol.isThree(n3)); // true
        System.out.println("n = " + n4 + " → " + sol.isThree(n4)); // false
    }
}
