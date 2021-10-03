
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Nqueen {

    final int N = 8;

    Scanner input = new Scanner(System.in);


  

    void printSolution(int board[][]) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(" " + board[i][j]
                        + " ");
            }
            System.out.println();
        }
    }

    boolean isSafe(int board[][], int row, int col) {
        int i, j;

        /* Check this row on left side */
        for (i = 0; i < col; i++) {
            if (board[row][i] == 1) {
                return false;
            }
        }

        /* Check upper diagonal on left side */
        for (i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        /* Check lower diagonal on left side */
        for (i = row, j = col; j >= 0 && i < N; i++, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        return true;
    }

    boolean solveNQUtil(int board[][], int col) {

        if (col >= N) {
            return true;
        }

            /* Place 1 queen */
        if (col == 0) {
            System.out.println("\nAt the first column "
                    + "\nEnter the number of the row that you want to place the queen "
                    + "\nFrom 1 to 8\n");
            int x = input.nextInt();
            x--;
            if (isSafe(board, x, col)) {

                board[x][0] = 1 ;
                printSolution(board);

                if (solveNQUtil(board, col + 1) == true) {
                    return true;
                }

                board[x][col] = 0;
            }

            return false;
        }

        /* Place 2 queen */
        if (col == 1) {
            System.out.println("\nAt the first column "
                    + "\nEnter the number of the row that you want to place the queen "
                    + "\nFrom 1 to 8\n");
            int x = input.nextInt();
            x--;
            if (isSafe(board, x, col)) {

                board[x][1] = 1 ;
                printSolution(board);

                if (solveNQUtil(board, col + 1) == true) {
                    return true;
                }

                board[x][col] = 0;
            }

            return false;
        }

        /* Place 3 queen */
        if (col == 2) {
            System.out.println("\nAt the first column "
                    + "\nEnter the number of the row that you want to place the queen "
                    + "\nFrom 1 to 8\n");
            int x = input.nextInt();
            x--;
            if (isSafe(board, x, col)) {

                board[x][2] = 1 ;
                printSolution(board);

                if (solveNQUtil(board, col + 1) == true) {
                    return true;
                }

                board[x][col] = 0;
            }

            return false;
        }

        /* Place 4 queen */
        if (col == 3) {
            System.out.println("\nAt the first column "
                    + "\nEnter the number of the row that you want to place the queen "
                    + "\nFrom 1 to 8\n");
            int x = input.nextInt();
            x--;
            if (isSafe(board, x, col)) {

                board[x][3] = 1 ;
                printSolution(board);

                if (solveNQUtil(board, col + 1) == true) {
                    return true;
                }

                board[x][col] = 0;
            }

            return false;
        }

        /* Place 5 queen */
        if (col == 4) {
            System.out.println("\nAt the first column "
                    + "\nEnter the number of the row that you want to place the queen "
                    + "\nFrom 1 to 8\n");
            int x = input.nextInt();
            x--;
            if (isSafe(board, x, col)) {

                board[x][4] = 1 ;
                printSolution(board);

                if (solveNQUtil(board, col + 1) == true) {
                    return true;
                }

                board[x][col] = 0;
            }

            return false;
        }

        /* Place 6 queen */
        if (col == 5) {
            System.out.println("\nAt the first column "
                    + "\nEnter the number of the row that you want to place the queen "
                    + "\nFrom 1 to 8\n");
            int x = input.nextInt();
            x--;
            if (isSafe(board, x, col)) {

                board[x][5] = 1 ;
                printSolution(board);

                if (solveNQUtil(board, col + 1) == true) {
                    return true;
                }

                board[x][col] = 0;
            }

            return false;
        }

        /* Place 7 queen */
        if (col == 6) {
            System.out.println("\nAt the first column "
                    + "\nEnter the number of the row that you want to place the queen "
                    + "\nFrom 1 to 8\n");
            int x = input.nextInt();
            x--;
            if (isSafe(board, x, col)) {

                board[x][6] = 1 ;
                printSolution(board);

                if (solveNQUtil(board, col + 1) == true) {
                    return true;
                }

                board[x][col] = 0;
            }

            return false;
        }

        /* Place 8 queen */
        if (col == 7) {
            System.out.println("\nAt the first column "
                    + "\nEnter the number of the row that you want to place the queen "
                    + "\nFrom 1 to 8\n");
            int x = input.nextInt();
            x--;
            if (isSafe(board, x, col)) {

                board[x][7] = 1 ;
                printSolution(board);

                if (solveNQUtil(board, col + 1) == true) {
                    return true;
                }

                board[x][col] = 0;
            }

            return false;
        }

        /* place rest of the queens */
        for (int i = 0; i < N; i++) {

            if (isSafe(board, i, col)) {

                board[i][col] = 1;

                if (solveNQUtil(board, col + 1) == true) {
                    return true;
                }

                board[i][col] = 0;
            }
        }

        /* If the queen can not be placed in any row in 
           this colum col, then return false */
        return false;
    }

    boolean solveNQ() {
        int board[][]
                = {{0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},};

        if (solveNQUtil(board, 0) == false) {
            System.out.print("Solution does not exist");
            return false;
        }

        printSolution(board);
        return true;
    }

    public static void main(String args[]) {
        JOptionPane.showMessageDialog(null, "The aim of N-Queens Problem is to place N queens on an N x N chessboard, in a way so that no queen is in conflict with the others.", "N-Queens Problem", 1);
        Nqueen Queen = new Nqueen();
        Queen.solveNQ();
    }
}
