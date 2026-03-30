import java.util.Scanner;

public class Task10 {

    public static boolean isPowerOfTwo(int n) {
        if (n == 1) {
            return true;
        }
        if (n <= 0 || n % 2 != 0) {
            return false;
        }
        return isPowerOfTwo(n / 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        if (isPowerOfTwo(n)) {
            System.out.println(n + " is a power of two");
        } else {
            System.out.println(n + " is not a power of two");
        }

        System.out.println("\nChecking numbers from 0 to 32:");
        for (int i = 0; i <= 32; i++) {
            if (isPowerOfTwo(i)) {
                System.out.println(i + " is a power of two");
            } else {
                System.out.println(i + " is not a power of two");
            }
        }

        scanner.close();
    }
}