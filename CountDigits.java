import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int number = n;
        scanner.nextLine();
        int digits = 0;
        while (n != 0) {
            digits++;
            n = n / 10;
        }
        System.out.println(number + " has " + digits + " digits.");
        scanner.close();
    }
}
