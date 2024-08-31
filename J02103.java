
import java.util.*;
import java.math.*;

public class J02103 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int x = 1; x <= t; x++) {
            int n = sc.nextInt(), m = sc.nextInt();
            int[][] a = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    a[i][j] = sc.nextInt();
                }
            }
            int[][] c = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    c[i][j] = 0;
                    for (int k = 0; k < m; k++) {
                        c[i][j] += a[i][k] * a[j][k];
                    }
                }
            }
            System.out.println("Test " + x +":");
            for (int i =0 ;i<n;i++) {
                for (int j = 0;j<n;j++) {
                    System.out.print(c[i][j] + " ");
                }
                System.out.println("");
            }
        }
    }
}
