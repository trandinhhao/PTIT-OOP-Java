//src/J05004.java

import java.util.*;

public class J05004 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<SinhVien> a = new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            sc.nextLine();
            SinhVien x = new SinhVien(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble());
            a.add(x);
        }
        for (SinhVien x : a) {
            System.out.println(x);
        }
    }
}

//src/SinhVien.java
class SinhVien {

    private String msv;
    private String name;
    private String lop;
    private String ngaySinh;
    private double gpa;

    public SinhVien(int msv, String name, String lop, String ngaySinh, double gpa) {
        this.msv = "B20DCCN" + String.format("%03d", msv);
        this.name = name;
        this.lop = lop;
        this.ngaySinh = ngaySinh;
        this.gpa = gpa;
    }

    private String chuanHoaTen(String x) {
        StringBuilder sb = new StringBuilder("");
        String[] a = x.trim().split("\\s+");
        for (String res : a) {
            sb.append(Character.toUpperCase(res.charAt(0)));
            for (int i = 1; i < res.length(); i++) {
                sb.append(Character.toLowerCase(res.charAt(i)));
            }
            sb.append(" ");
        }
        return sb.toString().trim();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(this.ngaySinh);
        if (sb.charAt(2) != '/') {
            sb.insert(0, "0");
        }
        if (sb.charAt(5) != '/') {
            sb.insert(3, "0");
        }

        String tmp = chuanHoaTen(this.name);

        return this.msv + " " + tmp + " " + this.lop + " " + sb.toString() + " " + String.format("%.2f", this.gpa);
    }
}
