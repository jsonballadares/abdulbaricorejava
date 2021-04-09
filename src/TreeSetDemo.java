package src;

import java.util.*;

class Point implements Comparable {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "X: " + x + " Y: " + y;
    }

    @Override
    public int compareTo(Object o) {
        Point p = (Point) o;

        if (this.x < p.x) {
            return -1;
        } else if (this.x > p.x) {
            return 1;
        } else {
            if (this.y < p.y) {
                return -1;
            } else if (this.y > p.y) {
                return 1;
            } else {
                return 0;
            }
        }
    }

}

public class TreeSetDemo {

    public static void main(String[] args) {
        // TreeSet<Integer> ts = new TreeSet<>(List.of(10, 30, 50, 70, 10, 40));
        // ts.add(25);
        // ts.ceiling(55);
        // System.out.println(ts);

        TreeSet<Point> ts = new TreeSet<>();
        ts.add(new Point(1, 1));
        ts.add(new Point(5, 5));
        ts.add(new Point(5, 2));
        System.out.println(ts);
    }

}