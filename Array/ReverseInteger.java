/*
Problem: Reverse Integer (LeetCode 7)

Given a signed 32-bit integer x, return x with its digits reversed.
If reversing x causes the value to go outside the signed 32-bit integer 
range [-2^31, 2^31 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers.

Examples:
Input: x = 123   -> Output: 321
Input: x = -123  -> Output: -321
Input: x = 120   -> Output: 21
*/

import java.util.*;

public class ReverseInteger {

    // ---------------- Brute Force (String Conversion) ----------------
    // Time: O(n), Space: O(n)
    // public static int reverseBrute(int x) {
    //     boolean negative = x < 0;
    //     String s = Integer.toString(Math.abs(x));
    //     StringBuilder sb = new StringBuilder(s);
    //     String revStr = sb.reverse().toString();

    //     try {
    //         int rev = Integer.parseInt(revStr);
    //         return negative ? -rev : rev;
    //     } catch (NumberFormatException e) {
    //         return 0; // overflow case
    //     }
    // }

    // ---------------- Better (Math, but may overflow) ----------------
    // Time: O(log n), Space: O(1)
    // public static int reverseBetter(int x) {
    //     int rev = 0;
    //     while (x != 0) {
    //         int digit = x % 10;
    //         x /= 10;
    //         rev = rev * 10 + digit; // can overflow!
    //     }
    //     return rev;
    // }

    // ---------------- Optimal (Math + Overflow Check) ----------------
    // Time: O(log n), Space: O(1)
    public static int reverseOptimal(int x) {
        int rev = 0;

        while (x != 0) {
            int digit = x % 10;
            x /= 10;

            // Overflow check before multiplying
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }

            rev = rev * 10 + digit;
        }

        return rev;
    }

    // ---------------- Test Cases ----------------
    public static void main(String[] args) {
        int[] testCases = {123, -123, 120, 0, 1534236469, -2147483648};

        for (int test : testCases) {
            System.out.println("Input: " + test);
            System.out.println("Brute Force (String): " + reverseBrute(test));
            System.out.println("Better (Math, unsafe): " + reverseBetter(test));
            System.out.println("Optimal (Math + safe): " + reverseOptimal(test));
            System.out.println("------------------------------------------------");
        }
    }
}
// 