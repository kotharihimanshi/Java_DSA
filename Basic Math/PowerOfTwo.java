/*
Problem:
Given an integer n, return true if it is a power of two. Otherwise, return false.

An integer n is a power of two if there exists an integer x such that n == 2^x.

Example 1:
Input: n = 1
Output: true
Explanation: 2^0 = 1

Example 2:
Input: n = 16
Output: true
Explanation: 2^4 = 16

Example 3:
Input: n = 3
Output: false

Constraints:
-2^31 <= n <= 2^31 - 1
*/

class Solution {

    // ------------------ Approach 1: Brute Force ------------------
    // Keep dividing n by 2 until it becomes 1.
    // If n is less than or equal to 0, it's not a power of two.
    // public boolean isPowerOfTwoBrute(int n) {
    //     if (n <= 0) return false;
    //     while (n % 2 == 0) {
    //         n /= 2;
    //     }
    //     return n == 1;
    // }

    // ------------------ Approach 2: Optimal (Bit Manipulation) ------------------
    // A number is a power of two if it has only one set bit.
    // For example: 1 (0001), 2 (0010), 4 (0100), 8 (1000)
    // Formula: n > 0 && (n & (n - 1)) == 0
    public boolean isPowerOfTwoOptimal(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
}

public class PowerOfTwo {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // ----------- Testing Brute Force Approach -----------
        System.out.println("Brute Force Approach:");
        System.out.println(sol.isPowerOfTwoBrute(1));   // true
        System.out.println(sol.isPowerOfTwoBrute(16));  // true
        System.out.println(sol.isPowerOfTwoBrute(3));   // false
        System.out.println(sol.isPowerOfTwoBrute(64));  // true
        System.out.println(sol.isPowerOfTwoBrute(0));   // false
        System.out.println(sol.isPowerOfTwoBrute(-8));  // false

        System.out.println("\nOptimal Approach (Bit Manipulation):");
        System.out.println(sol.isPowerOfTwoOptimal(1));   // true
        System.out.println(sol.isPowerOfTwoOptimal(16));  // true
        System.out.println(sol.isPowerOfTwoOptimal(3));   // false
        System.out.println(sol.isPowerOfTwoOptimal(64));  // true
        System.out.println(sol.isPowerOfTwoOptimal(0));   // false
        System.out.println(sol.isPowerOfTwoOptimal(-8));  // false
    }
}
