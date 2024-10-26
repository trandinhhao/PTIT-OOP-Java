
import java.util.Arrays;
import java.util.Scanner;

public class J02102 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n*n];
        for (int i = 0; i < n * n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int pos = 0;
        int hang1 = 0;
        int hang2 = n - 1;
        int cot1 = 0;
        int cot2 = n - 1;
        int[][] b = new int[1000][1000];
        while (hang1 <= hang2 && cot1 <= cot2) {
            for (int i = cot1; i <= cot2; i++) {
                b[hang1][i] = a[pos];
                pos++;
            }
            hang1++;
            for (int i = hang1; i <= hang2; i++) {
                b[i][cot2] = a[pos];
                pos++;
            }
            cot2--;
            for (int i = cot2; i >= cot1; i--) {
                b[hang2][i] = a[pos];
                pos++;
            }
            hang2--;
            for (int i = hang2; i >= hang1; i--) {
                b[i][cot1] = a[pos];
                pos++;
            }
            cot1++;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
