
import java.util.*;

class People {

    private String ten, ns;

    public People(String ten, String ns) {
        this.ten = ten;
        this.ns = ns;
    }

    public String getTen() {
        return ten;
    }

    public String getNs() {
        return ns;
    }

}

public class J05032 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<People> a = new ArrayList<>();
        while (t-- > 0) {
            String tmp = sc.nextLine();
            String[] b = tmp.split("\\s+");
            People x = new People(b[0], b[1]);
            a.add(x);
        }
        Collections.sort(a, new Comparator<People>() {
            @Override
            public int compare(People o1, People o2) {
                int d1 = Integer.parseInt(o1.getNs().substring(0, 2));
                int m1 = Integer.parseInt(o1.getNs().substring(3, 5));
                int y1 = Integer.parseInt(o1.getNs().substring(6, 10));
                int d2 = Integer.parseInt(o2.getNs().substring(0, 2));
                int m2 = Integer.parseInt(o2.getNs().substring(3, 5));
                int y2 = Integer.parseInt(o2.getNs().substring(6, 10));
                if (y1 != y2) {
                    return y1 - y2;
                } else if (m1 != m2) {
                    return m1 - m2;
                } else {
                    return d1 - d2;
                }
            }
        });
        System.out.println(a.get(a.size() - 1).getTen());
        System.out.println(a.get(0).getTen());
    }
}
