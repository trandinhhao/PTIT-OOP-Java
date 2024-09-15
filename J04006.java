//src/J04006.java

import java.util.Scanner;


public class J04006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinhVien x = new SinhVien();
        x.setMaSV("B20DCCN001");
        x.setHoTen(sc.nextLine());
        x.setLop(sc.nextLine());
        x.setNgaySinh(sc.nextLine());
        x.setGpa(sc.nextDouble());
        System.out.println(x);
    }
}

//src/SinhVien.java

class SinhVien {

    private String maSV;
    private String hoTen;
    private String lop;
    private String ngaySinh;
    private double gpa;

    public SinhVien() {
        this.maSV = "";
        this.hoTen = "";
        this.lop = "";
        this.ngaySinh = "";
        this.gpa = 0;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(this.ngaySinh);
        if (sb.charAt(1) == '/') {
            sb.insert(0, '0');
        }
        if (sb.charAt(4) == '/') {
            sb.insert(3, '0');
        }
        return this.maSV + " " + this.hoTen + " " + this.lop + " " + sb.toString() + " " + String.format("%.2f", this.gpa);
    }
}

