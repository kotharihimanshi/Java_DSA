import java.util.*;

public class SeperateDigitsinArray {

    // Method to separate digits
    public int[] separateDigits(int[] nums) {
        // First, count total digits to know result array size
        int totalDigits = 0;
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            
            while (temp > 0) {
                totalDigits++;
                temp /= 10;
            }
        }

        // Create result array
        int[] result = new int[totalDigits];
        int index = totalDigits - 1;

        // Fill result array from end to start
        for (int i = nums.length - 1; i >= 0; i--) {
            int num = nums[i];

           

            // Extract digits
            while (num > 0) {
                result[index--] = num % 10;
                num /= 10;
            }
        }
        return result;
    }

    // Main method to test
    public static void main(String[] args) {
        Solution obj = new Solution();

        // Test case 1
        int[] nums1 = {13, 25, 83, 77};
        System.out.println("Input: " + Arrays.toString(nums1));
        System.out.println("Output: " + Arrays.toString(obj.separateDigits(nums1)));
        System.out.println();

        // Test case 2
        int[] nums2 = {7, 1, 3, 9};
        System.out.println("Input: " + Arrays.toString(nums2));
        System.out.println("Output: " + Arrays.toString(obj.separateDigits(nums2)));
        System.out.println();

        // Test case 3
        int[] nums3 = {100, 0, 5};
        System.out.println("Input: " + Arrays.toString(nums3));
        System.out.println("Output: " + Arrays.toString(obj.separateDigits(nums3)));
        System.out.println();

        // Test case 4
        int[] nums4 = {10921};
        System.out.println("Input: " + Arrays.toString(nums4));
        System.out.println("Output: " + Arrays.toString(obj.separateDigits(nums4)));
        System.out.println();
    }
}
