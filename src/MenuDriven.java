import java.util.Scanner;

public class MenuDriven {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 2 Numbers: ");
        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();
        scanner.nextLine();
        System.out.print("What operand?: ");
        String operand = scanner.nextLine();
        operand = operand.toLowerCase().trim();
        switch (operand) {
            case "add":
                System.out.println(numberOne + numberTwo);
                break;
            case "subtract":
                System.out.println(numberOne - numberTwo);
                break;
            case "divide":
                System.out.println(numberOne / numberTwo);
                break;
            case "multiply":
                System.out.println(numberOne * numberTwo);
                break;
            default:
                System.out.println("Invalid");
                break;
        }
    }
}
