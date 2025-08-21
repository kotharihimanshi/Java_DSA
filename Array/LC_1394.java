// Given an array of integers arr, a lucky integer is an integer that has a frequency in the array equal to its value.

// Return the largest lucky integer in the array. If there is no lucky integer return -1.

 

// Example 1:

// Input: arr = [2,2,3,4]
// Output: 2
// Explanation: The only lucky number in the array is 2 because frequency[2] == 2.
// Example 2:

// Input: arr = [1,2,2,3,3,3]
// Output: 3
// Explanation: 1, 2 and 3 are all lucky numbers, return the largest of them.
// Example 3:

// Input: arr = [2,2,2,3,3]
// Output: -1
// Explanation: There are no lucky numbers in the array.
 

// Constraints:

// 1 <= arr.length <= 500
// 1 <= arr[i] <= 500

import java.util.Arrays;

public class LC_1394 {
    public int findLucky(int[] arr) {
        Arrays.sort(arr); // Step 1: Sort the array
        
        int maxLucky = -1;
        int i = 0;
        
        while (i < arr.length) {
            int current = arr[i];
            int count = 0;

            // Step 2: Count frequency of current number
            while (i < arr.length && arr[i] == current) {
                count++;
                i++;
            }

            // Step 3: Check if it's a lucky number
            if (count == current) {
                maxLucky = Math.max(maxLucky, current);
            }
        }

        return maxLucky;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] arr1 = {2, 2, 3, 4};
        System.out.println(sol.findLucky(arr1)); // Output: 2

        int[] arr2 = {1, 2, 2, 3, 3, 3};
        System.out.println(sol.findLucky(arr2)); // Output: 3

        int[] arr3 = {2, 2, 2, 3, 3};
        System.out.println(sol.findLucky(arr3)); // Output: -1
    }
}
