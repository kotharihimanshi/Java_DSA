import java.util.Scanner;

public class factorial{

    // Recursive helper method to calculate factorial
    private static int factorial_helper(int n) {
        if (n == 0 || n == 1)
            return 1;
        return n * factorial_helper(n - 1);
    }

    // Wrapper method to handle edge cases
    public static int Factorial(int num) {
        if (num < 0) {
            return -1; // Error case
        }
        
        return factorial_helper(num);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int result = Factorial(n);

        
            System.out.println("Factorial is: " + result);
        

        sc.close();
    }
}
