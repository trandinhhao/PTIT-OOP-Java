//src/J04004.java

import java.util.*;

public class J04004 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();

        PhanSo x = new PhanSo(a, b);
        PhanSo y = new PhanSo(c, d);
        System.out.println(x.cong(y));
    }
}

//src/PhanSo.java

class PhanSo {

    private long tu;
    private long mau;

    public PhanSo(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
    }

    public String cong(PhanSo p) {
        long tren = this.tu * p.mau + this.mau * p.tu;
        long duoi = this.mau * p.mau;
        long a = tren;
        long b = duoi;
        while (b != 0) {
            long tmp = b;
            b = a % b;
            a = tmp;
        }
        tren /= a;
        duoi /= a;
        return tren + "/" + duoi;
    }
}

