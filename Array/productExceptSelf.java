<<<<<<< HEAD
/*Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.

 

Example 1:
Input: nums = [1,2,3,4]
Output: [24,12,8,6]

Example 2:
Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]
 

Constraints:

2 <= nums.length <= 105
-30 <= nums[i] <= 30
The input is generated such that answer[i] is guaranteed to fit in a 32-bit integer.
 

Follow up: Can you solve the problem in O(1) extra space complexity? (The output array does not count as extra space for space complexity analysis.)
 */

import java.util.Arrays;

public class productExceptSelf {

    // Function to return the product array
    public static int[] ProductExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];

        // Step 1: Compute prefix products
        answer[0] = 1;
        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] * nums[i - 1];
        }

        // Step 2: Multiply with suffix products on the fly
        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            answer[i] = answer[i] * suffix;
            suffix *= nums[i];
        }

        return answer;
    }

    // Utility method to run test cases
    public static void runTest(int[] nums, int[] expected) {
        int[] result = ProductExceptSelf(nums);
        System.out.println("Input:    " + Arrays.toString(nums));
        System.out.println("Expected: " + Arrays.toString(expected));
        System.out.println("Output:   " + Arrays.toString(result));
        System.out.println(resultEquals(result, expected) ? " Passed\n" : " Failed\n");
    }

    // Method to compare result and expected arrays
    private static boolean resultEquals(int[] a, int[] b) {
        return Arrays.equals(a, b);
    }

    // Main method to run all test cases
    public static void main(String[] args) {
        runTest(new int[]{1, 2, 3, 4}, new int[]{24, 12, 8, 6});
        runTest(new int[]{-1, 1, 0, -3, 3}, new int[]{0, 0, 9, 0, 0});
        runTest(new int[]{5, 5, 5}, new int[]{25, 25, 25});
        runTest(new int[]{2, 3}, new int[]{3, 2});
        runTest(new int[]{0, 0}, new int[]{0, 0});
    }
}
=======
/*Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.

 

Example 1:
Input: nums = [1,2,3,4]
Output: [24,12,8,6]

Example 2:
Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]
 

Constraints:

2 <= nums.length <= 105
-30 <= nums[i] <= 30
The input is generated such that answer[i] is guaranteed to fit in a 32-bit integer.
 

Follow up: Can you solve the problem in O(1) extra space complexity? (The output array does not count as extra space for space complexity analysis.)
 */

import java.util.Arrays;

class productExceptSelf {
    public int[] productExceptSelf_funcn(int[] nums) {
        int n = nums.length;
        
        // Arrays to store prefix and suffix products
        int[] left = new int[n];
        int[] right = new int[n];
        
        // Compute prefix products
        left[0] = 1; // No elements to the left of the first element
        for (int i = 1; i < n; i++) {
            left[i] = left[i - 1] * nums[i - 1];
        }
        
        // Compute suffix products
        right[n - 1] = 1; // No elements to the right of the last element
        for (int i = n - 2; i >= 0; i--) {
            right[i] = right[i + 1] * nums[i + 1];
        }
        
        // Compute final answer array
        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            answer[i] = left[i] * right[i];
        }
        
        return answer;
    }
}
>>>>>>> 7aece136fd9e9013a752b4bd1e9acd5458be2b36
