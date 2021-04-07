package src;

public class GenericDemo<T> {
    T[] data = (T[]) new Object[3];

    public static void main(String[] args) {
        GenericDemo<String> gd = new GenericDemo<>();
        gd.data[0] = "hi";
        gd.data[1] = "jason";
        gd.data[2] = "balladares";

        for (String x : gd.data) {
            System.out.println(x);
        }
    }
}
