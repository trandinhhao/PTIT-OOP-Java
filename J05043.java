
import java.util.*;

class NhanVien {

    private String id, ten, cv;
    private long lcb, cnt;

    public NhanVien(int id, String ten, String cv, long lcb, long cnt) {
        this.id = "NV" + String.format("%02d", id);
        this.ten = ten;
        this.cv = cv;
        this.lcb = lcb;
        this.cnt = cnt;
    }

    private long getPhuCap() {
        if (cv.equals("GD")) {
            return 500;
        } else if (cv.equals("PGD")) {
            return 400;
        } else if (cv.equals("TP")) {
            return 300;
        } else if (cv.equals("KT")) {
            return 250;
        } else {
            return 100;
        }
    }

    private long getLuongChinh() {
        return lcb * cnt;
    }

    private long getTamUng() {
        if ((getPhuCap() + getLuongChinh()) * (2.0 / 3) < 25000) {
            return Math.round((getPhuCap() + getLuongChinh()) * (2.0 / 3) / 1000) * 1000;
        } else {
            return 25000;
        }
    }

    public String toString() {
        long res = getLuongChinh() - getTamUng() + getPhuCap();
        return id + " " + ten + " " + getPhuCap() + " " + getLuongChinh() + " " + getTamUng() + " " + res;
    }
}

public class J05043 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            sc.nextLine();
            NhanVien x = new NhanVien(i, sc.nextLine(), sc.nextLine(), sc.nextLong(), sc.nextLong());
            System.out.println(x);
        }
    }
}
