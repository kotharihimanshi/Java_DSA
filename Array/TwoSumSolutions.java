/*
Question:
Given an array of integers nums and an integer target, 
return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, 
and you may not use the same element twice.

Example:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: nums[0] + nums[1] == 9, so we return [0, 1].
*/

import java.util.*;

public class TwoSumSolutions {

    // -------------------- HashMap Solution --------------------
    public static int[] twoSumHashMap(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(); // value -> index
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{}; // no solution (though problem guarantees one)
    }

    // -------------------- Two Pointer Solution 1 and 2 --------------------
//     here indexes are lost after sorting
//     import java.util.*;

// class Solution {
//     public boolean twoSum(int[] nums, int target) {
//         Arrays.sort(nums); // sort array
//         int left = 0, right = nums.length - 1;

//         while (left < right) {
//             int sum = nums[left] + nums[right];
//             if (sum == target) {
//                 return true;
//             } else if (sum < target) {
//                 left++;
//             } else {
//                 right--;
//             }
//         }
//         return false;
//     }
// }


    //here indexes are not lost after sorting
    public static int[] twoSumTwoPointer(int[] nums, int target) {
        int n = nums.length;
        int[][] arr = new int[n][2]; // {value, index}
        for (int i = 0; i < n; i++) {
            arr[i][0] = nums[i];
            arr[i][1] = i;
        }

        Arrays.sort(arr, (a, b) -> a[0] - b[0]); // sort by value

        int left = 0, right = n - 1;
        while (left < right) {
            int sum = arr[left][0] + arr[right][0];
            if (sum == target) {
                return new int[]{arr[left][1], arr[right][1]};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{}; // no solution
    }

    // -------------------- Test Cases --------------------
    public static void main(String[] args) {
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;

        int[] nums2 = {3, 2, 4};
        int target2 = 6;

        int[] nums3 = {3, 3};
        int target3 = 6;

        System.out.println("---- HashMap Solution ----");
        System.out.println(Arrays.toString(twoSumHashMap(nums1, target1))); // [0,1]
        System.out.println(Arrays.toString(twoSumHashMap(nums2, target2))); // [1,2]
        System.out.println(Arrays.toString(twoSumHashMap(nums3, target3))); // [0,1]

        System.out.println("---- Two Pointer Solution ----");
        System.out.println(Arrays.toString(twoSumTwoPointer(nums1, target1))); // [0,1]
        System.out.println(Arrays.toString(twoSumTwoPointer(nums2, target2))); // [1,2]
        System.out.println(Arrays.toString(twoSumTwoPointer(nums3, target3))); // [0,1]
    }
}
