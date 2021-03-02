import java.util.Scanner;

public class SimpleTasks {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = scanner.nextInt();
        if (n % 2 == 0) {
            System.out.println("number is even");
        } else {
            System.out.println("number is odd");
        }
        int age;
        System.out.println("What is your age?");
        age = scanner.nextInt();
        if (age >= 14 && age <= 55) {
            System.out.println("Young");
        } else {
            System.out.println("Not Young");
        }

        int m1, m2, m3;
        int total;
        int average;

        System.out.print("whats is m1: ");
        m1 = scanner.nextInt();

        System.out.print("whats is m2: ");
        m2 = scanner.nextInt();

        System.out.print("whats is m3: ");
        m3 = scanner.nextInt();

        total = m1 + m2 + m3;
        average = total / 3;

        if (average >= 70) {
            System.out.println("A");
        } else if (average >= 60 && average < 70) {
            System.out.println("B");
        } else if (average >= 50 && average < 60) {
            System.out.println("C");
        } else if (average >= 40 && average < 50) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

        scanner.close();
    }
}
