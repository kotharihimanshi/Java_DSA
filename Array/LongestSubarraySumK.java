public class LongestSubarraySumK {

    public static int longestSubarray(int[] nums, int k) {
        int left = 0, right = 0;
        int sum = nums[0];
        int maxLen = 0;
        int n = nums.length;

        while (right < n) {
            // Shrink window if sum > k
            while (left <= right && sum > k) {
                sum -= nums[left];
                left++;
            }

            // Check if we found a sum equal to k
            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }

            // Expand window
            right++;
            if (right < n) {
                sum += nums[right];
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        // Test case 1
        int[] nums1 = {10, 5, 2, 7, 1, 9};
        int k1 = 15;
        System.out.println("Test Case 1 Output: " + longestSubarray(nums1, k1)); // Expected: 4

        // Test case 2
        int[] nums2 = {-3, 2, 1}; // Will only work correctly if all numbers >= 0
        int k2 = 6;
        System.out.println("Test Case 2 Output: " + longestSubarray(nums2, k2)); // Expected: 0

        // Test case 3
        int[] nums3 = {1, 2, 3, 4, 5};
        int k3 = 9;
        System.out.println("Test Case 3 Output: " + longestSubarray(nums3, k3)); // Expected: 2 ([4,5])

        // Test case 4
        int[] nums4 = {4, 1, 1, 1, 2, 3, 5};
        int k4 = 5;
        System.out.println("Test Case 4 Output: " + longestSubarray(nums4, k4)); // Expected: 4
    }
}
