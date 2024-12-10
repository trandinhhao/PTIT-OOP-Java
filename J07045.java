
import java.io.*;
import java.util.*;

class LoaiPhong implements Comparable<LoaiPhong> {

    private String kh, ten;
    private int gia;
    private double phi;

    public LoaiPhong(String s) {
        String[] a = s.split("\\s+");
        this.kh = a[0];
        this.ten = a[1];
        this.gia = Integer.parseInt(a[2]);
        this.phi = Double.parseDouble(a[3]);
    }

    public String toString() {
        return kh + " " + ten + " " + gia + " " + phi;
    }

    public int compareTo(LoaiPhong o) {
        return ten.compareTo(o.ten);
    }
}

public class J07045 {

    public static void main(String[] args) throws IOException {
        ArrayList<LoaiPhong> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("PHONG.in"));
        int n = Integer.parseInt(in.nextLine());
        while (n-- > 0) {
            ds.add(new LoaiPhong(in.nextLine()));
        }
        Collections.sort(ds);
        for (LoaiPhong tmp : ds) {
            System.out.println(tmp);
        }
    }
}
