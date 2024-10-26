
import java.util.Scanner;

class ThiSinh {

    private String ma;
    private String ten;
    private double d1;
    private double d2;
    private double d3;

    public ThiSinh(String ma, String ten, double d1, double d2, double d3) {
        this.ma = ma.trim();
        this.ten = ten;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }

    public String toString() {
        double d = this.d1 * 2 + this.d2 + this.d3;
        double ut = 0;
        char c = this.ma.charAt(2);
        if (c == '1') {
            ut = 0.5;
        } else if (c == '2') {
            ut = 1.0;
        } else if (c == '3') {
            ut = 2.5;
        }
        String trangThai = "";
        if (d + ut >= 24) {
            trangThai = "TRUNG TUYEN";
        } else {
            trangThai = "TRUOT";
        }
        if (d * 10 % 10 == 0) {
            int tmp = (int) d;
            if (ut * 10 % 10 == 0) {
                int tmp1 = (int) ut;
                return this.ma + " " + this.ten + " " + tmp1 + " " + tmp + " " + trangThai;
            } else {
                return this.ma + " " + this.ten + " " + ut + " " + tmp + " " + trangThai;
            }
        } else {
            if (ut * 10 % 10 == 0) {
                int tmp1 = (int) ut;
                return this.ma + " " + this.ten + " " + tmp1 + " " + d + " " + trangThai;
            } else {
                return this.ma + " " + this.ten + " " + ut + " " + d + " " + trangThai;
            }
        }
    }
}

public class J04013 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ThiSinh x = new ThiSinh(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        System.out.println(x);
    }
}
