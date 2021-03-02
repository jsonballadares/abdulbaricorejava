public class TwoDimensionalPractice {
    public static void main(String[] args) {
        int A[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int B[][] = { { 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } };
        int C[][] = multiplyMatrices(A, B);
        for (int[] x : C) {
            for (int y : x) {
                System.out.format("%02d ", y);
            }
            System.out.println();
        }
    }

    public static int[][] addMatrices(int[][] a, int[][] b) {
        int[][] c = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        return c;
    }

    public static int[][] multiplyMatrices(int[][] a, int[][] b) {
        int[][] c = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                int crossSum = 0;
                for (int k = 0; k < a.length; k++) {
                    crossSum += a[i][k] * b[k][j];
                }
                c[i][j] = crossSum;
            }
        }
        return c;
    }
}
