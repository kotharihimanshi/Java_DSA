// Question:
// You are given a non-negative floating point number rounded to two decimal places celsius, that denotes the temperature in Celsius.
// You should convert Celsius into Kelvin and Fahrenheit and return it as an array ans = [kelvin, fahrenheit].
// Return the array ans. Answers within 10^-5 of the actual answer will be accepted.
//
// Note that:
// Kelvin = Celsius + 273.15
// Fahrenheit = Celsius * 1.80 + 32.00
//
// Example 1:
// Input: celsius = 36.50
// Output: [309.65000, 97.70000]
//
// Example 2:
// Input: celsius = 122.11
// Output: [395.26000, 251.79800]

import java.util.Arrays;

public class TemperatureConversion {

    // Function to convert Celsius into Kelvin and Fahrenheit
    public double[] convertTemperature(double celsius) {
        double kelvin = celsius + 273.15;
        double fahrenheit = celsius * 1.80 + 32.00;
        return new double[]{kelvin, fahrenheit};
    }

    // Main method to test the solution
    public static void main(String[] args) {
        TemperatureConversion obj = new TemperatureConversion();

        // Test Case 1
        double celsius1 = 36.50;
        System.out.println("Input: " + celsius1);
        System.out.println("Output: " + Arrays.toString(obj.convertTemperature(celsius1)));
        // Expected Output: [309.65000, 97.70000]

        // Test Case 2
        double celsius2 = 122.11;
        System.out.println("\nInput: " + celsius2);
        System.out.println("Output: " + Arrays.toString(obj.convertTemperature(celsius2)));
        // Expected Output: [395.26000, 251.79800]

        // Test Case 3
        double celsius3 = 0.0;
        System.out.println("\nInput: " + celsius3);
        System.out.println("Output: " + Arrays.toString(obj.convertTemperature(celsius3)));
        // Expected Output: [273.15000, 32.00000]
    }
}
