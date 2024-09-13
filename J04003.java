//src/J04003.java

import java.util.*;

public class J04003 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhanSo x = new PhanSo(sc.nextLong(), sc.nextLong());
        System.out.println(x);
    }
}

//src/PhanSo.java

class PhanSo {

    private long tuSo;
    private long mauSo;

    public PhanSo(long tuSo, long mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    public String toString() {
        long x = this.tuSo;
        long y = this.mauSo;
        long res = 1;
        while (true) {
            if (y == 0) {
                res = x;
                break;
            } else {
                long tmp = x;
                x = y;
                y = tmp % y;
            }
        }
        return (this.tuSo / res) + "/" + (this.mauSo / res);
    }
}

