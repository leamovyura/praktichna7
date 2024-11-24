import java.util.Scanner;

public class Determinant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[5][5];

        System.out.println("Введіть елементи матриці 5x5:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int det = determinant(matrix);

        System.out.println("Визначник матриці: " + det);
    }

    public static int determinant(int[][] mat) {
        if (mat.length == 2)
            return mat[0][0] * mat[1][1] - mat[0][1] * mat[1][0];

        int det = 0;
        for (int j = 0; j < mat[0].length; j++) {
            det += Math.pow(-1, j) * mat[0][j] * determinant(minor(mat, j));
        }
        return det;
    }

    public static int[][] minor(int[][] mat, int col) {
        int size = mat.length - 1;
        int[][] result = new int[size][size];
        for (int i = 1; i < mat.length; i++) {
            for (int j = 0, newCol = 0; j < mat[i].length; j++) {
                if (j == col) continue;
                result[i - 1][newCol++] = mat[i][j];
            }
        }
        return result;
    }
}
