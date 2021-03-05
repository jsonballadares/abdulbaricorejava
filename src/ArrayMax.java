public class ArrayMax {
    public static int max(int[] A) {
        int max = Integer.MIN_VALUE;
        for (int x : A) {
            if (x > max) {
                max = x;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] A = { 8, 3, 15, 9, 7 };
        System.out.println("Max: " + max(A));
    }
}
