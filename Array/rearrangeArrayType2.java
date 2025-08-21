import java.util.*;

public class rearrangeArrayType2 {

    // Rearrange array when positives and negatives are NOT equal
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public static int[] rearrangeArray(int[] nums) {
        int n = nums.length;

        // Step 1: Separate positives and negatives into two arrays
        int[] pos = new int[n];
        int[] neg = new int[n];
        int p = 0, q = 0;

        for (int num : nums) {
            if (num >= 0) {
                pos[p++] = num;
            } else {
                neg[q++] = num;
            }
        }

        // Step 2: Merge alternatively into ans[]
        int[] ans = new int[n];
        int i = 0, j = 0, k = 0;

        // Alternate positives and negatives while both are available
        while (i < p && j < q) {
            ans[k++] = pos[i++];
            ans[k++] = neg[j++];
        }

        // Step 3: Add remaining positive numbers (if any)
        while (i < p) {
            ans[k++] = pos[i++];
        }

        // Step 4: Add remaining negative numbers (if any)
        while (j < q) {
            ans[k++] = neg[j++];
        }

        return ans;
    }

    // Utility method to print arrays
    public static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    // Main method to test different cases
    public static void main(String[] args) {
        // Test Case 1: Equal positives and negatives
        int[] nums1 = {3, 1, -2, -5, 2, -4};
        System.out.println("Input: " + Arrays.toString(nums1));
        System.out.print("Output: ");
        printArray(rearrangeArray(nums1));

        // Test Case 2: More positives
        int[] nums2 = {3, 1, -2, -5, 2, 4, 6};
        System.out.println("\nInput: " + Arrays.toString(nums2));
        System.out.print("Output: ");
        printArray(rearrangeArray(nums2));

        // Test Case 3: More negatives
        int[] nums3 = {-1, -2, -3, 4, 5};
        System.out.println("\nInput: " + Arrays.toString(nums3));
        System.out.print("Output: ");
        printArray(rearrangeArray(nums3));

        // Test Case 4: All positives
        int[] nums4 = {1, 2, 3, 4};
        System.out.println("\nInput: " + Arrays.toString(nums4));
        System.out.print("Output: ");
        printArray(rearrangeArray(nums4));

        // Test Case 5: All negatives
        int[] nums5 = {-1, -2, -3};
        System.out.println("\nInput: " + Arrays.toString(nums5));
        System.out.print("Output: ");
        printArray(rearrangeArray(nums5));
    }
}
