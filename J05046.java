
import java.util.*;

class MatHang {

    private String id, ten;
    private long sl, dg;

    public MatHang(String id, String ten, long sl, long dg) {
        this.id = id;
        this.ten = ten;
        this.sl = sl;
        this.dg = dg;
    }

    public String toString() {
        long tong = sl * dg;
        double ck = 0;
        if (sl > 10) {
            ck = tong * 0.05;
        } else if (sl >= 8) {
            ck = tong * 0.02;
        } else if (sl >= 5) {
            ck = tong * 0.01;
        } else {
            ck = 0;
        }
        long chiet = Math.round(ck);
        tong -= ck;
        return id + " " + ten + " " + chiet + " " + tong;
    }
}

public class J05046 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        HashMap<String, Integer> mp = new HashMap<>();
        for (int i = 1; i <= t; i++) {
            String ten = sc.nextLine();
            long sl = sc.nextLong();
            long gia = sc.nextLong();
            String[] a = ten.split("\\s+");
            String id = "" + Character.toUpperCase(a[0].charAt(0)) + Character.toUpperCase(a[1].charAt(0));
            int res = 0;
            if (mp.containsKey(id)) {
                res = mp.get(id) + 1;
                mp.put(id, res);
            } else {
                res = 0 + 1;
                mp.put(id, 1);
            }
            MatHang x = new MatHang(id + "0" + res, ten, sl, gia);
            System.out.println(x);
            sc.nextLine();
        }
    }
}
