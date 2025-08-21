public class MaxConsecutiveOnesTest {
    static class Solution {
        public int findMaxConsecutiveOnes(int[] nums) {
            int maxi = 0;
            int cnt = 0;

            for (int i = 0; i < nums.length; i++) { // arrays use length
                if (nums[i] == 1) {
                    cnt++;
                    maxi = Math.max(maxi, cnt); // use Math.max
                } else {
                    cnt = 0;
                }
            }
            return maxi;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        // Test case 1
        int[] nums1 = {1, 1, 0, 1, 1, 1};
        System.out.println("Output 1: " + sol.findMaxConsecutiveOnes(nums1)); // Expected 3

        // Test case 2
        int[] nums2 = {1, 0, 1, 1, 0, 1};
        System.out.println("Output 2: " + sol.findMaxConsecutiveOnes(nums2)); // Expected 2

        // Test case 3
        int[] nums3 = {0, 0, 0, 0};
        System.out.println("Output 3: " + sol.findMaxConsecutiveOnes(nums3)); // Expected 0

        // Additional test case
        int[] nums4 = {1, 1, 1, 1, 1};
        System.out.println("Output 4: " + sol.findMaxConsecutiveOnes(nums4)); // Expected 5
    }
}
