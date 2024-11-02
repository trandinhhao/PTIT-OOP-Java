
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
        long res = Math.round((double) ((double) thanhTien() + (double) thanhTien() * 2 / 100) / sl);
        if (res % 100 != 0) {
            return res / 100 * 100 + 100;
        } else {
            return res;
        }
    }

    public long getGiaBan() {
        return giaBan();
    }

    public String toString() {
        return id + " " + ten + " " + dvi + " " + phiVanChuyen() + " " + thanhTien() + " " + giaBan();
    }
}

public class J05037 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<MatHang> a = new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            MatHang x = new MatHang(i, sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextInt());
            sc.nextLine();
            a.add(x);
        }
        Collections.sort(a, new Comparator<MatHang>() {
            @Override
            public int compare(MatHang o1, MatHang o2) {
                if (o1.getGiaBan() > o2.getGiaBan()) {
                    return -1;
                } else {
                    return 1;
                }
            }
        });
        for (MatHang x : a) {
            System.out.println(x);
        }
    }
}
