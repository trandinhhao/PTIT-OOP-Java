
import java.util.*;

class SinhVien {

    private String id, name, lop;
    private int diem;

    public SinhVien(String id, String name, String lop) {
        this.id = id;
        this.name = name;
        this.lop = lop;
        this.diem = 10;
    }

    public void setDiem(String x) {
        int d = 10;
        for (char i : x.toCharArray()) {
            if (i == 'v') {
                d -= 2;
            } else if (i == 'm') {
                d -= 1;
            }
        }
        if (d < 0) {
            d = 0;
        }
        this.diem = d;
    }

    public String getId() {
        return id;
    }

    public String getLop() {
        return lop;
    }

    public String toString() {
        String tmp = "";
        if (diem == 0) {
            tmp = "KDDK";
        }
        return id + " " + name + " " + lop + " " + diem + " " + tmp;
    }
}

public class J05075 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n = t;
        sc.nextLine();
        ArrayList<SinhVien> a = new ArrayList<>();
        while (t-- > 0) {
            SinhVien x = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine());
            a.add(x);
        }

        for (int i = 0; i < n; i++) {
            String[] s = sc.nextLine().split("\\s+");
            for (SinhVien x : a) {
                if (s[0].equals(x.getId())) {
                    x.setDiem(s[1]);
                }
            }
        }
        String res = sc.nextLine();
        for (SinhVien x : a) {
            if (res.equals(x.getLop())) {
                System.out.println(x);
            }
        }
    }
}
