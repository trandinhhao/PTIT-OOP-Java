
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


class MonHoc {
    private String ma;
    private String mon;
    private String hinhThucThi;

    public MonHoc(String ma, String mon, String hinhThucThi) {
        this.ma = ma;
        this.mon = mon;
        this.hinhThucThi = hinhThucThi;
    }
    
    public String toString() {
        return this.ma + " " + this.mon + " " + this.hinhThucThi;
    }

    public String getMa() {
        return ma;
    }
    
}

public class J07058 {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("MONHOC.in");
        Scanner  sc = new Scanner(f);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<MonHoc> a = new ArrayList<>();
        while (t-- >0) {
            MonHoc x = new MonHoc(sc.nextLine(), sc.nextLine(), sc.nextLine());
            a.add(x);
        }
        Collections.sort(a, new Comparator<MonHoc>(){
            @Override
            public int compare(MonHoc o1, MonHoc o2) {
                return o1.getMa().compareTo(o2.getMa());
            }
        });
        for (MonHoc x : a) {
            System.out.println(x);
        }
    }
}