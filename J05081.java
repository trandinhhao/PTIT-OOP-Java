//src/J05081.java

import java.util.*;


public class J05081 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<MatHang> a = new ArrayList<>();
        for (int i =1;i<=t;i++) {
            sc.nextLine();
            MatHang x = new MatHang(i, sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt());
            a.add(x);
        }
        Collections.sort(a, new Comparator<MatHang>(){
            @Override
            public int compare(MatHang o1, MatHang o2) {
                int tmp1 = o1.getGiaBan() - o1.getGiaMua();
                int tmp2 = o2.getGiaBan() - o2.getGiaMua();
                if (tmp1 > tmp2) {
                    return -1;
                } else {
                    return 1;
                }
            }
        });
        for (MatHang x : a) {
            System.out.println(x);
        }
    }
}

//src/MatHang.java

class MatHang {
    private String id;
    private String name;
    private String unit;
    private int giaMua;
    private int giaBan;

    public MatHang(int id, String name, String unit, int giaMua, int giaBan) {
        this.id = "MH" + String.format("%03d", id);
        this.name = name;
        this.unit = unit;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
    }

    public int getGiaMua() {
        return giaMua;
    }

    public int getGiaBan() {
        return giaBan;
    }
    
    
    public String toString() {
        return this.id + " " + this.name + " " + this.unit + " " + this.giaMua + " " + this.giaBan + " " + (this.giaBan - this.giaMua);
    }
}

