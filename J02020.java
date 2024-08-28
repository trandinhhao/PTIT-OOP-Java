
import java.util.*;
import java.math.*;

public class J02020 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        int[] a = new int[k];
        for (int i = 0; i < k; i++) {
            a[i] = i+1;
        }
        int cnt = 0;
        while (true) {
            cnt ++;
            for (int x : a) {
                System.out.print(x + " ");
            }
            System.out.println("");
            int i = k - 1;
            while (i >= 0 && a[i] == n - k + i + 1) {
                i--;
            }
            if (i == -1) {
                break;
            }
            a[i]++;
            for (int j = i+1;j< k;j++) {
                a[j] = a[j-1] + 1;
            }
        }
        System.out.println("Tong cong co " + cnt + " to hop");
    }
}
