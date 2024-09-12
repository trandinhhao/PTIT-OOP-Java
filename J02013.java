
import java.util.*;
import java.math.*;

public class J02013 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 1;i<n;i++) {
            boolean check = true;
            for (int j=0;j<n-i;j++) {
                if (a[j]>a[j+1]) {
                    check = false;
                    int tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                }
            }
            if (check) {
                break;
            }
            System.out.print("Buoc " + i + ": ");
            for (int x : a) {
                System.out.print(x + " ");
            }
            System.out.println("");
        }
    }
}
