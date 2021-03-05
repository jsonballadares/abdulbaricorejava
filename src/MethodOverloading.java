package src;

public class MethodOverloading {

    public static int max(int x, int y) {
        return (x > y) ? x : y;
    }

    public static float max(float x, float y) {
        return (x > y) ? x : y;
    }

    public static double max(double x, double y) {
        return (x > y) ? x : y;
    }

    public static void main(String[] args) {
        System.out.println(MethodOverloading.max(1, 2));
        System.out.println(MethodOverloading.max(1f, 2f));
        System.out.println(MethodOverloading.max(1.0, 2.0));

    }
}
