//src/J07010.java

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class J07010 {

    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("SV.in");
        Scanner sc = new Scanner(f);
        ArrayList<SinhVien> a = new ArrayList<>();
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            sc.nextLine();
            SinhVien x = new SinhVien(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble());
            a.add(x);
        }
        for (SinhVien s : a) {
            System.out.println(s);
        }
    }
}

//src/SinhVien.java
class SinhVien {

    private String msv;
    private String name;
    private String lop;
    private String ns;
    private double gpa;

    public SinhVien(int msv, String name, String lop, String ns, double gpa) {
        this.msv = "B20DCCN" + String.format("%03d", msv);
        this.name = name;
        this.lop = lop;
        this.ns = ns;
        this.gpa = gpa;
    }

    public String chuanHoa(String s) {
        StringBuilder sb = new StringBuilder(s.trim());
        if (sb.charAt(2) != '/') {
            sb.insert(0, "0");
        }
        if (sb.charAt(5) != '/') {
            sb.insert(3, "0");
        }
        return sb.toString();
    }

    public String toString() {
        return this.msv + " " + this.name + " " + this.lop + " " + chuanHoa(this.ns) + " " + String.format("%.2f", this.gpa);
    }
}
