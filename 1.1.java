public class PyramidArray {
    public static void main(String[] args) {
        int rows = 5;
        int[][] pyramid = new int[rows][];

        // Створення зубчастого масиву
        for (int i = 0; i < rows; i++) {
            pyramid[i] = new int[i + 1];
            for (int j = 0; j <= i; j++) {
                pyramid[i][j] = j + 1;
            }
        }

        System.out.println("Прямий порядок:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < pyramid[i].length; j++) {
                System.out.print(pyramid[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nЗворотний порядок:");
        for (int i = rows - 1; i >= 0; i--) {
            for (int j = pyramid[i].length - 1; j >= 0; j--) {
                System.out.print(pyramid[i][j] + " ");
            }
            System.out.println();
        }
    }
}
