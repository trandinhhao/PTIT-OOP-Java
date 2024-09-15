
import java.util.*;
//src/GiaoVien.java

class GiaoVien {

    private String ma;
    private String role;
    private int heSo;
    private String name;
    private int salary;
    private int phuCap;

    public GiaoVien(String ma, String name, int salary) {
        this.ma = ma;
        this.role = ma.substring(0, 2);
        this.heSo = Integer.parseInt(ma.substring(2));
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        if (this.role.equals("HT")) {
            this.phuCap = 2000000;
        } else if (this.role.equals("HP")) {
            this.phuCap = 900000;
        } else {
            this.phuCap = 500000;
        }
        int tmp = this.heSo * this.salary + this.phuCap;
        return this.ma + " " + this.name + " " + this.heSo + " " + (int) this.phuCap + " " + tmp;
    }
}

//src/J04015.java
public class J04015 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GiaoVien x = new GiaoVien(sc.nextLine(), sc.nextLine(), sc.nextInt());
        System.out.println(x);
    }
}
