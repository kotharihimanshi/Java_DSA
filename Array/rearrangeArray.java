import java.util.*;

public class rearrangeArray {

    // ---------- Brute Force Solution ----------
    // Using two separate arrays for positive and negative numbers
    // Time Complexity: O(2n)
    // Space Complexity: O(n)
    // public static int[] rearrangeArrayBrute(int[] nums) {
    //     int n = nums.length;
    //     int[] pos = new int[n / 2];
    //     int[] neg = new int[n / 2];

    //     int p = 0, q = 0;
    //                               //p = pos index             q = neg index
    //     // Separate positive and negative numbers
    //     for (int i = 0; i < n; i++) {
    //         if (num > 0) {
    //             pos[p++] = num;
    //         } else {
    //             neg[q++] = num;
    //         }
    //     }

    //     // Merge alternatively into ans array
    //     int[] ans = new int[n];
    //     int i = 0, j = 0, k = 0;         //i = pos mergeing index  j = neg merging index   k = final array index

    //     while (i < pos.length && j < neg.length) {
    //         ans[k++] = pos[i++];
    //         ans[k++] = neg[j++];
    //     }

    //     return ans;
    // }

    // ---------- Optimal Solution ----------
    // Using direct placement with two pointers
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public static int[] rearrangeArrayOptimal(int[] nums) {
        int[] ans = new int[nums.length];
        int posIndex = 0, negIndex = 1;

        // Place positive at even indices and negative at odd indices
        for (int i = 0; i < nums.length; i++) {
            if (num > 0) {
                ans[posIndex] = num;
                posIndex += 2;
            } else {
                ans[negIndex] = num;
                negIndex += 2;
            }
        }

        return ans;
    }

    // ---------- Utility Method to Print Array ----------
    public static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    // ---------- Main Method for Testing ----------
    public static void main(String[] args) {
        // Test Case 1
        int[] nums1 = {3, 1, -2, -5, 2, -4};
        System.out.println("Input: " + Arrays.toString(nums1));
        System.out.print("Brute Force Output: ");
        printArray(rearrangeArrayBrute(nums1));
        System.out.print("Optimal Output: ");
        printArray(rearrangeArrayOptimal(nums1));

        // Test Case 2
        int[] nums2 = {-1, 1};
        System.out.println("\nInput: " + Arrays.toString(nums2));
        System.out.print("Brute Force Output: ");
        printArray(rearrangeArrayBrute(nums2));
        System.out.print("Optimal Output: ");
        printArray(rearrangeArrayOptimal(nums2));

        // Test Case 3
        int[] nums3 = {1, -1, 2, -2, 3, -3};
        System.out.println("\nInput: " + Arrays.toString(nums3));
        System.out.print("Brute Force Output: ");
        printArray(rearrangeArrayBrute(nums3));
        System.out.print("Optimal Output: ");
        printArray(rearrangeArrayOptimal(nums3));
    }
}
