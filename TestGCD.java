<<<<<<< HEAD
import java.util.*;

class GCD {
    public int findGCD(int[] nums) {
        int min = nums[0];
        int max = nums[0];

        // Find minimum and maximum in the array
        for (int num : nums) {
            if (num < min) min = num;
            if (num > max) max = num;
        }

        return gcd(min, max);
    }

    // Euclidean algorithm to find GCD
    private int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}

// Test class
public class TestGCD {
    public static void main(String[] args) {
        GCD sol = new GCD();  // Correct class name is GCD

        // ✅ Test Case 1
        int[] nums1 = {2, 5, 6, 9, 10};
        System.out.println("Test Case 1: " + sol.findGCD(nums1));  // Output: 2

        // ✅ Test Case 2
        int[] nums2 = {3, 3};
        System.out.println("Test Case 2: " + sol.findGCD(nums2));  // Output: 3

        // ✅ Test Case 3
        int[] nums3 = {7, 14, 28, 56};
        System.out.println("Test Case 3: " + sol.findGCD(nums3));  // Output: 7

        // ✅ Test Case 4
        int[] nums4 = {5, 10, 15};
        System.out.println("Test Case 4: " + sol.findGCD(nums4));  // Output: 5

        // ✅ Test Case 5
        int[] nums5 = {8, 9};
        System.out.println("Test Case 5: " + sol.findGCD(nums5));  // Output: 1

        // ✅ Test Case 6
        int[] nums6 = {100};
        System.out.println("Test Case 6: " + sol.findGCD(nums6));  // Output: 100

        // ✅ Test Case 7
        int[] nums7 = {13, 26, 39};
        System.out.println("Test Case 7: " + sol.findGCD(nums7));  // Output: 13
    }
}
=======
import java.util.*;

class GCD {
    public int findGCD(int[] nums) {
        int min = nums[0];
        int max = nums[0];

        // Find minimum and maximum in the array
        for (int num : nums) {
            if (num < min) min = num;
            if (num > max) max = num;
        }

        return gcd(min, max);
    }

    // Euclidean algorithm to find GCD
    private int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}

// Test class
public class TestGCD {
    public static void main(String[] args) {
        GCD sol = new GCD();  // Correct class name is GCD

        // ✅ Test Case 1
        int[] nums1 = {2, 5, 6, 9, 10};
        System.out.println("Test Case 1: " + sol.findGCD(nums1));  // Output: 2

        // ✅ Test Case 2
        int[] nums2 = {3, 3};
        System.out.println("Test Case 2: " + sol.findGCD(nums2));  // Output: 3

        // ✅ Test Case 3
        int[] nums3 = {7, 14, 28, 56};
        System.out.println("Test Case 3: " + sol.findGCD(nums3));  // Output: 7

        // ✅ Test Case 4
        int[] nums4 = {5, 10, 15};
        System.out.println("Test Case 4: " + sol.findGCD(nums4));  // Output: 5

        // ✅ Test Case 5
        int[] nums5 = {8, 9};
        System.out.println("Test Case 5: " + sol.findGCD(nums5));  // Output: 1

        // ✅ Test Case 6
        int[] nums6 = {100};
        System.out.println("Test Case 6: " + sol.findGCD(nums6));  // Output: 100

        // ✅ Test Case 7
        int[] nums7 = {13, 26, 39};
        System.out.println("Test Case 7: " + sol.findGCD(nums7));  // Output: 13
    }
}
>>>>>>> 7aece136fd9e9013a752b4bd1e9acd5458be2b36
