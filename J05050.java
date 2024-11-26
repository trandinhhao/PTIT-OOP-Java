
import java.util.Scanner;

class Dien {

    private String id, loai;
    private long csCU, csMOI, hs, tt, pt, tong;

    public Dien(long id, String loai, long csCU, long csMOI) {
        this.id = "KH" + String.format("%02d", id);
        this.loai = loai;
        this.csCU = csCU;
        this.csMOI = csMOI;
        if (this.loai.equals("KD")) {
            this.hs = 3;
        } else if (this.loai.equals("NN")) {
            this.hs = 5;
        } else if (this.loai.equals("TT")) {
            this.hs = 4;
        } else if (this.loai.equals("CN")) {
            this.hs = 2;
        }
        long check = csMOI - csCU;
        this.tt = check * this.hs * 550;
        //
        if (check > 100) {
            this.pt = this.tt;
        } else if (check >= 50) {
            this.pt = (long) Math.ceil(this.tt * 0.35);
        } else {
            this.pt = 0;
        }
        this.tong = this.pt + this.tt;
    }

    public String toString() {
        return id + " " + hs + " " + tt + " " + pt + " " + tong;
    }
}

public class J05050 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= t; i++) {
            Dien x = new Dien(i, sc.nextLine(), sc.nextInt(), sc.nextInt());
            System.out.println(x);
            sc.nextLine();
        }
    }
}
