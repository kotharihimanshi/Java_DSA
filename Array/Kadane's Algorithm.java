/*
Problem: Maximum Subarray Sum (Kadane's Algorithm)
-----------------------------------------------
Given an integer array nums, find the contiguous subarray 
(containing at least one number) which has the largest sum 
and return its sum.

Example 1:
Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.

Example 2:
Input: nums = [1]
Output: 1

Example 3:
Input: nums = [5,4,-1,7,8]
Output: 23
*/

public class KadaneAlgorithm {

    // ----------------------------
    // Kadane's Algorithm - O(n)
    // ----------------------------
    public static int maxSubArray(int[] nums) {
        int currentSum = nums[0];
        int maxSum = nums[0];

        // Start from index 1 since nums[0] is already considered
        for (int i = 1; i < nums.length; i++) {
            // Either start a new subarray or continue the existing one
            currentSum = Math.max(nums[i], currentSum + nums[i]);

            // Update the global maximum sum
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    // ----------------------------
    // Testing the solution
    // ----------------------------
    public static void main(String[] args) {

        int[][] testCases = {
            {-2,1,-3,4,-1,2,1,-5,4},  // Expected: 6
            {1},                      // Expected: 1
            {5,4,-1,7,8},             // Expected: 23
            {-1,-2,-3,-4},            // Expected: -1 (all negatives)
            {2,3,4,5},                // Expected: 14 (whole array)
            {-2, -1, -5, -3},         // Expected: -1 (largest negative)
            {8, -19, 5, -4, 20}       // Expected: 21 (subarray [5, -4, 20])
        };

        for (int i = 0; i < testCases.length; i++) {
            int result = maxSubArray(testCases[i]);
            System.out.println("Test Case " + (i + 1) + " → Max Sum = " + result);
        }
    }
}
