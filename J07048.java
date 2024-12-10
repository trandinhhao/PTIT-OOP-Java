
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class SanPham {

    private String id, ten, ban, bh;

    public SanPham(String id, String ten, String ban, String bh) {
        this.id = id;
        this.ten = ten;
        this.ban = ban;
        this.bh = bh;
    }

    public String getBan() {
        return ban;
    }

    public String getId() {
        return id;
    }

    public String toString() {
        return id + " " + ten + " " + ban + " " + bh;
    }
}

public class J07048 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SANPHAM.in"));
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<SanPham> a = new ArrayList<>();
        while (t-- > 0) {
            SanPham x = new SanPham(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            a.add(x);
        }
        Collections.sort(a, new Comparator<SanPham>() {
            @Override
            public int compare(SanPham o1, SanPham o2) {
                if (Integer.parseInt(o1.getBan()) != Integer.parseInt(o2.getBan())) {
                    return Integer.parseInt(o2.getBan()) - Integer.parseInt(o1.getBan());
                } else {
                    return o1.getId().compareTo(o2.getId());
                }
            }
        });
        for (SanPham x : a) {
            System.out.println(x);
        }
    }
}
