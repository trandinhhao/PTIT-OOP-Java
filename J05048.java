
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

    public String toString() {
        return id + " " + nhap + " " + xuat + " " + gia + " " + tien + " " + tax;
    }
}

public class J05048 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            sc.nextLine();
            Hang x = new Hang(sc.nextLine(), sc.nextInt());
            System.out.println(x);
        }
    }
}
