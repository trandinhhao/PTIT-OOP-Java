
import java.util.*;

class BangDiem {

    private String msv;
    private String ten;
    private String lop;
    private Double d1, d2, d3;

    public BangDiem(String msv, String ten, String lop, Double d1, Double d2, Double d3) {
        this.msv = msv;
        this.ten = ten;
        this.lop = lop;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }

    public String getTen() {
        return ten;
    }

    public String toString() {
        return msv + " " + ten + " " + lop + " " + String.format("%.1f", d1) + " " + String.format("%.1f", d2) + " " + String.format("%.1f", d3);
    }
}

public class J05031 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<BangDiem> a = new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            BangDiem x = new BangDiem(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
            a.add(x);
            sc.nextLine();
        }
        Collections.sort(a, new Comparator<BangDiem>() {
            @Override
            public int compare(BangDiem o1, BangDiem o2) {
                return o1.getTen().compareTo(o2.getTen());
            }
        });
        for (int i = 1; i <= t; i++) {
            System.out.println(i + " " + a.get(i - 1));
        }
    }
}
