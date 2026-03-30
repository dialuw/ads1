import java.util.Scanner;

public class Task6 {

    public static void reverseStrings(int n, Scanner scanner) {
        if (n == 0) {
            return;
        }

        String s = scanner.nextLine();
        reverseStrings(n - 1, scanner);
        System.out.println(s);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many strings? ");
        int n = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter " + n + " strings:");
        reverseStrings(n, scanner);

        scanner.close();
    }
}