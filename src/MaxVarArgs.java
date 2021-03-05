package src;

import java.util.Collection;
import java.util.Collections;

public class MaxVarArgs {
    public static int max(int... A) {
        if (A.length == 0) {
            return Integer.MIN_VALUE;
        }
        int max = A[0];
        for (int i = 0; i < A.length; i++) {
            if (A[i] > max) {
                max = A[i];
            }
        }
        return max;
    }

    public static double sum(double... A) {
        if (A.length == 0) {
            return -1.0;
        }
        double sum = A[0];
        for (int i = 1; i < A.length; i++) {
            sum += A[i];
        }
        return sum;
    }

    public static double discount(double... A) {
        double sum = sum(A);
        if (sum > 1000) {
            return 10.0;
        } else if (sum > 500) {
            return 5.0;
        } else {
            return 2.5;
        }
    }

    public static void main(String[] args) {
        System.out.println(max(1, 2, 3, 4, 5, 6, 7, 8));
        System.out.println(sum(1.0, 2.02, 3.0));
        System.out.println(discount(1.0, 2.0, 3.0));
    }

}
