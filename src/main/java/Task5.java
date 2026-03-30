import java.util.Scanner;

public class Task5 {

    public static void reverseInput(int n, Scanner scanner) {
        if (n == 0) {
            return;
        }

        int x = scanner.nextInt();
        reverseInput(n - 1, scanner);
        System.out.print(x + " ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers? ");
        int n = scanner.nextInt();

        System.out.println("Enter " + n + " numbers:");
        reverseInput(n, scanner);

        scanner.close();
    }
}