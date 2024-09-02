
import java.util.*;
import java.math.*;

public class J03016 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- >0) {
            String s = sc.nextLine();
            int du = 0;
            for (char x : s.toCharArray()) {
                du = du *10 + x - '0';
                du %= 11;
            }
            if (du == 0) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        }
    }
}
