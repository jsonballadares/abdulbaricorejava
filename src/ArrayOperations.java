import java.util.Arrays;

public class ArrayOperations {
    public static void main(String[] args) {
        int[] arr = { 5, 9, 6, 10, 12, 7, 3, 5, 4, 2 };
        arr = new int[] { 5, 9, 6, 10, 12, 7, 0, 0, 0, 0 };
        arr = increaseSize(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] copy(int[] arr) {
        int[] copy = new int[arr.length];
        int index = 0;
        for (int x : arr) {
            copy[index++] = x;
        }
        return copy;
    }

    public static int[] increaseSize(int[] arr) {
        int[] copy = new int[arr.length * 2];
        int index = 0;
        for (int x : arr) {
            copy[index++] = x;
        }
        return copy;
    }

    public static int[] reverseCopy(int[] arr) {
        int[] copy = new int[arr.length];
        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            copy[j] = arr[i];
        }
        return copy;
    }

    public static void insert(int[] arr, int position, int value, int size) {
        for (int i = size; i >= position; i--) {
            arr[i] = arr[i - 1];
        }
        arr[position] = value;
    }

    public static void rotateLeft(int[] arr) {
        // cache overwritten value
        int first = arr[0];

        // shift elements one to the left
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        // overwrite last value
        arr[arr.length - 1] = first;
    }

    public static void rotateRight(int[] arr) {
        // cache overwritten value
        int last = arr[arr.length - 1];

        // shift elements one to the left
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        // overwrite last value
        arr[0] = last;
    }
}
