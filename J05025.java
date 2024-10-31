
import java.util.*;

class GiangVien {

    private String ma, ten, khoa;

    public GiangVien(int ma, String ten, String khoa) {
        this.ma = "GV" + String.format("%02d", ma);
        this.ten = ten;
        this.khoa = khoa;
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        String[] a1 = this.ten.split("\\s+");
        return a1[a1.length - 1];
    }

    public String getKhoa() {
        return khoa;
    }

    public String toString() {
        return this.ma + " " + this.ten + " " + this.khoa;
    }
}

public class J05025 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<GiangVien> a = new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            String ten = sc.nextLine();
            String khoa = sc.nextLine();
            StringBuilder sb = new StringBuilder("");
            String[] tmp = khoa.split("\\s+");
            for (String y : tmp) {
                sb.append(y.toUpperCase().charAt(0));
            }
            GiangVien x = new GiangVien(i, ten, sb.toString());
            a.add(x);
        }
        Collections.sort(a, new Comparator<GiangVien>() {
            @Override
            public int compare(GiangVien o1, GiangVien o2) {
                if (o2.getTen().compareTo(o1.getTen()) != 0) {
                    return o1.getTen().compareTo(o2.getTen());
                } else {
                    return o1.getMa().compareTo(o2.getMa());
                }
            }
        });
        for (GiangVien x : a) {
            System.out.println(x);
        }
    }
}
