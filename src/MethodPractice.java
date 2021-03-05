import java.util.Arrays;

/**
 * MethodPractice
 */
public class MethodPractice {

    public static void inc(int x) {
        x++;
        System.out.println(x);
    }

    public static int max(int x, int y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }

    public static void change(int[] arr, int index, int x) {
        arr[index] = x;
    }

    public static void change2(int x, int value) {
        x = value;
    }

    public static void main(String[] args) {
        int[] A = { 2, 4, 6, 8, 10 };
        change(A, 2, 20);
        System.out.println(Arrays.toString(A));
        int x = 10;
        change2(x, 20);
        System.out.println(x);
    }
}