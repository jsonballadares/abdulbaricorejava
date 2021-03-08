package src;

public class Overridding {
    public static void main(String[] args) {
        Super s = new Super();
        s.display();
        Sub sub = new Sub();
        sub.display();
        Super r = new Sub();
        r.display();

    }
}
