/*
Problem:
Given an array nums of n integers. Every integer in the array appears twice except one integer.
Find the number that appeared only once in the array.

Examples:
Input: nums = [1, 2, 2, 4, 3, 1, 4]
Output: 3
Explanation: The integer 3 has appeared only once.

Input: nums = [5]
Output: 5
Explanation: The integer 5 has appeared only once.

Input: nums = [1, 3, 10, 3, 5, 1, 5]
Output: 10
*/

public class SingleNumberFinder {

    // Method to find the single number
    public int singleNumber(int[] nums) {
        int xor = 0;
        for (int i = 0; i < nums.length; i++) {
            xor = xor ^ nums[i];
        }
        return xor;
    }

    // Main method to run test cases
    public static void main(String[] args) {
        SingleNumberFinder finder = new SingleNumberFinder();

        // Test cases
        int[][] testCases = {
            {1, 2, 2, 4, 3, 1, 4}, // Expected 3
            {5},                   // Expected 5
            {1, 3, 10, 3, 5, 1, 5}, // Expected 10
            {7, 7, 8},              // Expected 8
            {42, 99, 42},           // Expected 99
            {100, 200, 100, 300, 200} // Expected 300
        };

        for (int[] test : testCases) {
            System.out.println("Input: " + java.util.Arrays.toString(test) +
                               " -> Single Number: " + finder.singleNumber(test));
        }
    }
}
