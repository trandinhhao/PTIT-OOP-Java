
import java.io.*;
import java.util.*;

class SinhVien {

    private String id, ten, lop, email;

    public SinhVien(String id, String ten, String lop, String email) {
        this.id = id;
        this.ten = ten.trim();
        this.lop = lop;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("");
        String[] a = ten.split("\\s+");
        for (String x : a) {
            sb.append(Character.toUpperCase(x.charAt(0)));
            for (int i = 1; i < x.length(); i++) {
                sb.append(Character.toLowerCase(x.charAt(i)));
            }
            sb.append(" ");
        }
        return id + " " + sb.toString() + lop + " " + email;
    }
}

public class J07033 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
//        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<SinhVien> a = new ArrayList<>();
        while (t-- > 0) {
            SinhVien x = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            a.add(x);
        }
        Collections.sort(a, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return o1.getId().compareTo(o2.getId());
            }
        });
        for (SinhVien x : a) {
            System.out.println(x);
        }
    }
}
