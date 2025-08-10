<<<<<<< HEAD
public class MoveZeroesToEnd {
    // Moves all zeroes to the end of the array in place
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int j = -1;
        // Find the index of the first 0
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                j = i;
                break;
            }
        }
        // If there are no zeroes, nothing to do
        if (j == -1) return;

        // Move non-zero elements forward
        for (int i = j + 1; i < n; i++) {
            if (nums[i] != 0) {
                // Swap nums[i] and nums[j]
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }

    // Utility function to print an array
    public static void printArray(int[] arr) {
        for (int num : arr)
            System.out.print(num + " ");
        System.out.println();
    }

    // Test cases
    public static void main(String[] args) {
        MoveZeroesToEnd solution = new MoveZeroesToEnd();

        int[] nums1 = {0, 1, 4, 0, 5, 2};
        solution.moveZeroes(nums1);
        System.out.print("Output 1: ");
        printArray(nums1); // Expected: [1, 4, 5, 2, 0, 0]

        int[] nums2 = {0, 0, 0, 1, 3, -2};
        solution.moveZeroes(nums2);
        System.out.print("Output 2: ");
        printArray(nums2); // Expected: [1, 3, -2, 0, 0, 0]

        int[] nums3 = {1, 2, 3};
        solution.moveZeroes(nums3);
        System.out.print("Output 3: ");
        printArray(nums3); // Expected: [1, 2, 3]

        int[] nums4 = {0, 0, 0};
        solution.moveZeroes(nums4);
        System.out.print("Output 4: ");
        printArray(nums4); // Expected: [0, 0, 0]
    }
}
=======
public class MoveZeroesToEnd {
    // Moves all zeroes to the end of the array in place
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int j = -1;
        // Find the index of the first 0
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                j = i;
                break;
            }
        }
        // If there are no zeroes, nothing to do
        if (j == -1) return;

        // Move non-zero elements forward
        for (int i = j + 1; i < n; i++) {
            if (nums[i] != 0) {
                // Swap nums[i] and nums[j]
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }

    // Utility function to print an array
    public static void printArray(int[] arr) {
        for (int num : arr)
            System.out.print(num + " ");
        System.out.println();
    }

    // Test cases
    public static void main(String[] args) {
        MoveZeroesToEnd solution = new MoveZeroesToEnd();

        int[] nums1 = {0, 1, 4, 0, 5, 2};
        solution.moveZeroes(nums1);
        System.out.print("Output 1: ");
        printArray(nums1); // Expected: [1, 4, 5, 2, 0, 0]

        int[] nums2 = {0, 0, 0, 1, 3, -2};
        solution.moveZeroes(nums2);
        System.out.print("Output 2: ");
        printArray(nums2); // Expected: [1, 3, -2, 0, 0, 0]

        int[] nums3 = {1, 2, 3};
        solution.moveZeroes(nums3);
        System.out.print("Output 3: ");
        printArray(nums3); // Expected: [1, 2, 3]

        int[] nums4 = {0, 0, 0};
        solution.moveZeroes(nums4);
        System.out.print("Output 4: ");
        printArray(nums4); // Expected: [0, 0, 0]
    }
}
>>>>>>> fe0dcd5a5aa8dbe5d6832e1a6bca7d6e9ccdeb4b
