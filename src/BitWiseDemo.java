package src;

public class BitWiseDemo {
    public static void main(String[] args) {
        int x = 0b1010;
        int y = 0b0110;
        int z;

        z = x & y;

        System.out.println(String.format("%32s", Integer.toBinaryString(x)));
        System.out.println(String.format("%32s", Integer.toBinaryString(z)));
    }
}
