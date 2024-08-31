
import java.util.*;
import java.math.*;

public class J02014 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int tongTrai = 0;
            int tongPhai = 0;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                tongPhai += a[i];
            }
            tongPhai -= a[0] + a[1];
            tongTrai = a[0];
            int i = 1;
            boolean check = false;
            while (i<n-1) {
                if (tongTrai == tongPhai) {
                    check = true;
                    break;
                }
                i++;
                tongTrai+= a[i-1];
                tongPhai-= a[i];
            }
            if (check) {
                System.out.println(i+1);
            } else {
                System.out.println(-1);
            }
        }
    }
}
