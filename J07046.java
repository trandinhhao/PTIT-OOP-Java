
import java.io.*;
import java.util.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

class Info {

    private String name, id, start, end;
    private long cnt;
    private String mkh;

    public Info(int mkh, String name, String id, String start, String end) throws ParseException {
        this.mkh = "KH" + String.format("%02d", mkh);
        this.name = name;
        this.id = id;
        this.start = start;
        this.end = end;
        //
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date st = sdf.parse(start);
        Date en = sdf.parse(end);
        //
        long x = Math.abs(en.getTime() - st.getTime()); // tinh ra mili giay
        this.cnt = TimeUnit.DAYS.convert(x, TimeUnit.MILLISECONDS); // chuyen tu giay sang ngay
    }

    public long getCnt() {
        return cnt;
    }

    public String toString() {
        return mkh + " " + name + " " + id + " " + cnt;
    }
}

public class J07046 {

    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("KHACH.in"));
//        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<Info> a = new ArrayList<>();
        sc.nextLine();
        for (int i = 1; i <= t; i++) {
            Info x = new Info(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            a.add(x);
        }
        Collections.sort(a, new Comparator<Info>() {
            @Override
            public int compare(Info o1, Info o2) {
                if (o1.getCnt() > o2.getCnt()) {
                    return -1;
                } else {
                    return 1;
                }
            }
        });
        for (Info x : a) {
            System.out.println(x);
        }
    }
}
