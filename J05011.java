
import java.util.*;

class Gamer {

    private String m;
    private String t;
    private String gv;
    private String gr;

    public Gamer(String m, String t, String gv, String gr) {
        this.m = m;
        this.t = t;
        this.gv = gv;
        this.gr = gr;
    }

    public String getGv() {
        return gv;
    }

    public String getGr() {
        return gr;
    }

    public String toString() {
        int gioVao2 = Integer.parseInt(this.getGv().substring(0, 2)) * 60;
        int phutVao2 = Integer.parseInt(this.getGv().substring(3, 5));
        int gioRa2 = Integer.parseInt(this.getGr().substring(0, 2)) * 60;
        int phutRa2 = Integer.parseInt(this.getGr().substring(3, 5));
        int phut = gioRa2 + phutRa2 - gioVao2 - phutVao2;
        int gio = phut / 60;
        phut %= 60;
        return this.m + " " + this.t + " " + gio + " " + "gio " + phut + " phut";
    }
}

public class J05011 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<Gamer> a = new ArrayList<>();
        while (t-- > 0) {
            Gamer x = new Gamer(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            a.add(x);
        }
        Collections.sort(a, new Comparator<Gamer>() {
            @Override
            public int compare(Gamer o1, Gamer o2) {
                int gioVao1 = Integer.parseInt(o1.getGv().substring(0, 2)) * 60;
                int phutVao1 = Integer.parseInt(o1.getGv().substring(3, 5));
                int gioRa1 = Integer.parseInt(o1.getGr().substring(0, 2)) * 60;
                int phutRa1 = Integer.parseInt(o1.getGr().substring(3, 5));
                //
                int gioVao2 = Integer.parseInt(o2.getGv().substring(0, 2)) * 60;
                int phutVao2 = Integer.parseInt(o2.getGv().substring(3, 5));
                int gioRa2 = Integer.parseInt(o2.getGr().substring(0, 2)) * 60;
                int phutRa2 = Integer.parseInt(o2.getGr().substring(3, 5));
                //
                return (gioRa2 + phutRa2 - gioVao2 - phutVao2) - (gioRa1 + phutRa1 - gioVao1 - phutVao1);
            }
        });
        for (Gamer x : a) {
            System.out.println(x);
        }
    }
}
