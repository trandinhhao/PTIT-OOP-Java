
import java.util.*;

class DoanhNghiep {

    private String ma, ten;
    private int soLuong;

    public DoanhNghiep(String ma, String ten, int soLuong) {
        this.ma = ma;
        this.ten = ten;
        this.soLuong = soLuong;
    }

    public String getMa() {
        return ma;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public String toString() {
        return this.ma + " " + this.ten + " " + this.soLuong;
    }
}

public class J05028 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<DoanhNghiep> a = new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            DoanhNghiep x = new DoanhNghiep(sc.nextLine(), sc.nextLine(), sc.nextInt());
            sc.nextLine();
            a.add(x);
        }
        Collections.sort(a, new Comparator<DoanhNghiep>() {
            @Override
            public int compare(DoanhNghiep o1, DoanhNghiep o2) {
                if (o1.getSoLuong() != o2.getSoLuong()) {
                    return o2.getSoLuong() - o1.getSoLuong();
                } else {
                    return o1.getMa().compareTo(o2.getMa());
                }
            }
        });
        for (DoanhNghiep x : a) {
            System.out.println(x);
        }
    }
}
