package src;

import java.util.Arrays;
import java.util.Collections;

public class Reverse {
    public static int reverse(int x) {
        StringBuilder str = new StringBuilder(String.valueOf(x));
        str = str.reverse();
        return Integer.parseInt(str.toString());
    }

    public static void reverse(int[] arr) {
        for (int i = 0, j = arr.length - 1; i < arr.length / 2; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

    }

    public static void main(String[] args) {
        int x = 236;
        int[] arr = { 1, 2, 3, 4, 5 };
        reverse(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(reverse(x));

    }
}
