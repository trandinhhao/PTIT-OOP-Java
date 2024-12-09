
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

class Match {

    private String id, name;
    private long total;

    public Match(String id, String name, long total) {
        this.id = id;
        this.name = name;
        this.total = total;
    }

    public long getTotal() {
        return total;
    }

    public Match(String name) {
        this.name = name;
    }

    public String toString() {
        return id + " " + name + " " + total;
    }
}

public class J05070 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<Club> a = new ArrayList<>();
        ArrayList<Match> b = new ArrayList<>();
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
                    Match i = new Match(s[0], x.getName(), x.getCost() * Long.parseLong(s[1]));
                    b.add(i);
                }
            }
        }
        Collections.sort(b, new Comparator<Match>() {
            @Override
            public int compare(Match o1, Match o2) {
                if (o1.getTotal() > o2.getTotal()) {
                    return -1;
                } else {
                    return 1;
                }
            }
        });
        for (Match x : b) {
            System.out.println(x);
        }
    }
}
