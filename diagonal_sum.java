import java.util.*;

public class DiagonalSum {
    public static int calcSum(int matrix[][]) {
        int sum = 0;
        // Primary diagonal
        for (int i = 0, j = 0; i < matrix.length; i++, j++) {
            sum += matrix[i][j];
        }

        // Secondary diagonal
        for (int j = matrix.length - 1, i = 0; j >= 0; j--, i++) {
            if (i == j) {
                continue;
            }
            sum += matrix[i][j];
        }

        return sum;
    }

    public static void main(String args[]) {
        int matrix[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        int sum = calcSum(matrix);
        System.out.println("Sum of diagonals: " + sum);
    }
}
