package src;

public class GenericMethod {

    public static <E extends Number> void show(E[] list) {
        for (E element : list) {
            System.out.println(element.toString());
        }
    }

    static void fun(MyArray<?> obj) {
        System.out.println(obj.toString());
    }

    public static void main(String[] args) {
        // show(new String[] { "hi", "jason" });
        show(new Integer[] { 1, 2 });
    }
}
