
import java.util.*;

class Club {

    private String id, name;
    private long cost;

    public Club(String id, String name, long cost) {
        this.id = id;
        this.name = name;
        this.cost = cost;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public long getCost() {
        return cost;
    }
}

public class J05069 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<Club> a = new ArrayList<>();
        while (t-- > 0) {
            Club x = new Club(sc.nextLine(), sc.nextLine(), sc.nextInt());
            a.add(x);
            sc.nextLine();
        }
        int n = sc.nextInt();
        sc.nextLine();
        while (n-- > 0) {
            String[] s = sc.nextLine().split("\\s+");
            for (Club x : a) {
                if (x.getId().equals(s[0].substring(1, 3))) {
                    System.out.println(s[0] + " " + x.getName() + " " + String.valueOf(x.getCost() * Long.parseLong(s[1])));
                }
            }
        }
    }
}
