package src;

public class Parent {

    public Parent() {
        System.out.println("Parent Constrcutor");
        System.out.println("Non-Param of parent");
    }

    Parent(int x) {
        System.out.println("Param of parent " + x);
    }

    public static void main(String[] args) {
        Child c = new Child(20, 12);

    }
}
