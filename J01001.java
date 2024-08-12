
import java.util.*;

public class J01001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        if (a<=0 || b<=0) {
            System.out.println(0);
            return ;
        }
        System.out.print(2*(a+b));
        System.out.print(" ");
        System.out.print(a*b);
    }
}
