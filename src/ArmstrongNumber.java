package src;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int number = n;
        scanner.nextLine();
        double cubedSum = 0;
        while (n != 0) {
            cubedSum += (n % 10) * (n % 10) * (n % 10);
            n = n / 10;
        }
        System.out.println(number + " is armstrong: " + (cubedSum == number));
        scanner.close();
    }
}
