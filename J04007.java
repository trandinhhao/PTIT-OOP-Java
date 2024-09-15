//src/J04007.java

import java.util.Scanner;


public class J04007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NhanVien x = new NhanVien("00001", sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        System.out.println(x);
    }
}


//src/NhanVien.java

class NhanVien {
    private String maNV, hoTen, gioiTinh, ngaySinh, diaChi, maSoThue, ngayKi;

    public NhanVien(String maNV, String hoTen, String gioiTinh, String ngaySinh, String diaChi, String maSoThue, String ngayKi) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.maSoThue = maSoThue;
        this.ngayKi = ngayKi;
    }

    public String toString() {
        return this.maNV + " " + this.hoTen + " " +  this.gioiTinh + " " + this.ngaySinh + " " + this.diaChi + " " + this.maSoThue + " " + this.ngayKi;
    }
    
}

