package src;

public abstract class Shape {
    abstract public double perimeter();

    abstract public double area();

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.setLength(10);
        r.setBreadth(5);
        Shape s = r;
        System.out.println("Area: " + s.area());
    }
}
