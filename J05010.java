
import java.util.*;

class MatHang {

    private int mmh;
    private String tmh;
    private String nh;
    private double giaMua;
    private double giaBan;

    public MatHang(int mmh, String tmh, String nh, double giaMua, double giaBan) {
        this.mmh = mmh;
        this.tmh = tmh;
        this.nh = nh;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
    }

    public double getGiaMua() {
        return giaMua;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public String toString() {
        String ln = String.format("%.2f", this.giaBan - this.giaMua);
        return this.mmh + " " + this.tmh + " " + this.nh + " " + ln;
    }
}

public class J05010 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<MatHang> a = new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            sc.nextLine();
            MatHang x = new MatHang(i, sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble());
            a.add(x);
        }
        Collections.sort(a, new Comparator<MatHang>() {
            @Override
            public int compare(MatHang o1, MatHang o2) {
                double ln1 = o1.getGiaBan() - o1.getGiaMua();
                double ln2 = o2.getGiaBan() - o2.getGiaMua();
                if (ln1 > ln2) {
                    return -1;
                } else {
                    return 1;
                }
            }
        });
        for (MatHang x : a) {
            System.out.println(x);
        }
    }
}
