import java.util.Scanner;

/**
 * KeybRead
 */
public class KeybRead {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter 2 no: ");
        a = scanner.nextInt();
        b = scanner.nextInt();
        scanner.nextLine();
        c = a + b;
        System.out.println("Sum is " + c);

        System.out.println("May I know your name ");
        String name = scanner.nextLine();
        System.out.println("Welcome Mr/Miss " + name);

    }
}