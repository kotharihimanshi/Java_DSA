// Question:
// You are given a large integer represented as an integer array digits, 
// where each digits[i] is the ith digit of the integer. 
// The digits are ordered from most significant to least significant in left-to-right order. 
// The large integer does not contain any leading 0's.
// Increment the large integer by one and return the resulting array of digits.

import java.util.Arrays;

public class PlusOne {

    // Function to increment the number by one
    public static int[] plusOne(int[] digits) {
        int n = digits.length;

        // Start from the last digit and move backwards
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++; // No carry needed
                return digits;
            }
            digits[i] = 0; // Set to 0 if digit becomes 10, carry over to next
        }

        // If all digits were 9, we need an extra digit at the front
        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }

    // Testing the solution
    public static void main(String[] args) {
        int[] digits1 = {1, 2, 3};
        int[] digits2 = {4, 3, 2, 1};
        int[] digits3 = {9};
        int[] digits4 = {9, 9, 9};

        System.out.println("Input: [1,2,3] -> Output: " + Arrays.toString(plusOne(digits1)));
        System.out.println("Input: [4,3,2,1] -> Output: " + Arrays.toString(plusOne(digits2)));
        System.out.println("Input: [9] -> Output: " + Arrays.toString(plusOne(digits3)));
        System.out.println("Input: [9,9,9] -> Output: " + Arrays.toString(plusOne(digits4)));
    }
}
