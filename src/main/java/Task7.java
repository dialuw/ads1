import java.util.Scanner;

public class Task7 {

    public static void fillSpiral(int[][] matrix, int start, int size, int num) {
        if (size <= 0) {
            return;
        }

        for (int i = 0; i < size; i++) {
            matrix[start][start + i] = num++;
        }

        for (int i = 1; i < size; i++) {
            matrix[start + i][start + size - 1] = num++;
        }

        for (int i = size - 2; i >= 0; i--) {
            matrix[start + size - 1][start + i] = num++;
        }

        for (int i = size - 2; i > 0; i--) {
            matrix[start + i][start] = num++;
        }

        fillSpiral(matrix, start + 1, size - 2, num);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size of matrix (n): ");
        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];
        fillSpiral(matrix, 0, n, 1);

        System.out.println("\nSpiral matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%4d", matrix[i][j]);
            }
            System.out.println();
        }

        scanner.close();
    }
}