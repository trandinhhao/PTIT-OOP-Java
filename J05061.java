
import java.util.*;

class PhuHo {

    private String ten, ns;
    private double d1, d2;
    private String id, type;
    private int dtb, age;
    private double thuong;

    public PhuHo(int id, String ten, String ns, double d1, double d2) {
        this.id = "PH" + String.format("%02d", id);
        this.ten = ten;
        this.ns = ns;
        this.d1 = d1;
        this.d2 = d2;
        // age
        String[] year = ns.split("/");
        this.age = 2021 - Integer.parseInt(year[2]);
        // bonus
        if (d1 >= 8 && d2 >= 8) {
            this.thuong = 1;
        } else if (d1 >= 7.5 && d2 >= 7.5) {
            this.thuong = 0.5;
        } else {
            this.thuong = 0;
        }
        this.dtb = (int) Math.round((0.0 + d1 + d2) / 2 + this.thuong);
        if (this.dtb >= 9) {
            if (this.dtb > 10) {
                this.dtb = 10;
            }
            this.type = "Xuat sac";
        } else if (this.dtb == 8) {
            this.type = "Gioi";
        } else if (this.dtb == 7) {
            this.type = "Kha";
        } else if (this.dtb == 5 || this.dtb == 6) {
            this.type = "Trung binh";
        } else {
            this.type = "Truot";
        }
    }

    public int getDtb() {
        return dtb;
    }

    public String toString() {
        return id + " " + ten + " " + age + " " + dtb + " " + type;
    }
}

public class J05061 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<PhuHo> a = new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            PhuHo x = new PhuHo(i, sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble());
            a.add(x);
            sc.nextLine();
        }
        Collections.sort(a, new Comparator<PhuHo>() {
            @Override
            public int compare(PhuHo o1, PhuHo o2) {
                return o2.getDtb() - o1.getDtb();
            }
        });
        for (PhuHo x : a) {
            System.out.println(x);
        }
    }
}
