//src/J04002.java

import java.util.*;


public class J04002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectange r = new Rectange(sc.nextInt(), sc.nextInt(), sc.next());
        System.out.println(r);
    }
}

//src/Rectange.java

class Rectange {
    private double width;
    private double height;
    private static String color;
    
    public Rectange() {
        this.width = 1;
        this.height = 1;
    }

    public Rectange(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public static String getColor() {
        return color;
    }

    public static void setColor(String color) {
        Rectange.color = color;
    }
    
    public double findArea() {
        return this.height * this.width;
    }
    
    public double findPerimeter() {
        return 2*this.height + 2*this.width;
    }
    
    public String toString() {
        if (this.height <=0 || this.width <=0) {
            return "INVALID";
        }
        StringBuilder sb = new StringBuilder("");
        String res = this.color.trim();
        sb.append(Character.toUpperCase(res.charAt(0)));
        for (int i =1;i<res.length();i++) {
            sb.append(Character.toLowerCase(res.charAt(i)));
        }
        return (int)this.findPerimeter() + " " + (int)this.findArea() + " " + sb.toString();
    }
}

