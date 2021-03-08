package src;

abstract public class Super {
    public void display() {
        System.out.println("Super Class Display");
    }

    public void meth1() {
        System.out.println("Meth1 of Super");
    }

    abstract public void meth2();

    public static void main(String[] args) {
        Sub sup = new Sub();
        sup.meth1();
        sup.meth2();
        sup.meth3();
    }
}
