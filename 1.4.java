import java.util.Scanner;
import java.util.Random;

public class MatrixMinor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Введіть розмір матриці:10 ");
        int size = scanner.nextInt();
        int[][] matrix = new int[size][size];

        System.out.println("Матриця:10");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = random.nextInt(10);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("Введіть номер рядка для мінору (0-10" + (size - 1) + "): ");
        int row = scanner.nextInt();
        System.out.print("Введіть номер стовпця для мінору (0-10" + (size - 1) + "): ");
        int col = scanner.nextInt();

        int[][] minor = getMinor(matrix, row, col);

        System.out.println("Мінор:2");
        for (int i = 0; i < minor.length; i++) {
            for (int j = 0; j < minor[i].length; j++) {
                System.out.print(minor[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] getMinor(int[][] matrix, int row, int col) {
        int n = matrix.length - 1;
        int[][] minor = new int[n][n];
        for (int i = 0, mi = 0; i < matrix.length; i++) {
            if (i == row) continue;
            for (int j = 0, mj = 0; j < matrix[i].length; j++) {
                if (j == col) continue;
                minor[mi][mj++] = matrix[i][j];
            }
            mi++;
        }
        return minor;
    }
}
