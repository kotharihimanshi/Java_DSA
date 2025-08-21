/*
Problem: Maximum Ascending Subarray Sum

Given an integer array nums, return the maximum possible sum of an ascending subarray.

An ascending subarray is defined as a contiguous sequence where nums[i] < nums[i+1].
*/

public class MaxAscendingSum {

    // ----------------------------
    // 1. Brute Force Approach O(n^2)
    // ----------------------------
    // public static int maxAscendingSumBrute(int[] nums) {
    //     int n = nums.length;
    //     int maxSum = 0;

    //     for (int i = 0; i < n; i++) {
    //         int currentSum = nums[i];

    //         for (int j = i + 1; j < n; j++) {
    //             if (nums[j] > nums[j - 1]) {
    //                 currentSum += nums[j];
    //             } else {
    //                 break;
    //             }
    //         }

    //         maxSum = Math.max(maxSum, currentSum);
    //     }

    //     return maxSum;
    // }

    // ----------------------------
    // 2. Better Approach O(n)
    // ----------------------------
    // public static int maxAscendingSumBetter(int[] nums) {
    //     int n = nums.length;
    //     int currentSum = nums[0];
    //     int maxSum = nums[0];

    //     for (int i = 1; i < n; i++) {
    //         if (nums[i] > nums[i - 1]) {
    //             currentSum += nums[i];
    //         } else {
    //             currentSum = nums[i];
    //         }
    //         maxSum = Math.max(maxSum, currentSum);
    //     }

    //     return maxSum;
    // }

    // ----------------------------
    // 3. Optimal Approach O(n) ✅
    // ----------------------------
    public static int maxAscendingSumOptimal(int[] nums) {
        int n = nums.length;
        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < n; i++) {
            if (nums[i] > nums[i - 1]) {
                currentSum += nums[i];
            } else {
                maxSum = Math.max(maxSum, currentSum);
                currentSum = nums[i];
            }
        }

        // Check last subarray
        maxSum = Math.max(maxSum, currentSum);

        return maxSum;
    }

    // ----------------------------
    // 4. Testing All Approaches
    // ----------------------------
    public static void main(String[] args) {

        int[][] testCases = {
            {10, 20, 30, 5, 10, 50},   // Expected: 65
            {10, 20, 30, 40, 50},      // Expected: 150
            {12, 17, 15, 13, 10, 11, 12}, // Expected: 33
            {100},                     // Expected: 100
            {50, 40, 30, 20},          // Expected: 50
            {5, 6, 7, 1, 2, 8}         // Expected: 11
        };

        for (int i = 0; i < testCases.length; i++) {
            int[] nums = testCases[i];
            System.out.println("Test Case " + (i + 1));
            System.out.println("Brute Force: " + maxAscendingSumBrute(nums));
            System.out.println("Better:      " + maxAscendingSumBetter(nums));
            System.out.println("Optimal:     " + maxAscendingSumOptimal(nums));
            System.out.println("-----------------------------");
        }
    }
}
