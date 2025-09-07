import java.lang.Math;

class gcd {
    /**
     * Computes the GCD of the sum of the first n odd numbers and the sum of the first n even numbers.
     * The sum of the first n odd numbers is n^2.
     * The sum of the first n even numbers is n * (n + 1).
     *
     * We need to find GCD(n^2, n * (n + 1)).
     * We can factor out n, so the problem simplifies to n * GCD(n, n + 1).
     * The GCD of any two consecutive integers (like n and n + 1) is always 1.
     * Therefore, the result is n * 1, which is simply n.
     *
     * @param n The number of odd and even numbers to sum.
     * @return The GCD of the two sums.
     */

     //SOLUTION 1
    public int gcdOfOddEvenSums(int n) {
        // The mathematical simplification shows that the GCD is simply n.
        return n;
    }

    //SOLUTION 2

//     class Solution {
//     public int gcdOfOddEvenSums(int n) {
//         int odd = n * n;
//         int even = n * ( n + 1);
//         while(odd > 0 && even > 0 ){
//             if(odd > even){ 
//                 odd = odd % even;
//             }
//             else{
//                 even = even % odd;
//             }
//             if(odd == 0) return even;
           
//         }
//          return odd;
        

        
//     }
// }

    public static void main(String[] args) {
        gcd solution = new gcd();

        // Test cases based on the problem description.
        // Example 1: n = 4
        int n1 = 4;
        System.out.println("Input: n = " + n1);
        int sumOdd1 = n1 * n1; // 1 + 3 + 5 + 7 = 16
        int sumEven1 = n1 * (n1 + 1); // 2 + 4 + 6 + 8 = 20
        int gcdResult1 = solution.gcdOfOddEvenSums(n1);
        System.out.println("Sum of first " + n1 + " odd numbers = " + sumOdd1);
        System.out.println("Sum of first " + n1 + " even numbers = " + sumEven1);
        System.out.println("GCD(" + sumOdd1 + ", " + sumEven1 + ") = " + gcdResult1);
        System.out.println("Expected Output: " + n1);
        System.out.println("--------------------");

        // Example 2: n = 5
        int n2 = 5;
        System.out.println("Input: n = " + n2);
        int sumOdd2 = n2 * n2; // 1 + 3 + 5 + 7 + 9 = 25
        int sumEven2 = n2 * (n2 + 1); // 2 + 4 + 6 + 8 + 10 = 30
        int gcdResult2 = solution.gcdOfOddEvenSums(n2);
        System.out.println("Sum of first " + n2 + " odd numbers = " + sumOdd2);
        System.out.println("Sum of first " + n2 + " even numbers = " + sumEven2);
        System.out.println("GCD(" + sumOdd2 + ", " + sumEven2 + ") = " + gcdResult2);
        System.out.println("Expected Output: " + n2);
        System.out.println("--------------------");
        
        // Additional Test Case: n = 10
        int n3 = 10;
        System.out.println("Input: n = " + n3);
        int sumOdd3 = n3 * n3;
        int sumEven3 = n3 * (n3 + 1);
        int gcdResult3 = solution.gcdOfOddEvenSums(n3);
        System.out.println("Sum of first " + n3 + " odd numbers = " + sumOdd3);
        System.out.println("Sum of first " + n3 + " even numbers = " + sumEven3);
        System.out.println("GCD(" + sumOdd3 + ", " + sumEven3 + ") = " + gcdResult3);
        System.out.println("Expected Output: " + n3);
    }
}
