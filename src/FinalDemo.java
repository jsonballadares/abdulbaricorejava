package src;

class Test5 {
    public final void show() {
        System.out.println();
    }
}

class Test9 extends Test5 {
    // public void show(){}
    // gives error as final methods cannot be overloaded.
}

public class FinalDemo {

    /*
     * final float PI;
     * 
     * public FinalDemo() { PI=3.1425f; }
     */

    public static void main(String[] args) {

        /*
         * final float PI; PI=3.1425f; System.out.println(PI);
         */

    }

}