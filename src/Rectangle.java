package src;

public class Rectangle extends Shape {
    private double length;
    private double breadth;

    public Rectangle() {
        length = 1;
        breadth = 1;
    }

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public Rectangle(double s) {
        this.length = this.breadth = s;
    }

    public double getLength() {
        return length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setLength(double l) {
        if (l >= 0)
            length = l;
        else
            length = 0;
    }

    public void setBreadth(double b) {
        if (b >= 0)
            breadth = b;
        else
            breadth = 0;
    }

    public double area() {
        // return length*breadth;
        return getLength() * getBreadth();
    }

    public double perimeter() {
        return 2 * (getLength() + getBreadth());
    }

    public boolean isSquare() {
        return getLength() == getBreadth();

    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.length = 5.5;
        r1.breadth = 5.5;
        System.out.println("Area r1: " + r1.area());
        System.out.println("Perimeter r1: " + r1.perimeter());
        System.out.println("Is r1 a square: " + r1.isSquare());
    }
}
