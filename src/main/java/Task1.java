import java.util.Scanner;

public class Task1 {

    public static int sumSquares(int n) {
        if (n == 1) {
            return 1;
        }
        return n * n + sumSquares(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        int result = sumSquares(n);
        System.out.println("Sum of squares from 1 to " + n + " = " + result);

        scanner.close();
    }
}