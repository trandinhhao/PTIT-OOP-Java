
import java.util.Scanner;

class NhanVien {

    private String id, ten;
    private double salary;
    private long cnt;
    private String chucVu;

    public NhanVien(String id, String ten, double salary, long cnt, String chucVu) {
        this.id = id;
        this.ten = ten;
        this.salary = salary;
        this.cnt = cnt;
        this.chucVu = chucVu;
    }

    private long luongThang() {
        return (long) (salary * cnt);
    }

    private long thuong() {
        double thuong = 0;
        if (cnt >= 25) {
            thuong = 0.2;
        } else if (cnt >= 22) {
            thuong = 0.1;
        }
        return (long) (thuong * luongThang());
    }

    private long phuCap() {
        if (chucVu.compareTo("GD") == 0) {
            return 250000;
        } else if (chucVu.compareTo("PGD") == 0) {
            return 200000;
        } else if (chucVu.compareTo("TP") == 0) {
            return 180000;
        } else {
            return 150000;
        }
    }

    public long tong() {
        return luongThang() + thuong() + phuCap();
    }

    public String toString() {
        return id + " " + ten + " " + luongThang() + " " + thuong() + " " + phuCap() + " " + this.tong();
    }
}

public class J05038 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        long tongLuong = 0;
        for (int i = 1; i <= t; i++) {
            String ma = "NV" + String.format("%02d", i);
            String ten = sc.nextLine();
            double salary = sc.nextDouble();
            int cnt = sc.nextInt();
            sc.nextLine();
            String chucVu = sc.nextLine();
            NhanVien x = new NhanVien(ma, ten, salary, cnt, chucVu);
            System.out.println(x);
            tongLuong += x.tong();
        }
        System.out.println("Tong chi phi tien luong: " + tongLuong);
    }
}
