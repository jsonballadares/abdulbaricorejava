package src;

import java.util.Scanner;

public class FactorialOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What factorial: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("The factorial of " + n + " is " + factorial);
        scanner.close();

    }
}
