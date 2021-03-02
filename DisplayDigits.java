import java.util.Scanner;

public class DisplayDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        while (n != 0) {
            System.out.println("Digit: " + n % 10);
            n = n / 10;
        }
        scanner.close();
    }
}
