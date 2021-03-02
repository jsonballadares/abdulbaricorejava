
public class Bitwise {
    public static void main(String[] args) {
        storeTwoInNibble();
    }

    public static void swapBitWise() {
        int a = 10;
        int b = -15;

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println(a);
        System.out.println(b);
    }

    public static void storeTwoInNibble() {
        int a = 9;
        int b = 12;
        byte c;

        c = (byte) (a << 4);
        c = (byte) (c | b);

        System.out.println((c & 0b11110000) >> 4);
        System.out.println((c & 0b00001111));
    }
}
