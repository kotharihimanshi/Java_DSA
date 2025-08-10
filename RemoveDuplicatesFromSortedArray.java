<<<<<<< HEAD
public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums, int n) {
        if (n == 0) {
            return 0;
        }
        int i = 0;
        for (int j = 1; j < n; j++) {
            if (nums[i] != nums[j]) {
                nums[i + 1] = nums[j];
                i++;
            }
        }
        return i + 1;
    }

    // Optional main method to test
    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray solution = new RemoveDuplicatesFromSortedArray();

        int[] nums1 = {1, 1, 2};
        int length1 = solution.removeDuplicates(nums1, nums1.length);
        System.out.println("Unique count: " + length1);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < length1; i++) {
            System.out.print(nums1[i] + " ");
        }
        System.out.println();

        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int length2 = solution.removeDuplicates(nums2, nums2.length);
        System.out.println("Unique count: " + length2);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < length2; i++) {
            System.out.print(nums2[i] + " ");
        }
        System.out.println();
    }
}
=======
public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums, int n) {
        if (n == 0) {
            return 0;
        }
        int i = 0;
        for (int j = 1; j < n; j++) {
            if (nums[i] != nums[j]) {
                nums[i + 1] = nums[j];
                i++;
            }
        }
        return i + 1;
    }

    // Optional main method to test
    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray solution = new RemoveDuplicatesFromSortedArray();

        int[] nums1 = {1, 1, 2};
        int length1 = solution.removeDuplicates(nums1, nums1.length);
        System.out.println("Unique count: " + length1);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < length1; i++) {
            System.out.print(nums1[i] + " ");
        }
        System.out.println();

        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int length2 = solution.removeDuplicates(nums2, nums2.length);
        System.out.println("Unique count: " + length2);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < length2; i++) {
            System.out.print(nums2[i] + " ");
        }
        System.out.println();
    }
}
>>>>>>> 7aece136fd9e9013a752b4bd1e9acd5458be2b36
