
import java.util.*;

class SinhVien {

    private String ten;
    private int bai, submit;

    public SinhVien(String ten, int bai, int submit) {
        this.ten = ten;
        this.bai = bai;
        this.submit = submit;
    }

    public String getTen() {
        return ten;
    }

    public int getBai() {
        return bai;
    }

    public int getSubmit() {
        return submit;
    }

    public String toString() {
        return ten + " " + bai + " " + submit;
    }
}

public class J05042 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<SinhVien> a = new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            sc.nextLine();
            SinhVien x = new SinhVien(sc.nextLine(), sc.nextInt(), sc.nextInt());
            a.add(x);
        }
        Collections.sort(a, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                if (o1.getBai() != o2.getBai()) {
                    return o2.getBai() - o1.getBai();
                } else if (o1.getSubmit() != o2.getSubmit()) {
                    return o1.getSubmit() - o2.getSubmit();
                } else {
                    return o1.getTen().compareTo(o2.getTen());
                }
            }
        });
        for (SinhVien x : a) {
            System.out.println(x);
        }
    }
}
