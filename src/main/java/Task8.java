import java.util.Scanner;

public class Task8 {

    public static void generate(int[] arr, int position, int n, int k) {
        if (position == n) {
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 1; i <= k; i++) {
            arr[position] = i;
            generate(arr, position + 1, n, k);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length of sequence (n): ");
        int n = scanner.nextInt();

        System.out.print("Enter max value (k): ");
        int k = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("\nAll sequences:");
        generate(arr, 0, n, k);

        scanner.close();
    }
}