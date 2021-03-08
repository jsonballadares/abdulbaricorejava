package src;

class Outer2 {
    int x = 10;
    static int y = 20;

    static class My {
        public void show() {
            System.out.println(y);
        }
    }

}

public class LocalInner {
    public static void main(String[] args) {
        Outer2.My m = new Outer2.My();
        m.show();

    }

}