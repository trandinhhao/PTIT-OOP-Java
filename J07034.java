
import java.io.*;
import java.util.*;

class MonHoc {

    private String id, ten;
    private int sl;

    public MonHoc(String id, String ten, int sl) {
        this.id = id;
        this.ten = ten;
        this.sl = sl;
    }

    public String getTen() {
        return ten;
    }

    public String toString() {
        return id + " " + ten + " " + sl;
    }
}

public class J07034 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
//        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<MonHoc> a = new ArrayList<>();
        sc.nextLine();
        while (t-- > 0) {
            MonHoc x = new MonHoc(sc.nextLine(), sc.nextLine(), sc.nextInt());
            a.add(x);
            sc.nextLine();
        }
        Collections.sort(a, new Comparator<MonHoc>() {
            @Override
            public int compare(MonHoc o1, MonHoc o2) {
                return o1.getTen().compareTo(o2.getTen());
            }

        });
        for (MonHoc x : a) {
            System.out.println(x);
        }
    }
}
