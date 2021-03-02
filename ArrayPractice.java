import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] arr = { 3, 9, 7, 8, 12, 6, 15, 5, 4, 10 };
        System.out.println(sum(arr));
        System.out.println(search(arr, 6));
        System.out.println(max(arr));
        System.out.println(secondLargest(arr));
    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int x : arr) {
            sum += x;
        }
        return sum;
    }

    public static boolean search(int[] arr, int num) {
        int index = 0;
        for (int x : arr) {
            if (num == x) {
                System.out.println(x + " index: " + index);
                return true;
            }
            index++;
        }
        return false;
    }

    public static int max(int[] arr) {
        int max = Integer.MIN_VALUE;
        int index = 0;
        int maxIndex = 0;
        for (int x : arr) {
            if (x > max) {
                max = x;
                maxIndex = index;
            }
            index++;
        }
        System.out.println(max + " index: " + maxIndex);
        return max;
    }

    public static int secondLargest(int[] arr) {
        int max1 = Integer.MIN_VALUE;
        int max2 = max1;

        for (int x : arr) {
            if (x > max1) {
                max2 = max1;
                max1 = x;
            } else if (x > max2)
                max2 = x;
        }
        return max2;
    }
}
