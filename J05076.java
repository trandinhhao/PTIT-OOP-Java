
import java.util.*;

class Info {

    private String id, ten;
    private long nhap, xuat;

    public Info(String id, String ten, long nhap, long xuat) {
        this.id = id;
        this.ten = ten;
        this.nhap = nhap;
        this.xuat = xuat;
    }

    public String toString() {
        return id + " " + ten + " " + nhap + " " + xuat;
    }
}

class MatHang {

    private String id, ten, xepLoai;
    private long nhap, xuat;

    public MatHang(String id, String ten, String xepLoai) {
        this.id = id;
        this.ten = ten;
        this.xepLoai = xepLoai;
        this.nhap = 0;
        this.xuat = 0;
    }

    public String getId() {
        return id;
    }

    public String getTen() {
        return ten;
    }

    public String getXepLoai() {
        return xepLoai;
    }

    public void setNhap(long nhap) {
        this.nhap += nhap;
    }
}

public class J05076 {

    public static long chuanHoa(String id, long xuat) {
        double x = 0;
        if (id.startsWith("A")) {
            x = 0.08;
        } else if (id.startsWith("B")) {
            x = 0.05;
        } else if (id.startsWith("C")) {
            x = 0.02;
        }
        return xuat + Math.round(xuat * x);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<MatHang> a = new ArrayList<>();
        while (t-- > 0) {
            MatHang x = new MatHang(sc.nextLine(), sc.nextLine(), sc.nextLine());
            a.add(x);
        }
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<Info> b = new ArrayList<>();
        while (n-- > 0) {
            String[] s = sc.nextLine().split("\\s+");
            for (MatHang x : a) {
                if (x.getId().equals(s[0])) {
                    //
                    long xx = Long.parseLong(s[1]) * Long.parseLong(s[2]);
                    long yy = Long.parseLong(s[2]) * Long.parseLong(s[3]);
                    Info i = new Info(s[0], x.getTen(), xx, chuanHoa(x.getXepLoai(), yy));
                    //
                    b.add(i);
                }
            }
        }
        for (Info x : b) {
            System.out.println(x);
        }
    }
}
