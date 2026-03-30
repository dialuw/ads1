import java.util.Scanner;

public class Task4 {

    public static int sumPowers(int b, int n) {
        if (n == 0) {
            return 1;
        }
        return (int) Math.pow(b, n) + sumPowers(b, n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter base (b): ");
        int b = scanner.nextInt();

        System.out.print("Enter exponent (n): ");
        int n = scanner.nextInt();

        int result = sumPowers(b, n);
        System.out.println("Sum of powers = " + result);

        scanner.close();
    }
}