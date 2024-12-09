
import java.util.*;

class GiaoVien {

    private String id, ten;
    private long luong;
    private long phuCap;
    private long sum;
    private int bacLuong;

    public GiaoVien(String id, String ten, long luong) {
        this.id = id;
        this.ten = ten;
        this.luong = luong;
        this.bacLuong = Integer.parseInt(id.substring(2, 4));
        if (id.startsWith("HT")) {
            this.phuCap = 2000000;
        } else if (id.startsWith("HP")) {
            this.phuCap = 900000;
        } else {
            this.phuCap = 500000;
        }
        this.sum = this.phuCap + this.luong * this.bacLuong;
    }

    public String getId() {
        return id.substring(0, 2);
    }

    public String toString() {
        return id + " " + ten + " " + bacLuong + " " + phuCap + " " + sum;
    }
}

public class J05064 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        int ht = 1;
        int hp = 2;
        while (t-- > 0) {
            GiaoVien x = new GiaoVien(sc.nextLine(), sc.nextLine(), sc.nextLong());
            sc.nextLine();
            if (x.getId().startsWith("HT") && ht > 0) {
                System.out.println(x);
                ht -= 1;
            } else if (x.getId().startsWith("HP") && hp > 0) {
                System.out.println(x);
                hp -= 1;
            } else if (x.getId().startsWith("GV")) {
                System.out.println(x);
            }
        }
    }
}
