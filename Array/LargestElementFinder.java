<<<<<<< HEAD
public class LargestElementFinder {

    // Method to find the largest element in the array
    public int largestElement(int[] nums) {
        int largest = nums[0];
        for (int i = 1; i < nums.length; i++) {  // start from 1 as largest is initialized with nums[0]
            if (nums[i] > largest) {
                largest = nums[i];
            }
        }
        return largest;
    }   

    // Main method to run test cases
    public static void main(String[] args) {
        LargestElementFinder finder = new LargestElementFinder();

        // Test case 1
        int[] nums1 = {3, 3, 6, 1};
        System.out.println("Largest in [3, 3, 6, 1]: " + finder.largestElement(nums1));  // Expected output: 6

        // Test case 2
        int[] nums2 = {3, 3, 0, 99, -40};
        System.out.println("Largest in [3, 3, 0, 99, -40]: " + finder.largestElement(nums2));  // Expected output: 99

        // Additional test cases
        int[] nums3 = {-10, -3, -50, -1};
        System.out.println("Largest in [-10, -3, -50, -1]: " + finder.largestElement(nums3));  // Expected output: -1

        int[] nums4 = {7};
        System.out.println("Largest in [7]: " + finder.largestElement(nums4));  // Expected output: 7
    }
}
=======
public class LargestElementFinder {

    // Method to find the largest element in the array
    public int largestElement(int[] nums) {
        int largest = nums[0];
        for (int i = 1; i < nums.length; i++) {  // start from 1 as largest is initialized with nums[0]
            if (nums[i] > largest) {
                largest = nums[i];
            }
        }
        return largest;
    }

    // Main method to run test cases
    public static void main(String[] args) {
        LargestElementFinder finder = new LargestElementFinder();

        // Test case 1
        int[] nums1 = {3, 3, 6, 1};
        System.out.println("Largest in [3, 3, 6, 1]: " + finder.largestElement(nums1));  // Expected output: 6

        // Test case 2
        int[] nums2 = {3, 3, 0, 99, -40};
        System.out.println("Largest in [3, 3, 0, 99, -40]: " + finder.largestElement(nums2));  // Expected output: 99

        // Additional test cases
        int[] nums3 = {-10, -3, -50, -1};
        System.out.println("Largest in [-10, -3, -50, -1]: " + finder.largestElement(nums3));  // Expected output: -1

        int[] nums4 = {7};
        System.out.println("Largest in [7]: " + finder.largestElement(nums4));  // Expected output: 7
    }
}
>>>>>>> 7aece136fd9e9013a752b4bd1e9acd5458be2b36
