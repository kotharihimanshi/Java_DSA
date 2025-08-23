import java.util.*;

public class AddDigits {

    // ----------------- Approach 1: Brute Force (Iterative) -----------------
    // public int addDigitsBrute(int num) {
    //     while (num >= 10) { // Repeat until single digit
    //         int sum = 0;
    //         while (num > 0) {
    //             sum += num % 10; // Get last digit
    //             num /= 10;       // Remove last digit
    //         }
    //         num = sum; // Replace number with sum
    //     }
    //     return num;
    // }

    // ----------------- Approach 2: Optimal Formula (Digital Root) -----------------
    // public int addDigitsOptimal(int num) {
    //     if (num == 0) return 0;
    //     return 1 + (num - 1) % 9;
    // }

    // ----------------- Approach 3: Recursive -----------------
    public int addDigitsRecursive(int num) {
        if (num < 10) return num; // Base case
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return addDigitsRecursive(sum); // Recursive call
    }

    // ----------------- Main Method for Testing -----------------
    public static void main(String[] args) {
        Solution obj = new Solution();

        // Test cases
        int[] testCases = {38, 0, 99, 1234, 7, 100};

        System.out.println("----------- Brute Force Approach -----------");
        for (int num : testCases) {
            System.out.println("Input: " + num + " -> Output: " + obj.addDigitsBrute(num));
        }

        System.out.println("\n----------- Optimal Formula Approach -----------");
        for (int num : testCases) {
            System.out.println("Input: " + num + " -> Output: " + obj.addDigitsOptimal(num));
        }

        System.out.println("\n----------- Recursive Approach -----------");
        for (int num : testCases) {
            System.out.println("Input: " + num + " -> Output: " + obj.addDigitsRecursive(num));
        }
    }
}
