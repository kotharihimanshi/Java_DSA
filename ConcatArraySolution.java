
/*
 * Problem Statement:
 * Given an integer array nums of length n, create an array ans of length 2n 
 * where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n.
 * Specifically, ans is the concatenation of two nums arrays.
 * 
 * Examples:
 * Input: nums = [1,2,1]
 * Output: [1,2,1,1,2,1]
 * 
 * Input: nums = [1,3,2,1]
 * Output: [1,3,2,1,1,3,2,1]
 */

public class ConcatArraySolution {

    // Method to concatenate the array with itself
    public static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];

        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }

        return ans;
    }

    // Main method to test the function
    public static void main(String[] args) {
        // Example 1
        int[] nums1 = {1, 2, 1};
        int[] result1 = getConcatenation(nums1);
        System.out.print("Output 1: ");
        for (int num : result1) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Example 2
        int[] nums2 = {1, 3, 2, 1};
        int[] result2 = getConcatenation(nums2);
        System.out.print("Output 2: ");
        for (int num : result2) {
            System.out.print(num + " ");
        }
    }
}
