package src;

/**
 * Circle
 */
public class Circle {
    private double radius;

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2.0 * Math.PI * radius;
    }

    public double circumference() {
        return perimeter();
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        Circle circle2 = new Circle();
        circle2.radius = 14;

        circle.radius = 7;

        System.out.println("Area: " + circle.area());
        System.out.println("Perimeter: " + circle.perimeter());
        System.out.println("Circumferemce: " + circle.circumference());

        System.out.println("Area2: " + circle2.area());
        System.out.println("Perimeter2: " + circle2.perimeter());
        System.out.println("Circumferemce2: " + circle2.circumference());
    }
}