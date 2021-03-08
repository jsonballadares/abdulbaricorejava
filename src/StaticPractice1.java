package src;

class Test3 {
    static {
        System.out.println("Block 1");
    }

    static {
        System.out.println("Block 2");
    }
}

public class StaticPractice1 {

    /*
     * static { System.out.println("Block 1"); }
     */

    public static void main(String[] args) {
        // Test t=new Test();
        System.out.println("Main");
        Test3 t = new Test3();
        Test3 t2 = new Test3();
    }

    /*
     * static { System.out.println("Block 2"); }
     */

}
