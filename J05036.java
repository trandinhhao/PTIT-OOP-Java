
import java.util.*;

class MatHang {

    private String id;
    private String ten, dvi;
    private double giaNhap;
    private int sl;

    public MatHang(int id, String ten, String dvi, double giaNhap, int sl) {
        this.id = "MH" + String.format("%02d", id);
        this.ten = ten;
        this.dvi = dvi;
        this.giaNhap = giaNhap;
        this.sl = sl;
    }

    private long phiVanChuyen() {
        return (long) Math.round(giaNhap * (double) sl * 5 / 100);
    }

    private long thanhTien() {
        return (long) Math.round(giaNhap * sl + phiVanChuyen());
    }

    private long giaBan() {
        return (long) Math.round((double) thanhTien() * 102 / 100);
    }

    public String toString() {
        return id + " " + ten + " " + dvi + " " + phiVanChuyen() + " " + thanhTien() + " " + giaBan();
    }
}

public class J05036 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= t; i++) {
            MatHang x = new MatHang(i, sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextInt());
            sc.nextLine();
            System.out.println(x);
        }
    }
}
