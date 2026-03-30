import java.util.Scanner;

public class Task3 {

    public static int sumNatural(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumNatural(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        int result = sumNatural(n);
        System.out.println("Sum of 1 to " + n + " = " + result);

        scanner.close();
    }
}