import java.util.Scanner;

import javax.swing.text.AbstractDocument.LeafElement;

/**
 * Expression
 */
public class Expression {

    public static void printAreaOfTriangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the base of the triangle: ");
        double base = scanner.nextDouble();
        System.out.print("What is the height of the triangle: ");
        double height = scanner.nextDouble();
        System.out.println("The are of the triangle is: " + (0.5 * base * height));
        scanner.close();
    }

    public static void printAreaOfTriangleUsingSides() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is side a: ");
        double a = scanner.nextDouble();
        System.out.print("What is side b: ");
        double b = scanner.nextDouble();
        System.out.print("What is side c: ");
        double c = scanner.nextDouble();
        double sum = (a + b + c) * 0.5;
        double answer = Math.sqrt(sum * (sum - a) * (sum - b) * (sum - c));
        System.out.println("The are of the triangle is: " + answer);
        scanner.close();
    }

    public static void printQuadraticCoefficients() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is a: ");
        double a = scanner.nextDouble();
        System.out.print("What is b: ");
        double b = scanner.nextDouble();
        System.out.print("What is c: ");
        double c = scanner.nextDouble();
        double sqrt = Math.pow(b, 2.0) - (4.0 * a * c);
        double r1 = (-b + Math.sqrt(sqrt)) / (2.0 * a);
        double r2 = (-b - Math.sqrt(sqrt)) / (2.0 * a);
        System.out.println("r1: " + r1);
        System.out.println("r2: " + r2);
    }

    public static void printCubiod() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the length of the cubiod: ");
        double length = scanner.nextDouble();
        System.out.print("What is the height of the cubiod: ");
        double height = scanner.nextDouble();
        System.out.print("What is the breadth of the cubiod: ");
        double breadth = scanner.nextDouble();
        double top = length * height;
        double side = breadth * height;
        double bottom = length * breadth;
        double volume = length * breadth * height;
        double area = 2 * (top + bottom + side);

        System.out.println("Total Area:" + area);
        System.out.println("Total Volume:" + volume);
        scanner.close();
    }

    public static void main(String[] args) {
        printCubiod();
    }
}