<<<<<<< HEAD
/*
Problem:
Given a string s consisting of only the characters 'a' and 'b',
return true if every 'a' appears before every 'b' in the string.
Otherwise, return false.

Example 1:
Input: s = "aaabbb"
Output: true

Example 2:
Input: s = "abab"
Output: false

Example 3:
Input: s = "bbb"
Output: true
*/

public class CheckStringOrder {

    // Method to check if all 'a's come before all 'b's
    public boolean checkString(String s) {
        boolean seenB = false;
        for (char c : s.toCharArray()) {
            if (c == 'b') {
                seenB = true;
            } else if (c == 'a' && seenB) {
                return false; // Found 'a' after a 'b'
            }
        }
        return true;
    }

    // Main method to run test cases
    public static void main(String[] args) {
        CheckStringOrder obj = new CheckStringOrder();

        // Test cases
        String[] testCases = {
            "aaabbb", // true
            "abab",   // false
            "bbb",    // true
            "a",      // true
            "b",      // true
            "aaa",    // true
            "ba",     // false
            "",       // true (empty string is valid)
            "abba",   // false
            "aaabbba" // false
        };

        for (String test : testCases) {
            System.out.println("Input: \"" + test + "\" -> " + obj.checkString(test));
        }
    }
}
=======
/*
Problem:
Given a string s consisting of only the characters 'a' and 'b',
return true if every 'a' appears before every 'b' in the string.
Otherwise, return false.

Example 1:
Input: s = "aaabbb"
Output: true

Example 2:
Input: s = "abab"
Output: false

Example 3:
Input: s = "bbb"
Output: true
*/

public class CheckStringOrder {

    // Method to check if all 'a's come before all 'b's
    public boolean checkString(String s) {
        boolean seenB = false;
        for (char c : s.toCharArray()) {
            if (c == 'b') {
                seenB = true;
            } else if (c == 'a' && seenB) {
                return false; // Found 'a' after a 'b'
            }
        }
        return true;
    }

    // Main method to run test cases
    public static void main(String[] args) {
        CheckStringOrder obj = new CheckStringOrder();

        // Test cases
        String[] testCases = {
            "aaabbb", // true
            "abab",   // false
            "bbb",    // true
            "a",      // true
            "b",      // true
            "aaa",    // true
            "ba",     // false
            "",       // true (empty string is valid)
            "abba",   // false
            "aaabbba" // false
        };

        for (String test : testCases) {
            System.out.println("Input: \"" + test + "\" -> " + obj.checkString(test));
        }
    }
}
>>>>>>> fe0dcd5a5aa8dbe5d6832e1a6bca7d6e9ccdeb4b
