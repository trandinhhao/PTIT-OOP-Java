//src/J05033.java

import java.util.*;

public class J05033 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<Time> a = new ArrayList<>();
        while (t-- >0) {
            Time x = new Time(sc.nextLong(), sc.nextLong(), sc.nextLong());
            a.add(x);
        }
        Collections.sort(a, new Comparator<Time>(){
            public int compare(Time o1, Time o2) {
                long tmp1 = o1.getGio() * 3600 + o1.getPhut() * 60 + o1.getGiay();
                long tmp2 = o2.getGio() * 3600 + o2.getPhut() * 60 + o2.getGiay();
                if (tmp1 > tmp2) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });
        for (Time x : a) {
            System.out.println(x);
        }
    }
}
//src/Time.java

class Time {
    private long gio;
    private long phut;
    private long giay;

    public Time(long gio, long phut, long giay) {
        this.gio = gio;
        this.phut = phut;
        this.giay = giay;
    }

    public long getGio() {
        return gio;
    }

    public long getPhut() {
        return phut;
    }

    public long getGiay() {
        return giay;
    }
    public String toString() {
        return this.gio + " " + this.phut + " " + this.giay;
    }
}

