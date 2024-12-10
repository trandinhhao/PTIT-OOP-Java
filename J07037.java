
import java.io.*;
import java.util.*;

class DoanhNghiep {

    private String id, ten;
    private String sl;

    public DoanhNghiep(String id, String ten, String sl) {
        this.id = id;
        this.ten = ten;
        this.sl = sl;
    }

    public String getId() {
        return id;
    }

    public String toString() {
        return id + " " + ten + " " + sl;
    }
}

public class J07037 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DN.in"));
        ArrayList<DoanhNghiep> a = new ArrayList<>();
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            DoanhNghiep x = new DoanhNghiep(sc.nextLine(), sc.nextLine(), sc.nextLine());
            a.add(x);
        }
        Collections.sort(a, new Comparator<DoanhNghiep>() {
            @Override
            public int compare(DoanhNghiep o1, DoanhNghiep o2) {
                return o1.getId().compareTo(o2.getId());
            }
        });
        for (DoanhNghiep x : a) {
            System.out.println(x);
        }
    }
}
