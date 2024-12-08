
import java.util.*;

class MatHang {

    private String ten;
    private String id;
    private String stt;
    private long gia;
    private long sl;
    private long sale;
    private long total;

    public MatHang(String ten, String id, long gia, long sl) {
        this.ten = ten;
        this.id = id;
        this.stt = id.substring(1, 4);
        this.gia = gia;
        this.sl = sl;
        this.total = gia * sl;
        if (id.charAt(4) == '1') {
            this.sale = Math.round(this.total / 100 * 50);
        } else {
            this.sale = Math.round(this.total / 100 * 30);
        }
        this.total -= this.sale;
    }

    public String getStt() {
        return stt;
    }

    public String toString() {
        return ten + " " + id + " " + stt + " " + sale + " " + total;
    }
}

public class J05053 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<MatHang> a = new ArrayList<>();
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            MatHang x = new MatHang(sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt());
            a.add(x);
            sc.nextLine();
        }
        Collections.sort(a, new Comparator<MatHang>() {
            @Override
            public int compare(MatHang o1, MatHang o2) {
                return Integer.parseInt(o1.getStt()) - Integer.parseInt(o2.getStt());
            }
        });
        for (MatHang x : a) {
            System.out.println(x);
        }
    }
}
