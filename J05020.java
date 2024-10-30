
import java.util.*;

class SinhVien {

    private String msv, ten, lop, email;

    public SinhVien(String msv, String ten, String lop, String email) {
        this.msv = msv.trim();
        this.ten = ten.trim();
        this.lop = lop.trim();
        this.email = email.trim();
    }

    public String getMsv() {
        return msv;
    }

    public String getLop() {
        return lop;
    }

    public String toString() {
        return this.msv + " " + this.ten + " " + this.lop + " " + this.email;
    }
}

public class J05020 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<SinhVien> a = new ArrayList<>();
        while (t-- > 0) {
            SinhVien x = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            a.add(x);
        }
        Collections.sort(a, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                if (o1.getLop().compareTo(o2.getLop()) != 0) {
                    return o1.getLop().compareTo(o2.getLop());
                } else {
                    return o1.getMsv().compareTo(o2.getMsv());
                }
            }
        });
        for (SinhVien x : a) {
            System.out.println(x);
        }
    }
}
