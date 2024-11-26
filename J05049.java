
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Hang {

    private String id;
    private int nhap, xuat;
    private int gia;
    private int tien;
    private int tax;

    public Hang(String id, int nhap) {
        this.id = id;
        this.nhap = nhap;
        if (id.charAt(0) == 'A') {
            this.xuat = (int) Math.round(nhap * 0.6);
        } else {
            this.xuat = (int) Math.round(nhap * 0.7);
        }
        if (id.charAt(id.length() - 1) == 'Y') {
            this.gia = 110000;
        } else {
            this.gia = 135000;
        }
        this.tien = this.xuat * this.gia;
        if (id.charAt(0) == 'A') {
            if (id.charAt(id.length() - 1) == 'Y') {
                this.tax = (int) Math.round(0.08 * this.tien);
            } else {
                this.tax = (int) Math.round(0.11 * this.tien);
            }
        } else {
            if (id.charAt(id.length() - 1) == 'Y') {
                this.tax = (int) Math.round(0.17 * this.tien);
            } else {
                this.tax = (int) Math.round(0.22 * this.tien);
            }
        }
    }

    public String getId() {
        return id;
    }

    public int getTax() {
        return tax;
    }

    public String toString() {
        return id + " " + nhap + " " + xuat + " " + gia + " " + tien + " " + tax;
    }

}

public class J05049 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Hang> a = new ArrayList<>();
        int t = sc.nextInt();
        while (t-- > 0) {
            sc.nextLine();
            Hang x = new Hang(sc.nextLine(), sc.nextInt());
            a.add(x);
        }
        sc.nextLine();
        char j = sc.nextLine().charAt(0);
        Collections.sort(a, new Comparator<Hang>() {
            public int compare(Hang o1, Hang o2) {
                return o2.getTax() - o1.getTax();
            }
        });
        for (Hang i : a) {
            if (i.getId().charAt(0) == j) {
                System.out.println(i);
            }
        }
    }
}
