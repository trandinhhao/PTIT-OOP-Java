
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class MatHang {

    private String id;
    private String ten, loai;
    private double loiNhuan;

    public MatHang(int i, String ten, String loai, double mua, double ban) {
        this.id = String.format("%02d", i);
        this.ten = ten;
        this.loai = loai;
        this.loiNhuan = ban - mua;
    }

    public String toString() {
        return "MH" + id + " " + ten + " " + loai + " " + String.format("%.2f", loiNhuan);
    }

    public double getLoiNhuan() {
        return loiNhuan;
    }

}

public class J07050 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MATHANG.in"));
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<MatHang> a = new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            MatHang x = new MatHang(i, sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble());
            a.add(x);
            sc.nextLine();
        }
        Collections.sort(a, new Comparator<MatHang>() {
            @Override
            public int compare(MatHang o1, MatHang o2) {
                if (o1.getLoiNhuan() > o2.getLoiNhuan()) {
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
