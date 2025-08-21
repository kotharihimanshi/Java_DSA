public class MissingNumberTest {
    static class Solution {
        public int missingNumber(int[] nums) {
            int n = nums.length;
            int xor1 = 0, xor2 = 0;

            for (int i = 0; i < n; i++) {
                xor2 ^= nums[i];   // XOR of given numbers
                xor1 ^= (i + 1);   // XOR of 1..n
            }

            return xor1 ^ xor2; // missing number
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        // Test case 1
        int[] nums1 = {3, 0, 1};
        System.out.println("Output 1: " + sol.missingNumber(nums1)); // Expected 2

        // Test case 2
        int[] nums2 = {0, 1};
        System.out.println("Output 2: " + sol.missingNumber(nums2)); // Expected 2

        // Test case 3
        int[] nums3 = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        System.out.println("Output 3: " + sol.missingNumber(nums3)); // Expected 8

        // Additional test case
        int[] nums4 = {0};
        System.out.println("Output 4: " + sol.missingNumber(nums4)); // Expected 1
    }
}
