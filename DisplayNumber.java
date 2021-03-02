import java.util.Scanner;

public class DisplayNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String number = scanner.nextLine();
        String reversed = reverse(number);
        System.out.println(reversed);

        for (char c : reversed.toCharArray()) {
            printNumber(c);
        }

        scanner.close();
    }

    public static String reverse(String number) {
        String reversed = "";
        for (int i = number.length() - 1; i >= 0; i--) {
            reversed += number.charAt(i) + "";
        }
        return reversed;
    }

    public static void printNumber(char n) {
        switch (n) {
            case '0':
                System.out.println("Zero");
                break;
            case '1':
                System.out.println("One");
                break;
            case '2':
                System.out.println("Two");
                break;
            case '3':
                System.out.println("Three");
                break;
            case '4':
                System.out.println("Four");
                break;
            case '5':
                System.out.println("Five");
                break;
            case '6':
                System.out.println("Six");
                break;
            case '7':
                System.out.println("Seven");
                break;
            case '8':
                System.out.println("Eight");
                break;
            case '9':
                System.out.println("Nine");
                break;
            default:
                System.out.println("Invalid");
                break;
        }
    }
}
