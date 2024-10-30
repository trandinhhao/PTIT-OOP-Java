
import java.util.*;

class HocSinh {

    private String mhs;
    private String ten;
    private double toan, tv, nn, vl, hh, sh, ls, dl, gdcd, cn;

    public HocSinh(int mhs, String ten, double toan, double tv, double nn, double vl, double hh, double sh, double ls, double dl, double gdcd, double cn) {
        this.mhs = "HS" + String.format("%02d", mhs);
        this.ten = ten;
        this.toan = toan;
        this.tv = tv;
        this.nn = nn;
        this.vl = vl;
        this.hh = hh;
        this.sh = sh;
        this.ls = ls;
        this.dl = dl;
        this.gdcd = gdcd;
        this.cn = cn;
    }

    public double getTong() {
        double sum = (this.toan * 2 + this.tv * 2 + this.nn + this.vl + this.hh + this.sh + this.ls + this.dl + this.gdcd + this.cn) / 12;
        return (double) (Math.round(sum * 10)) / 10;
    }

    public String getMhs() {
        return mhs;
    }

    public String toString() {
        String level = "";
        if (this.getTong() >= 9.0) {
            level = "XUAT SAC";
        } else if (this.getTong() >= 8) {
            level = "GIOI";
        } else if (this.getTong() >= 7) {
            level = "KHA";
        } else if (this.getTong() >= 5) {
            level = "TB";
        } else {
            level = "YEU";
        }
        return this.mhs + " " + this.ten + " " + String.format("%.1f", this.getTong()) + " " + level;
    }
}

public class J05018 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<HocSinh> a = new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            String ten = sc.nextLine();
            HocSinh x = new HocSinh(i, ten, sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
            a.add(x);
            sc.nextLine();
        }
        Collections.sort(a, new Comparator<HocSinh>() {
            @Override
            public int compare(HocSinh o1, HocSinh o2) {
                if (o2.getTong() > o1.getTong()) {
                    return 1;
                } else if (o2.getTong() < o1.getTong()) {
                    return -1;
                } else {
                    return o1.getMhs().compareTo(o2.getMhs());
                }
            }
        });
        for (HocSinh x : a) {
            System.out.println(x);
        }
    }
}
