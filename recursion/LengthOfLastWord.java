/**
 * Question:
 * Given a string s consisting of words and spaces, return the length of the last word in the string.
 * A word is a maximal substring consisting of non-space characters only.
 *
 * Example:
 * Input: "Hello World"
 * Output: 5
 *
 * Input: "   fly me   to   the moon  "
 * Output: 4
 *
 * Input: "luffy is still joyboy"
 * Output: 6
 */

public class LengthOfLastWord {

    // Solution class
    static class Solution {
        public int lengthOfLastWord(String s) {
            // Trim leading and trailing whitespaces
            String trimmed = s.trim();
            
            // Split the string by space
            String[] words = trimmed.split(" ");
            
            // Return the length of the last word
            return words[words.length - 1].length();
        }
    }

    // Main method with test cases
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test Case 1
        String s1 = "Hello World";
        System.out.println("Test Case 1: " + solution.lengthOfLastWord(s1)); // Expected: 5

        // Test Case 2
        String s2 = "   fly me   to   the moon  ";
        System.out.println("Test Case 2: " + solution.lengthOfLastWord(s2)); // Expected: 4

        // Test Case 3
        String s3 = "luffy is still joyboy";
        System.out.println("Test Case 3: " + solution.lengthOfLastWord(s3)); // Expected: 6

        // Test Case 4
        String s4 = "a";
        System.out.println("Test Case 4: " + solution.lengthOfLastWord(s4)); // Expected: 1

        // Test Case 5
        String s5 = "   ";
        System.out.println("Test Case 5: " + solution.lengthOfLastWord(s5)); // Expected: 0 (edge case)
    }
}
