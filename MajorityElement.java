/*
Problem: Majority Element (LeetCode 169)

Given an array nums of size n, return the majority element.
The majority element is the element that appears more than n / 2 times.
You may assume that the majority element always exists in the array.

Example:
Input: nums = [3,2,3]
Output: 3

Input: nums = [2,2,1,1,1,2,2]
Output: 2
*/

import java.util.*;

//moore's majority voting algorithm

public class MajorityElement {

    // ---------------- Brute Force ----------------
    // Time: O(n^2), Space: O(1)
    // public static int majorityElementBrute(int[] nums) {
    //     int n = nums.length;
    //     for (int i = 0; i < n; i++) {
    //         int count = 0;
    //         for (int j = 0; j < n; j++) {
    //             if (nums[j] == nums[i]) {
    //                 count++;
    //             }
    //         }
    //         if (count > n / 2) {
    //             return nums[i];
    //         }
    //     }
    //     return -1;
    // }

    // ---------------- Better (HashMap) ----------------
    // Time: O(n), Space: O(n)
    // public static int majorityElementBetter(int[] nums) {
    //     int n = nums.length;
    //     Map<Integer, Integer> freq = new HashMap<>();

    //     for (int num : nums) {
    //         freq.put(num, freq.getOrDefault(num, 0) + 1);
    //         if (freq.get(num) > n / 2) {
    //             return num;
    //         }
    //     }
    //     return -1;
    // }

    // ---------------- Optimal (Boyer-Moore) ----------------
    // Time: O(n), Space: O(1)
    public static int majorityElementOptimal(int[] nums) {
        int count = 0;
        int candidate = 0;

        // Step 1: Find candidate
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        // Step 2: Verify candidate
        int finalCount = 0;
        for (int num : nums) {
            if (num == candidate) {
                finalCount++;
            }
        }

        if (finalCount > nums.length / 2) {
            return candidate;
        }
        return -1;
    }

    // ---------------- Test Cases ----------------
    public static void main(String[] args) {
        int[][] testCases = {
            {3, 2, 3},
            {2, 2, 1, 1, 1, 2, 2},
            {1, 1, 1, 2, 3, 4, 1},
            {5, 5, 5, 5, 5},
            {1, 2, 3, 4, 5, 6, 7} // no majority
        };

        for (int[] test : testCases) {
            System.out.println("Array: " + Arrays.toString(test));
            System.out.println("Brute Force: " + majorityElementBrute(test));
            System.out.println("Better (HashMap): " + majorityElementBetter(test));
            System.out.println("Optimal (Boyer-Moore): " + majorityElementOptimal(test));
            System.out.println("--------------------------------------------------");
        }
    }
}
