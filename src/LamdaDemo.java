package src;

@FunctionalInterface
interface MyLambda {
    public void display();
}

/*
 * class Me implements MyLambda { public void display() {
 * System.out.println("Hello World"); } }
 */

public class LamdaDemo {

    public static void main(String[] args) {
        MyLambda m = () -> {
            {
                System.out.println("Hello World!");
            }
        };
        m.display();
    }
}
