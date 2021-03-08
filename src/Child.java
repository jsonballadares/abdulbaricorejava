package src;

class Child extends Parent {

    public Child() {
        System.out.println("Child Constructor");
        System.out.println("Non-Param of child");
    }

    public Child(int y) {
        System.out.println("Param of child");
    }

    public Child(int x, int y) {
        super(x);
        System.out.println("2 param of child " + y);
    }
}