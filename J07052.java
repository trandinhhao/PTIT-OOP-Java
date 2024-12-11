
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class SinhVien {

    private String id, ten;
    private double d1, d2, d3;
    private String total, uuTien;

    public SinhVien(String id, String ten, double d1, double d2, double d3) {
        this.id = id;
        this.ten = ten;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
        //
        double uu = 0;
        if (id.startsWith("KV1")) {
            uu = 0.5;
        } else if (id.startsWith("KV2")) {
            uu = 1.0;
        } else {
            uu = 2.5;
        }
        //
        double tt = d1 * 2 + d2 + d3 + uu;
        if (tt == (int) tt) {
            this.total = String.format("%.0f", tt);
        } else {
            this.total = String.format("%.1f", tt);
        }
        //
        if (uu == (int) uu) {
            this.uuTien = String.format("%.0f", uu);
        } else {
            this.uuTien = String.format("%.1f", uu);
        }
    }

    public String getId() {
        return id;
    }

    public double getTotal() {
        return Double.parseDouble(this.total);
    }

    private String chuanHoa(String ten) {
        StringBuilder sb = new StringBuilder("");
        String[] a = ten.trim().split("\\s+");
        for (String x : a) {
            sb.append(Character.toUpperCase(x.charAt(0)));
            sb.append(x.substring(1).toLowerCase());
            sb.append(" ");
        }
        ten = sb.toString().trim();
        return ten;
    }

    public String toString() {
        return id + " " + chuanHoa(ten) + " " + uuTien + " " + total;
    }

}

public class J07052 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("THISINH.in"));
        int t = sc.nextInt();
        ArrayList<SinhVien> a = new ArrayList<>();
        sc.nextLine();
        while (t-- > 0) {
            SinhVien x = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
            a.add(x);
            sc.nextLine();
        }
        int q = sc.nextInt();
        Collections.sort(a, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                if (!o1.getId().equals(o2.getId())) {
                    if (o1.getTotal() > o2.getTotal()) {
                        return -1;
                    } else {
                        return 1;
                    }
                } else {
                    return o1.getId().compareTo(o2.getId());
                }
            }
        });
        double chuan = a.get(q - 1).getTotal();
        System.out.println(String.format("%.1f", chuan));
        for (SinhVien x : a) {
            if (x.getTotal() < chuan) {
                System.out.println(x + " TRUOT");
            } else {
                System.out.println(x + " TRUNG TUYEN");
            }
        }
    }
}
