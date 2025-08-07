import java.util.Scanner;

class NQueen_leetcode51 {
    static int solCtr;

    public static void solveNQueen(int n) {
        int[] board = new int[n];
        for (int i = 0; i < n; i++) board[i] = -1;
        solCtr = 0;
        solveHelper(board, n, 0);
    }

    private static void solveHelper(int[] board, int n, int row) {
        if (row == n) {
            System.out.printf("Solution #%d:\n", ++solCtr);
            printBoard(board);
            return;
        }

        for (int col = 0; col < n; col++) {
            if (isSafe(board, row, col)) {
                board[row] = col;
                solveHelper(board, n, row + 1);
                board[row] = -1; // backtrack
            }
        }
    }

    private static boolean isSafe(int[] board, int row, int col) {
        for (int i = 0; i < row; i++) {
            if (board[i] == col || Math.abs(i - row) == Math.abs(board[i] - col)) {
                return false;
            }
        }
        return true;
    }

    private static void printBoard(int[] board) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board.length; col++) {
                System.out.print(board[row] == col ? "Q " : "- ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of queens: ");
        int n = sc.nextInt();
        solveNQueen(n);
    }
}
