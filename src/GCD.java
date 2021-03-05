package src;

public class GCD {
    public static void main(String[] args) {
        System.out.println(gcd(25, 15));
        System.out.println(gcd(35, 56));
    }

    public static int gcd(int x, int y) {
        if (x == y) {
            return x;
        } else if (x > y) {
            return gcd(x - y, y);
        } else {
            return gcd(x, y - x);
        }
    }
}
