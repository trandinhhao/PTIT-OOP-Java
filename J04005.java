//src/J04005.java

import java.util.Scanner;

public class J04005 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ThiSinh x = new ThiSinh(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        System.out.println(x);
    }
}

//src/ThiSinh.java

class ThiSinh {

    private String hoTen;
    private String ngaySinh;
    private double d1, d2, d3;

    public ThiSinh(String hoTen, String ngaySinh, double d1, double d2, double d3) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }

    public String toString() {
        return this.hoTen + " " + this.ngaySinh + " " + String.format("%.1f", this.d1 + this.d2 + this.d3);
    }
}

