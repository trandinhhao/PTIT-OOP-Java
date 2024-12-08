
import java.util.*;

class HocSinh {

    private String id;
    private String ten;
    private double diem;
    private String type;
    private int rank;

    public HocSinh(int id, String ten, double diem) {
        this.id = "HS" + String.format("%02d", id);
        this.ten = ten;
        this.diem = diem;
        if (diem >= 9.0) {
            this.type = "Gioi";
        } else if (diem >= 7) {
            this.type = "Kha";
        } else if (diem >= 5) {
            this.type = "Trung Binh";
        } else {
            this.type = "Yeu";
        }
    }

    public double getDiem() {
        return diem;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String toString() {
        return id + " " + ten + " " + diem + " " + type + " " + rank;
    }

    public String getId() {
        return id;
    }

}

public class J05054 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<HocSinh> a = new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            HocSinh x = new HocSinh(i, sc.nextLine(), sc.nextDouble());
            a.add(x);
            sc.nextLine();
        }
        Collections.sort(a, new Comparator<HocSinh>() {
            @Override
            public int compare(HocSinh o1, HocSinh o2) {
                if (o1.getDiem() > o2.getDiem()) {
                    return -1;
                } else {
                    return 1;
                }
            }
        });
        a.get(0).setRank(1);
        int save = 1;
        for (int i = 1; i < t; i++) {
            if (a.get(i).getDiem() == a.get(i - 1).getDiem()) {
                a.get(i).setRank(save);
            } else {
                a.get(i).setRank(i + 1);
                save = i + 1;
            }
        }
        for (int i = 1; i <= t; i++) {
            for (HocSinh x : a) {
                if (x.getId().equals("HS" + String.format("%02d", i))) {
                    System.out.println(x);
                }
            }
        }
    }
}
