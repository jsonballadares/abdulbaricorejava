package src;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many terms do you desire?: ");
        long n = scanner.nextInt();
        scanner.nextLine();
        long first = 0;
        long second = 1;
        long next = 0;
        for (long i = 0; i < n; i++) {

            if (i == n - 1) {
                System.out.println(next);
            } else {
                System.out.print(next + ",");
                first = second;
                second = next;
            }
            next = first + second;
        }
        scanner.close();
    }
}
