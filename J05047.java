
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

    public long getCk() {
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
        return (long) (Math.round(ck));
    }

    public String toString() {
        long tong = sl * dg;
        tong -= getCk();
        return id + " " + ten + " " + getCk() + " " + tong;
    }

}

public class J05047 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        HashMap<String, Integer> mp = new HashMap<>();
        ArrayList<MatHang> ar = new ArrayList<>();
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
            ar.add(x);
            sc.nextLine();
        }
        Collections.sort(ar, new Comparator<MatHang>() {
            @Override
            public int compare(MatHang o1, MatHang o2) {
                return (int) (o2.getCk() - o1.getCk());
            }
        });
        for (MatHang x : ar) {
            System.out.println(x);
        }
    }
}
