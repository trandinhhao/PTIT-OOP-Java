
import java.util.*;

public class J01025 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[10][10];
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= 4; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int xDuoi = Math.min(a[1][1], a[2][1]);
        int yDuoi = Math.min(a[1][2], a[2][2]);
        int xTren = Math.max(a[1][3], a[2][3]);
        int yTren = Math.max(a[1][4], a[2][4]);
        int tmp = Math.max((xTren - xDuoi), (yTren - yDuoi));
        System.out.println(tmp * tmp);
    }
}
