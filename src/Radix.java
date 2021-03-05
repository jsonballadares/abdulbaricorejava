package src;

public class Radix {
    public static void main(String[] args) {
        String bin = "010101";
        String oct = "12356";
        String hex = "A25B";
        String dec = "25978";

        String str = dec;

        if (str.matches("[01]+")) {
            System.out.println("binary radix = 2");
        } else if (str.matches("[0-7]+")) {
            System.out.println("octal radix = 8");
        } else if (str.matches("[0-9]+")) {
            System.out.println("decimal radix = 10");
        } else if (str.matches("[0-9A-F]+")) {
            System.out.println("hexa-decimal radix = 16");
        } else {
            System.out.println("not a number");
        }

    }
}
