import java.util.Scanner;

public class Task2 {

    public static int sumArray(int[] arr, int n) {
        if (n == 0) {
            return 0;
        }
        return arr[n - 1] + sumArray(arr, n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("How many elements to sum? ");
        int n = scanner.nextInt();

        int result = sumArray(arr, n);
        System.out.println("Sum of first " + n + " elements = " + result);

        scanner.close();
    }
}