package src;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers do you want: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum of " + n + " numbers is " + sum);

        scanner.close();
    }
}
