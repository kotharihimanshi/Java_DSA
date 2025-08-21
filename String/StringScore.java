// You are given a string s. The score of a string is defined as the sum of the absolute difference between the ASCII values of adjacent characters.

// Return the score of s.

 

// Example 1:

// Input: s = "hello"

// Output: 13

// Explanation:

// The ASCII values of the characters in s are: 'h' = 104, 'e' = 101, 'l' = 108, 'o' = 111. So, the score of s would be |104 - 101| + |101 - 108| + |108 - 108| + |108 - 111| = 3 + 7 + 0 + 3 = 13.

// Example 2:

// Input: s = "zaz"

// Output: 50

// Explanation:

// The ASCII values of the characters in s are: 'z' = 122, 'a' = 97. So, the score of s would be |122 - 97| + |97 - 122| = 25 + 25 = 50.

 

public class StringScore {

    // Function to calculate score of a string
    public static int calculateScore(String s) {
        int score = 0;

        // Traverse string and calculate absolute differences
        for (int i = 1; i < s.length(); i++) {
            score += Math.abs(s.charAt(i) - s.charAt(i - 1));
        }

        return score;
    }

    // Test the solution
    public static void main(String[] args) {
        // Test Case 1
        String s1 = "hello";
        System.out.println("Input: " + s1);
        System.out.println("Output: " + calculateScore(s1)); // Expected: 13

        // Test Case 2
        String s2 = "zaz";
        System.out.println("\nInput: " + s2);
        System.out.println("Output: " + calculateScore(s2)); // Expected: 50

        // Test Case 3
        String s3 = "abc";
        System.out.println("\nInput: " + s3);
        System.out.println("Output: " + calculateScore(s3)); // Expected: 2

        // Test Case 4
        String s4 = "aaaa";
        System.out.println("\nInput: " + s4);
        System.out.println("Output: " + calculateScore(s4)); // Expected: 0
    }
}
