package src;

public class MyArray<E> {
    E[] arr;
    private int length;
    private int count;

    public MyArray(int length) {
        this.length = length;
        this.arr = (E[]) new Object[length];
    }

    public void append(E element) {
        if (arr.length > count) {
            arr[count++] = element;
        } else {
            System.out.println("The Array is Full!");
        }
    }

    @Override
    public String toString() {
        String output = "";
        for (E e : arr) {
            output += e.toString() + "\n";
        }
        return output;
    }
}

class MyArrayRunner {

    public static void main(String[] args) {
        MyArray<String> myArr = new MyArray<>(4);
        myArr.append("jason");
        myArr.append("jackson");
        myArr.append("will");
        myArr.append("bill");
        myArr.append("bill");
    }
}
