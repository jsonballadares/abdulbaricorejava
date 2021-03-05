package src;

public class VarArgs {
    public static void show(int... A) {
        for (int x : A) {
            System.out.println(x);
        }
    }

    public static void show(String... names) {
        for (String x : names) {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        show("jason", "balladares", "json");
        show(1, 2, 2, 3, 4, 5, 6, 7, 8);
        show(new int[] { 1, 2, 3, 4, 5, 6, 7 });
    }
}
