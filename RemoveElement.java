/*
 * Question:
 * Given an integer array nums and an integer val, 
 * remove all occurrences of val in nums in-place. 
 * The order of the elements may be changed. 
 * Then return the number of elements in nums which are not equal to val.
 * 
 * Consider the number of elements in nums which are not equal to val be k,
 * to get accepted, you need to do the following things:
 * 
 * - Change the array nums such that the first k elements of nums contain 
 *   the elements which are not equal to val.
 * - The remaining elements of nums are not important as well as the size of nums.
 * - Return k.
 */

public class RemoveElement {

    // Method to remove all occurrences of val and return new length
    public static int removeElement(int[] nums, int val) {
        int k = 0; // index for placing non-val elements
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    // Method to print array up to index k
    public static void printArray(int[] nums, int k) {
        System.out.print("[");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i]);
            if (i < k - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    // Main method with test cases
    public static void main(String[] args) {
        int[] nums1 = {3, 2, 2, 3};
        int val1 = 3;
        int k1 = removeElement(nums1, val1);
        System.out.println("Test Case 1:");
        System.out.println("Expected k: 2");
        System.out.println("Actual k: " + k1);
        System.out.print("Modified array: ");
        printArray(nums1, k1);
        System.out.println();

        int[] nums2 = {0,1,2,2,3,0,4,2};
        int val2 = 2;
        int k2 = removeElement(nums2, val2);
        System.out.println("Test Case 2:");
        System.out.println("Expected k: 5");
        System.out.println("Actual k: " + k2);
        System.out.print("Modified array: ");
        printArray(nums2, k2);
        System.out.println();

        int[] nums3 = {1,1,1,1};
        int val3 = 1;
        int k3 = removeElement(nums3, val3);
        System.out.println("Test Case 3:");
        System.out.println("Expected k: 0");
        System.out.println("Actual k: " + k3);
        System.out.print("Modified array: ");
        printArray(nums3, k3);
    }
}
