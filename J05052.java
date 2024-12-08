
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

    public String toString() {
        return ten + " " + id + " " + stt + " " + sale + " " + total;
    }
}

public class J05052 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            MatHang x = new MatHang(sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt());
            System.out.println(x);
            sc.nextLine();
        }
    }
}
