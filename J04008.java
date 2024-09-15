//src/J04008.java

import java.util.Scanner;

public class J04008 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            Point x = new Point(sc.nextDouble(), sc.nextDouble());
            Point y = new Point(sc.nextDouble(), sc.nextDouble());
            Point z = new Point(sc.nextDouble(), sc.nextDouble());
            double d1 = x.distance(y);
            double d2 = x.distance(z);
            double d3 = y.distance(z);
            if (d1 <= 0 || d2 <= 0 || d3 <= 0 || d1 + d2 <= d3 || d1 + d3 <= d2 || d2 + d3 <= d1) {
                System.out.println("INVALID");
            } else {
                System.out.printf("%.3f", d1 + d2 + d3);
                System.out.println("");
            }
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
        double tmp1 = Math.pow(this.x - p.x, 2);
        double tmp2 = Math.pow(this.y - p.y, 2);
        return Math.sqrt(tmp1 + tmp2);
    }

    public static double distance(Point p1, Point p2) {
        double tmp1 = Math.pow(p1.x - p2.x, 2);
        double tmp2 = Math.pow(p1.y - p2.y, 2);
        return Math.sqrt(tmp1 + tmp2);
    }

    public String toString() {
        return this.x + " " + this.y;
    }
}

