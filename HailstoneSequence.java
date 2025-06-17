public class HailstoneSequence {

    // Method to calculate the length of the hailstone sequence
    public static int hailstoneLength(long n) {
        int length = 1;
        while (n != 1) {
            if (n % 2 == 0)
                n /= 2;
            else
                n = 3 * n + 1;
            length++;
        }
        return length;
    }

    public static void main(String[] args) {
        int maxLength = 0;
        int numberWithMaxLength = 0;

        for (int i = 1; i < 100000; i++) {
            int length = hailstoneLength(i);
            if (length > maxLength) {
                maxLength = length;
                numberWithMaxLength = i;
            }
        }

        System.out.println("Number with the longest hailstone sequence under 100000: " + numberWithMaxLength);
        System.out.println("Length of the sequence: " + maxLength);
    }
}
