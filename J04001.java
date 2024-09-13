//src/Main.java

import java.util.*;
import java.math.*;

public class J04001 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            double x1 = sc.nextDouble();
            double y1 = sc.nextDouble();
            double x2 = sc.nextDouble();
            double y2 = sc.nextDouble();
            Point a = new Point(x1, y1);
            Point b = new Point(x2, y2);
            System.out.printf("%.4f", a.distance(b));
            System.out.println("");
        }
    }
}

//src/Point.java

class Point {

    private double x;
    private double y;

    public Point() {

    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance(Point p) {
        double tmp1 = this.x - p.x;
        double tmp2 = this.y - p.y;
        return Math.sqrt(Math.pow(tmp1, 2) + Math.pow(tmp2, 2));
    }

    public double distance(Point p1, Point p2) {
        double tmp1 = p1.x - p2.x;
        double tmp2 = p1.y - p2.y;
        return Math.sqrt(Math.pow(tmp1, 2) + Math.pow(tmp2, 2));
    }

    public String toString() {
        return x + " " + y;
    }
}

