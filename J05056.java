
import java.util.*;

class VanDongVien {

    private String id;
    private String ten;
    private String ns;
    private String start;
    private String uuTien;
    private String endTime;
    private String end;
    private int rank;
    private int total;

    public VanDongVien(int id, String ten, String ns, String start, String end) {
        this.id = "VDV" + String.format("%02d", id);
        this.ten = ten;
        this.ns = ns;
        this.start = start;
        this.end = end;
        String[] time = ns.split("/");
        int tuoi = 2021 - Integer.parseInt(time[2]);
        String[] timeEnd = end.split(":");
        int totalTimeEnd = Integer.parseInt(timeEnd[0]) * 3600 + Integer.parseInt(timeEnd[1]) * 60 + Integer.parseInt(timeEnd[2]);
        String[] timeStart = start.split(":");
        int totalTimeStart = Integer.parseInt(timeStart[0]) * 3600 + Integer.parseInt(timeStart[1]) * 60 + Integer.parseInt(timeStart[2]);
        totalTimeEnd -= totalTimeStart;
        int tmp = totalTimeEnd;
        //
        int gio1 = tmp / 3600;
        tmp %= 3600;
        int phut1 = tmp / 60;
        tmp %= 60;
        int giay1 = tmp;
        this.endTime = "" + gio1 + ":" + phut1 + ":" + giay1;
        //
        if (tuoi >= 32) {
            this.uuTien = "00:00:03";
            totalTimeEnd -= 3;
        } else if (tuoi >= 25) {
            this.uuTien = "00:00:02";
            totalTimeEnd -= 2;
        } else if (tuoi >= 18) {
            this.uuTien = "00:00:01";
            totalTimeEnd -= 1;
        } else {
            this.uuTien = "00:00:00";
        }
        this.total = totalTimeEnd;
        int gio = totalTimeEnd / 3600;
        totalTimeEnd %= 3600;
        int phut = totalTimeEnd / 60;
        totalTimeEnd %= 60;
        int giay = totalTimeEnd;
        this.end = "" + gio + ":" + phut + ":" + giay;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getTotal() {
        return total;
    }

    public String getId() {
        return id;
    }

    public int getRank() {
        return rank;
    }

    private String chuanHoa(String o) {
        StringBuilder sb = new StringBuilder("");
        String[] res = o.split(":");
        for (String i : res) {
            if (i.length() == 1) {
                sb.append(":0" + i);
            } else {
                sb.append(":" + i);
            }
        }
        return sb.toString().substring(1);
    }

    public String toString() {
        return id + " " + ten + " " + this.chuanHoa(this.endTime) + " " + uuTien + " " + this.chuanHoa(this.end) + " " + rank;
    }
}

public class J05056 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<VanDongVien> a = new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            VanDongVien x = new VanDongVien(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            a.add(x);
        }
        Collections.sort(a, new Comparator<VanDongVien>() {
            @Override
            public int compare(VanDongVien o1, VanDongVien o2) {
                return o1.getTotal() - o2.getTotal();
            }
        });
        a.get(0).setRank(1);
        int save = 1;
        for (int i = 1; i < t; i++) {
            if (a.get(i).getTotal() == a.get(i - 1).getTotal()) {
                a.get(i).setRank(save);
            } else {
                a.get(i).setRank(i + 1);
                save = i + 1;
            }
        }
        for (int i = 1; i <= t; i++) {
            for (VanDongVien x : a) {
                if (x.getRank() == i) {
                    System.out.println(x);
                }
            }
        }
    }
}
