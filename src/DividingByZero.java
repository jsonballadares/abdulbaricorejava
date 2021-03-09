package src;

public class DividingByZero {
    public static void main(String[] args) {
        int a, b, c;
        try {
            a = 10;
            b = 0;
            c = a / b;
            System.out.println("Result is " + c);
        } catch (ArithmeticException e) {
            System.out.println("Could not Divide: " + e);
        }
        System.out.println("Bye");
    }
}
