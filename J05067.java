
import java.util.*;

class HangHoa {

    private String id, hang;
    private long sl, gia, tong;
    private double thue;

    public HangHoa(String id, long sl) {
        this.id = id;
        this.hang = id.substring(3, 5);
        this.sl = sl;
        //
        if (id.startsWith("X")) {
            this.gia = 128000;
            this.thue = 0.03;
        } else if (id.startsWith("D")) {
            this.gia = 11200;
            this.thue = 0.035;
        } else {
            this.gia = 9700;
            this.thue = 0.02;
        }
        if (id.endsWith("TN")) {
            this.thue = 0;
            this.hang = "Trong Nuoc";
        } else {
            if (this.hang.equals("BP")) {
                this.hang = "British Petro";
            } else if (this.hang.equals("ES")) {
                this.hang = "Esso";
            } else if (this.hang.equals("SH")) {
                this.hang = "Shell";
            } else if (this.hang.equals("CA")) {
                this.hang = "Castrol";
            } else if (this.hang.equals("MO")) {
                this.hang = "Mobil";
            }
        }
        this.thue = Math.round(sl * this.gia * this.thue);
        this.tong = (long) (this.thue + this.gia * this.sl);
    }

    public String toString() {
        return id + " " + hang + " " + gia + " " + (long) thue + " " + tong;
    }
}

public class J05067 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String[] s = sc.nextLine().split("\\s+");
            HangHoa x = new HangHoa(s[0], Long.parseLong(s[1]));
            System.out.println(x);
        }
    }
}
