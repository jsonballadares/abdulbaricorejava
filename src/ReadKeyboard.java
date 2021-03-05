package src;

import java.util.Scanner;

public class ReadKeyboard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useRadix(2);
        int x, y, z;
        System.out.println("Enter 2 Numbers: ");
        x = scanner.nextInt();
        y = scanner.nextInt();
        z = x + y;
        System.out.print("x + y = " + z);

    }
}
