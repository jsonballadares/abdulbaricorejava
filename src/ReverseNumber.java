package src;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int number = n;
        int reverse = 0;
        scanner.nextLine();
        while (n != 0) {
            reverse = (reverse * 10) + n % 10;
            n = n / 10;
        }

        System.out.println(number + " reversed is " + reverse);

        scanner.close();
    }
}
