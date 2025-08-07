public class ArraySortedChecker {

    /*
     * Given an array of integers nums, write a method to check
     * if the array is sorted in non-decreasing order (i.e., each element
     * is greater than or equal to the previous element).
     * 
     * Examples:
     * Input: nums = [1, 2, 2, 4, 5]
     * Output: true
     * Explanation: The array is sorted in non-decreasing order.
     * 
     * Input: nums = [5, 3, 4, 2, 1]
     * Output: false
     * Explanation: The array is not sorted.
     */


    /**
     * Checks if the input array is sorted in non-decreasing order.
     * @param arr The input integer array.
     * @return True if sorted in non-decreasing order, else false.
     */
    public static boolean isSorted(int[] arr) {
        if (arr == null || arr.length <= 1) {
            // An empty or single-element array is considered sorted
            return true;
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        // Test case 1: Sorted array
        int[] test1 = {1, 2, 2, 4, 5};
        System.out.println("Test1: " + isSorted(test1));  // Expected: true

        // Test case 2: Unsorted array
        int[] test2 = {5, 3, 4, 2, 1};
        System.out.println("Test2: " + isSorted(test2));  // Expected: false

        // Test case 3: Empty array
        int[] test3 = {};
        System.out.println("Test3: " + isSorted(test3));  // Expected: true

        // Test case 4: Single element array
        int[] test4 = {10};
        System.out.println("Test4: " + isSorted(test4));  // Expected: true

        // Test case 5: Strictly increasing
        int[] test5 = {1, 3, 5, 7, 9};
        System.out.println("Test5: " + isSorted(test5));  // Expected: true

        // Test case 6: Strictly decreasing
        int[] test6 = {9, 7, 5, 3, 1};
        System.out.println("Test6: " + isSorted(test6));  // Expected: false
    }

}
