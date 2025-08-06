public class SecondLargestFinder {

    public int secondLargestElement(int[] nums) {
        if (nums == null || nums.length < 2) {
            // If array is null or has less than 2 elements, no second largest exists
            return -1;
        }

        int large = nums[0];
        int slarge = -1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > large) {
                slarge = large;
                large = nums[i];
            } else if (nums[i] < large && nums[i] > slarge) {
                slarge = nums[i];
            }
        }

        return slarge;
    }

    public static void main(String[] args) {
        SecondLargestFinder finder = new SecondLargestFinder();

        // Test case 1
        int[] nums1 = {8, 8, 7, 6, 5};
        System.out.println("Second largest in [8, 8, 7, 6, 5]: " + finder.secondLargestElement(nums1)); // Output: 7

        // Test case 2
        int[] nums2 = {10, 10, 10, 10, 10};
        System.out.println("Second largest in [10, 10, 10, 10, 10]: " + finder.secondLargestElement(nums2)); // Output: -1

        // Additional test cases
        int[] nums3 = {1, 2, 3, 4, 5};
        System.out.println("Second largest in [1, 2, 3, 4, 5]: " + finder.secondLargestElement(nums3)); // Output: 4

        int[] nums4 = {5};
        System.out.println("Second largest in [5]: " + finder.secondLargestElement(nums4)); // Output: -1

        int[] nums5 = {5, 5, 6};
        System.out.println("Second largest in [5, 5, 6]: " + finder.secondLargestElement(nums5)); // Output: 5
    }
}
